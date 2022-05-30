plugins {
    java
}

group = "de.fhdo.lemma.examples.model_processing"
version = "0.8.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven {
        // Repository of LEMMA artifacts
        url = uri("https://repository.seelab.fh-dortmund.de/repository/maven-public/")
    }
}

/**
 * Dependencies. Note that the versions of the LEMMA-specific dependencies are pinned to exact versions prior to the
 * refactoring of LEMMA's model processing framework.
 */
dependencies {
    // Dependency for LEMMA's model processing framework. Note the "all-dependencies" classifier, which points to a
    // convenience fat JAR of the framework that comprises all necessary dependencies.
    implementation("de.fhdo.lemma.model_processing:de.fhdo.lemma.model_processing:0.8.0-20210802.164544-33:" +
        "all-dependencies")

    // Dependencies to LEMMA's Service Modeling Language and its metamodel. These dependencies are needed by the example
    // model processor to support parsing of service models in their "source form", i.e., as they were constructed with
    // the Eclipse IDE within files having the ".services" extension.
    implementation("de.fhdo.lemma.servicedsl:de.fhdo.lemma.servicedsl:0.8.0-20210802.163950-33")
    implementation("de.fhdo.lemma.servicedsl:de.fhdo.lemma.servicedsl.metamodel:0.8.0-20210802.163903-33")

    // Dependencies to LEMMA's Domain Data Modeling Language and its metamodel. These dependencies are also needed by
    // the example model processor to support parsing of service models. That is, because the Service Modeling Language
    // draws on the type system provided by the Domain Data Modeling Language.
    implementation("de.fhdo.lemma.data.datadsl:de.fhdo.lemma.data.datadsl:0.8.0-20210802.163714-33")
    implementation("de.fhdo.lemma.data.datadsl:de.fhdo.lemma.data.datadsl.metamodel:0.8.0-20210802.163636-33")

    // Dependencies for the intermediate specification for LEMMA service models. These dependencies are needed by the
    // example model processor to support parsing of intermediate service models. Note that we also require the
    // intermediate specification for LEMMA domain models, because the intermediate specification for LEMMA service
    // models draws on the type system provided by the intermediate specification for LEMMA domain models.
    implementation("de.fhdo.lemma.intermediate:de.fhdo.lemma.data.intermediate.metamodel:0.8.0-20210802.164411-33")
    implementation("de.fhdo.lemma.intermediate:de.fhdo.lemma.service.intermediate.metamodel:0.8.0-20210802.164412-33")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.withType<AbstractArchiveTask> {
    archiveVersion.set("")
    setProperty("duplicatesStrategy", DuplicatesStrategy.EXCLUDE)
}

/**
 * standalone task to create a standalone runnable JAR of the example model processor
 */
val standalone = task("standalone", type = Jar::class) {
    archiveClassifier.set("standalone")

    // Build fat JAR
    from(configurations.compileClasspath.get().filter{ it.exists() }.map { if (it.isDirectory) it else zipTree(it) })
    with(tasks["jar"] as CopySpec)

    manifest {
        attributes("Main-Class" to "de.fhdo.lemma.examples.model_processing.ExampleModelProcessor")

        // Prevent security exception from JAR verifier
        exclude("META-INF/*.DSA", "META-INF/*.RSA", "META-INF/*.SF")
    }
}

tasks.getByName<Jar>("jar") {
    finalizedBy(standalone)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
package de.fhdo.lemma.data.diagram.utils

import de.fhdo.lemma.data.DataField
import de.fhdo.lemma.data.DataOperation
import de.fhdo.lemma.data.DataStructure
import de.fhdo.lemma.data.Enumeration
import de.fhdo.lemma.data.EnumerationField
import de.fhdo.lemma.data.ListType
import java.util.Set
import java.util.concurrent.ConcurrentHashMap
import java.util.function.Function
import org.eclipse.emf.ecore.EObject
import java.util.function.Predicate

class DataDslUtils {
	static def fullId(EnumerationField field) {
		field.eContainer.fullId + "_" + field.name
	}

	static def fullId(DataOperation operation) {
		operation.eContainer.fullId + "_" + operation.name
	}

	static def fullId(DataField field) {
		field.eContainer.fullId + "_" + field.name
	}

	static def fullId(EObject type) {
		switch (type) {
			DataStructure: type.buildQualifiedName("_")
			ListType: type.buildQualifiedName("_")
			Enumeration: type.buildQualifiedName("_")
		}
	}

	/**
	 * Filters a list to only keep distinct elements. Uniqueness is determined by the 
	 * passed lambda function instead of by the equals() method
	 * 
	 * From https://stackoverflow.com/questions/23699371/java-8-distinct-by-property
	 */
	static def <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		val Set<Object> seen = ConcurrentHashMap.newKeySet();
		return [seen.add(keyExtractor.apply(it))]
	}
}

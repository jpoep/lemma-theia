/*
 * generated by Xtext 2.25.0
 */
package de.fhdo.lemma.technology.mappingdsl.validation;

import de.fhdo.lemma.validation.ServiceDslValidator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractMappingDslValidator extends ServiceDslValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(EPackage.Registry.INSTANCE.getEPackage("de.fhdo.lemma.technology.mapping"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("de.fhdo.lemma.service"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("de.fhdo.lemma.technology"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("de.fhdo.lemma.data"));
		return result;
	}
}
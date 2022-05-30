package de.fhdo.lemma.typechecking

import de.fhdo.lemma.data.Type
import de.fhdo.lemma.data.PrimitiveType
import de.fhdo.lemma.data.ComplexType
import de.fhdo.lemma.typechecking.complex_types.ComplexTypeChecker
import de.fhdo.lemma.typechecking.primitive_types.PrimitiveTypeChecker
import de.fhdo.lemma.typechecking.technology_specific.MatrixBasedTypeChecker

/**
 * Generic type checker that uses the corresponding TypeCheckers for the given Type instances to
 * check.
 *
 * @author <a href="mailto:florian.rademacher@fh-dortmund.de">Florian Rademacher</a>
 */
class TypeChecker {
    def checkTypeCompatibility(Type basicType, Type typeToCheck)
        throws TypesNotCompatibleException {
        if (basicType === null || typeToCheck === null)
            throw new IllegalArgumentException("None of the arguments must be null")

        /*
         * Try technology-specific type checking first, in case the compatibility of both types is
         * defined in a compatibility matrix. That is, both types are compatible "by definition" and
         * no further checks are necessary.
         */
        if (TypecheckingUtils.isTechnologySpecific(typeToCheck)) {
            var technologySpecificBasicType = basicType
            // If the basic type, i.e, the original parameter's type, is not technology-specific
            // but a primitive type, try to retrieve the default technology-specific type mapping.
            // If such a mapping exists, use the technology-specific mapping to query the
            // compatibility matrix.
            if (!TypecheckingUtils.isTechnologySpecific(technologySpecificBasicType) &&
                technologySpecificBasicType instanceof PrimitiveType) {
                val technology = TypecheckingUtils.getTechnology(typeToCheck)
                technologySpecificBasicType = TypecheckingUtils
                    .findDefaultTechnologySpecificPrimitiveType(technology,
                        technologySpecificBasicType as PrimitiveType)
            }

            if (TypecheckingUtils.isTechnologySpecific(technologySpecificBasicType)) {
                val matrixBasedChecker = new MatrixBasedTypeChecker()
                if (matrixBasedChecker.compatible(typeToCheck, technologySpecificBasicType))
                    return true
            }
        }

        /*
         * Determine type checker to use, if both types aren't technology-specific or do not have
         * their compatibility defined by a technology-specific compatibility matrix. Perform check
         * leveraging the determined type checker.
         */
        var TypeCheckerI typeChecker = null
        // PrimitiveType
        if (basicType instanceof PrimitiveType && typeToCheck instanceof PrimitiveType)
            typeChecker = new PrimitiveTypeChecker
        // ComplexType
        else if (basicType instanceof ComplexType && typeToCheck instanceof ComplexType)
            typeChecker = new ComplexTypeChecker
        // Basic type and type to check differ, and checking is hence not possible
        else
            throw new TypesNotCompatibleException(basicType.class.name, typeToCheck.class.name)

        performTypeCheck(typeChecker, basicType, typeToCheck)
    }

    /**
     * Perform the actual type checking with the given type checker
     */
    private def performTypeCheck(TypeCheckerI typeChecker, Type basicType, Type typeToCheck)
        throws TypesNotCompatibleException {
        var Boolean typesCompatible = null

        try {
            typesCompatible = typeChecker.compatible(basicType, typeToCheck)
        // In case the compatibility check might fail unexpectedly. Might be removed in the future,
        // when checker implementations got properly tested.
        } catch(Exception ex) {
            ex.printStackTrace
        }

        if (typesCompatible !== null && !typesCompatible)
            throw new TypesNotCompatibleException(typeChecker.typeName(basicType),
                typeChecker.typeName(typeToCheck))
    }
}
package de.fhdo.lemma.data.diagram.utils;

import de.fhdo.lemma.data.DataField;
import de.fhdo.lemma.data.DataOperation;
import de.fhdo.lemma.data.DataStructure;
import de.fhdo.lemma.data.Enumeration;
import de.fhdo.lemma.data.EnumerationField;
import de.fhdo.lemma.data.ListType;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class DataDslUtils {
  public static String fullId(final EnumerationField field) {
    String _fullId = DataDslUtils.fullId(field.eContainer());
    String _plus = (_fullId + "_");
    String _name = field.getName();
    return (_plus + _name);
  }
  
  public static String fullId(final DataOperation operation) {
    String _fullId = DataDslUtils.fullId(operation.eContainer());
    String _plus = (_fullId + "_");
    String _name = operation.getName();
    return (_plus + _name);
  }
  
  public static String fullId(final DataField field) {
    String _fullId = DataDslUtils.fullId(field.eContainer());
    String _plus = (_fullId + "_");
    String _name = field.getName();
    return (_plus + _name);
  }
  
  public static String fullId(final EObject type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof DataStructure) {
      _matched=true;
      _switchResult = ((DataStructure)type).buildQualifiedName("_");
    }
    if (!_matched) {
      if (type instanceof ListType) {
        _matched=true;
        _switchResult = ((ListType)type).buildQualifiedName("_");
      }
    }
    if (!_matched) {
      if (type instanceof Enumeration) {
        _matched=true;
        _switchResult = ((Enumeration)type).buildQualifiedName("_");
      }
    }
    return _switchResult;
  }
  
  /**
   * Filters a list to only keep distinct elements. Uniqueness is determined by the
   * passed lambda function instead of by the equals() method
   * 
   * From https://stackoverflow.com/questions/23699371/java-8-distinct-by-property
   */
  public static <T extends Object> Predicate<T> distinctByKey(final Function<? super T, ?> keyExtractor) {
    final Set<Object> seen = ConcurrentHashMap.<Object>newKeySet();
    final Predicate<T> _function = (T it) -> {
      return seen.add(keyExtractor.apply(it));
    };
    return _function;
  }
}

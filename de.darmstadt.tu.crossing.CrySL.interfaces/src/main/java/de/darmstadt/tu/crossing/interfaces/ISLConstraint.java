package de.darmstadt.tu.crossing.interfaces;

import java.util.Set;


public interface ISLConstraint extends java.io.Serializable, ICrySLPredicateParameter {

	public Set<String> getInvolvedVarNames(); 

}

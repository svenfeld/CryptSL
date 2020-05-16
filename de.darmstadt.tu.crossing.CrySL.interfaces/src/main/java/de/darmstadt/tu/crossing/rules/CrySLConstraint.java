package de.darmstadt.tu.crossing.rules;

import java.io.Serializable;
import java.util.Set;

import de.darmstadt.tu.crossing.interfaces.ISLConstraint;

public class CrySLConstraint implements ISLConstraint, Serializable{
	
	private static final long serialVersionUID = 1L;

	public enum LogOps { and , or , implies , eq}
	
	private LogOps operator;
	private ISLConstraint left;
	private ISLConstraint right;

	public CrySLConstraint(ISLConstraint l, ISLConstraint r, LogOps op) {
		left = l;
		right = r;
		operator = op;
	}
	
	/**
	 * @return the operator
	return operator;
	 */
	public LogOps getOperator() {
		return operator;
	}

	/**
	 * @return the left
	 */
	public ISLConstraint getLeft() {
		return left;
	}
	
	/**
	 * @return the right
	 */
	public ISLConstraint getRight() {
		return right;
	}

	public String toString() {
		StringBuilder constraintSB = new StringBuilder();
		constraintSB.append(left.toString());
		constraintSB.append(operator);
		constraintSB.append(right.toString());
		return constraintSB.toString();
	}

	@Override
	public Set<String> getInvolvedVarNames() {
		Set<String> varNames = left.getInvolvedVarNames();
		varNames.addAll(right.getInvolvedVarNames());
		return varNames;
	}

	@Override
	public String getName() {
		return toString();
	}



}

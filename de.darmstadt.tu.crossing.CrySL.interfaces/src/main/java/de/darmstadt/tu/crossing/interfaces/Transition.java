package de.darmstadt.tu.crossing.interfaces;

import java.util.List;
import de.darmstadt.tu.crossing.rules.CrySLMethod;


public interface Transition<State>{
	State from();
	State to();
	List<CrySLMethod> getLabel();
}
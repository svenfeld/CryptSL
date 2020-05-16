package de.darmstadt.tu.crossing.rules;

import java.io.File;
import java.net.MalformedURLException;
import de.darmstadt.tu.crossing.handler.Parser;

public class CrySLRuleReader {
	private static Parser csmr;
	
	public static CrySLRule readFromSourceFile(File file) {
		if(csmr == null)
			try {
				csmr = new Parser();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		return csmr.readRule(file);
	}
	
}

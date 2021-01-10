package com.juan.javafundamentos.fundamentos.regularexpressions;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class PatternsExamples {
	
	private static final Logger logger = Logger.getLogger(PatternsExamples.class);
	
	public static void checkWord() {
		
		Pattern pattern = Pattern.compile("honou?r");
		
		String caesarUK = "For Brutus is a honourable man";
		Matcher matcherUK = pattern.matcher(caesarUK);
		
		String caesarUS = "For Brutus is a honourable man";
		Matcher matcherUS = pattern.matcher(caesarUS);
		
		logger.info("UK: "+ matcherUK.find());
		logger.info("US: "+ matcherUS.find());
		
		System.out.println("UK: " +matcherUK.find());
		System.out.println("US: " +matcherUS.find());
	}

}

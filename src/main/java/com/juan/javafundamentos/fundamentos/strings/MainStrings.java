package com.juan.javafundamentos.fundamentos.strings;

import org.apache.log4j.Logger;

public class MainStrings {
	
	private static final Logger logger = Logger.getLogger(MainStrings.class);

	public static void main(String[] args) {

//		try {
//			StringsExercises.substringExerc("Va");
//		}catch(StringIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
		
//		StringsExercises.splitExerc("Va por la vida caminando como los patos");
		
//		try {
//			StringsExercises.stringTokenizerExerc1("Vuelvo a casa por nochebuena");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//
//		StringsExercises.stringTokenizerExerc2("Era un día de verano, pero, estudiando la situación, no iba a ser agradable", ", ");
//		
//		StringsExercises.printResultsTokenizer("A|B|C|D", StringsExercises.stringTokenizerExerc3("A|B|C|D|E|F"));
		
//		StringsExercises.extractNumbersPattern("kjll3lj2ñlkj6");
		
		StringsExercises.stringBuilderExerc("Guía", "para", "aficionados");
	}

}

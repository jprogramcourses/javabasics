package com.juan.javafundamentos.fundamentos.strings;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class StringsExercises {
	
	private static final Logger logger = Logger.getLogger(StringsExercises.class);
	
	public final static int MAXFIELDS = 5;
	public final static String DELIM = "|";
	
	
	public static void substringExerc(String str) throws StringIndexOutOfBoundsException {
		
		String a = str.substring(3);
		System.out.println(a);
		
	}
	
	public static void splitExerc(String str) {
		for(String word : str.split(" ")) {
			System.out.println(word);
		}
	}
	
	public static void stringTokenizerExerc1(String str) throws NoSuchElementException {
		StringTokenizer stTok = new StringTokenizer(str);
		
		while(stTok.hasMoreTokens()) {
			try {
				System.out.println("Token: " + stTok.nextToken());
				System.out.println("Next element: " + stTok.nextElement());
			}catch(NoSuchElementException e) {
				throw e;
			}
			
		}
	}
	
	/*
	 *  StringTokenizer toma como separador por defecto los espacios
	 */
	public static void stringTokenizerExerc2(String str, String delim) {
		StringTokenizer stTok = new StringTokenizer(str, delim, true);
		
		while(stTok.hasMoreElements()) {
			System.out.println("Element: " + stTok.nextElement());
		}
		
//		while(stTok.hasMoreTokens()) {
//			System.out.println("Token: " + stTok.nextToken());
//		}
	}
	
	public static String[] stringTokenizerExerc3(String str) {
		String[] results = new String[MAXFIELDS];
		
		StringTokenizer stTok = new StringTokenizer(str, DELIM, true);
		
		int i = 0;
		while(stTok.hasMoreTokens()) {
			String s = stTok.nextToken();
			if(DELIM.equals(s)) {
				if(i++ >= MAXFIELDS) {
					throw new IllegalArgumentException("Input string " + str + "has too many fields");
				}
				continue;
			}
			results[i] = s;
		}
		return results;
	}
	
	public static void printResultsTokenizer(String input, String[] outputs) {
		System.out.println("Input " + input);
		for(String s : outputs) {
			System.out.println("Output: " + s + " was: " + s);
		}
	}
	
	public static void extractNumbersPattern(String str) {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher tokenizer = pattern.matcher(str);
		while(tokenizer.find()) {
			String courseString = tokenizer.group(0);
			int courseNumber = Integer.parseInt(courseString);
			System.out.println("Course number: " + courseNumber);
		}
	}
	
	public static void stringBuilderExerc(String str1, String str2, String str3) {
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.append(StringUtils.SPACE);
		sb.append(str2);
		sb.append(StringUtils.SPACE);
		sb.append(str3);
		
		System.out.println("StringBuilder " + sb);
		
		logger.info(sb.toString());
	}

}

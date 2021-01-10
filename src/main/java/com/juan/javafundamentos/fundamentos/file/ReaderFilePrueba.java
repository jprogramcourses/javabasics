package com.juan.javafundamentos.fundamentos.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classes that overlay the byte stream classes. Subclasses of Reader and Writer are:
 * <ul>
 * <li>FileReader</li>
 * <li>BufferedReader</li>
 * <li>InputStreamReader</li>
 * <li>FileWriter</li>
 * <li>PrintWriter</li>
 * <li>BufferedWriter</li>
 * </ul>
 *
 * 
 * @author juand
 *
 */
public class ReaderFilePrueba {
	
	/**
	 * Read all lines from the console.
	 */
	public static void readAllLinesFromConsole() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println("Line console: " + line);
				if("".equals(line)) {
					return;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Read all lines in from a file with BufferedReader
	 */
	public static void readAllLinesFromFile(String file) {
		try(BufferedReader br = new BufferedReader(new FileReader(new File(file)))){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println("Line file: " + line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

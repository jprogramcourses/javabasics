package com.juan.javafundamentos.fundamentos.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

import javax.naming.directory.Attributes;


/**
 * Test with methods of java.nio, introduce from Java 7
 * 
 * @author juand
 *
 */
public class JavaNioPrueba {
	
	private static String HOME = System.getProperty("user.home");
	
	Path source, target;
//	FileAttribute<T> attr;
	Charset cs = StandardCharsets.UTF_8;
	
	public static void retrieveHomeDirectory() {
		System.out.println("Home directory: " + HOME);
	}
	
	public static boolean checkIfFileExists(String path) {
		Path filePath = Paths.get(path);
		
//		Files.notExists(filePath);
		return Files.exists(filePath);
	}
	
	// Creating files
	// path --> C:\programacion\java
	public void createFile() {
		target = Paths.get("C:\\programacion\\java");
		
//		Files.createFile(target, attr);
	}
	
	public static void copyFile(String fileName) {
		
		File inputFile = new File(fileName);
		
		try(InputStream is = new FileInputStream(inputFile)){
			Files.copy(is, Paths.get("copy_".concat(inputFile.getName())));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}

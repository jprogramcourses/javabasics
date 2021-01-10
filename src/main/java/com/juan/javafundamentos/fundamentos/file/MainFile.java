package com.juan.javafundamentos.fundamentos.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class MainFile {
	
	private static final String FICHERO_EJEMPLO = "prueba.txt";
	private static final String IMAGEN_EJEMPLO = "imagen.png";

	public static void main(String[] args) {

//		File pruebaFile = new File("prueba.txt");
//		try(BufferedWriter bw = new BufferedWriter(new PrintWriter(pruebaFile))) {
//			bw.append("Hola");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		readFile();
//		copyImageFile();
		
//		ReaderFilePrueba.readAllLinesFromConsole();
//		ReaderFilePrueba.readAllLinesFromFile(FICHERO_EJEMPLO);
		
//		JavaNioPrueba.copyFile(IMAGEN_EJEMPLO);
		
		JavaNioPrueba.retrieveHomeDirectory();
		if(JavaNioPrueba.checkIfFileExists("C:/programacion/java/fundamentos/pruebaFile.txt")) {
			System.out.println("El fichero existe");
		}else {
			System.out.println("El fichero no existe");
		}

	}
	
	/**
	 * Leer un fichero
	 */
	private static void readFile() {
		File archivoLectura = new File(FICHERO_EJEMPLO);
		try(BufferedReader br = new BufferedReader(new FileReader(archivoLectura))){
			String linea = br.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Leer un fichero e identificar las as.
	 */
	private static void readFileIdentifyA() {
		try(InputStream is = new FileInputStream(FICHERO_EJEMPLO)){
			byte[] buf = new byte[4096];
			int len, count = 0;
			while((len = is.read(buf)) > 0) {
				for(int i = 0; i < len; i++) {
					if(buf[i] == 97)
						count++;
				}
				System.out.println("'a' seen: " + count);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Copiar un archivo de tipo imagen
	 */
	private static void copyImageFile() {
		
		File imagen = new File("imagen.png");
		
		try {
			byte[] imageContent = Files.readAllBytes(imagen.toPath());
			
			System.out.println("Length imageContent: " + imageContent.length);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

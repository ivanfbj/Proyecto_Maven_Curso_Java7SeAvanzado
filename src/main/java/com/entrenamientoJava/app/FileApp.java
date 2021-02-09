package com.entrenamientoJava.app;

import java.io.File;
import java.io.IOException;

public class FileApp {

	public static void main(String[] args) throws IOException {

		File f = new File("mitocode.txt");

		if (!f.exists()) {
			f.createNewFile();
			System.out.println("Archivo creado con el nombre " + f.getName());
		} else {
			System.out.println("El archivo ya existe");
		}
		
		System.out.println("El archivo está oculto TRUE o FALSE: " + f.isHidden());

		System.out.println("//////////////////////////////////////////////////////");
		
		File f1 = new File("Archivos");
		
		File f2 = new File("Archivos","mitocodeDesdeArchivos.txt");
		System.out.println(f2.createNewFile());
				
		System.out.println("////////////////////////Para crear carpeta//////////////////////////////");
		
		File f3 = new File("Archivos","SubArchivos");
		System.out.println(f3.mkdir());
		
		System.out.println("////////////////////////Constructor con parametros de Ruta y nombre de archivo//////////////////////////////");
		File f4 = new File(f1, "OtroArchivo.txt");
		System.out.println(f4.createNewFile());
	}

}

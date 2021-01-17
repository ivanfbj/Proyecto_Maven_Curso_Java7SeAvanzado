package com.entrenamientoJava.app;

import java.io.ObjectOutput;
import java.util.ArrayList;

public class AppWild {
	
	public void listarUpperBounded(ArrayList<? extends Persona> lista) {
		for (Persona per : lista) {
			System.out.println(per.getNombre());
		}
	}

	public void listarLowerBounded(ArrayList<? super Alumno> lista) {
		for(Object al : lista) {
			System.out.println(((Persona)al).getNombre());
		}
	}
	
	public void listarUnBounded(ArrayList<?> lista) {
		for(Object al : lista) {
			System.out.println(((Persona)al).getNombre());
		}
	}

	
	public static void main(String[] args) {
		AppWild aw = new AppWild();
		
		Persona al1 = new Profesor("MITOCODE");
		Persona al2 = new Profesor("JAIME");
		Persona al3 = new Profesor("MITO");
		
		ArrayList<Persona> lista = new ArrayList<>();
		lista.add(al1);
		lista.add(al2);
		lista.add(al3);
		
		aw.listarUpperBounded(lista);
		System.out.println("");
		aw.listarLowerBounded(lista);
		System.out.println("");
		aw.listarUnBounded(lista);
	}
	
}

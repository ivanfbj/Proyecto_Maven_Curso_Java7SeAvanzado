package com.entrenamientoJava.app;

import java.util.Set;

public class LinkedHashSet {

	public static void main(String[] args) {

		Set<Persona> listaObjetos = new java.util.LinkedHashSet<>();

		listaObjetos.add(new Persona(1, "MitoCode", 22));
		listaObjetos.add(new Persona(2, "Code", 23));
		listaObjetos.add(new Persona(3, "Mito", 24));
		listaObjetos.add(new Persona(4, "Jaime", 30));
		listaObjetos.add(new Persona(3, "Mito", 24));
		listaObjetos.add(new Persona(6, "AAA", 27));

		for (Persona persona : listaObjetos) {
			System.out.println(persona.getId() + " - " + persona.getNombre() + " - " + persona.getEdad());
		}

	}

}

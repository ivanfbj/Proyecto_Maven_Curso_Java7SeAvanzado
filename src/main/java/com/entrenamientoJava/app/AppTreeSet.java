package com.entrenamientoJava.app;

import java.util.Set;
import java.util.TreeSet;

public class AppTreeSet {

	public static void main(String[] args) {
		// La implementación TreeSet me permite agregar elementos a la lista de forma unica y también los ordena de forma ascendente

		Set<String> listaString = new TreeSet<>();

		listaString.add("MitoCode");
		listaString.add("Mito");
		listaString.add("Code");
		listaString.add("Mito");
		listaString.add("Jaime");
		listaString.add("AAA");

		for (String elemento : listaString) {

			System.out.println(elemento);

		}

		System.out.println("\nLista de Objetos\n");
		// Para una lista de objeto de tipo TreeSet es necesario implementar en la clase del objeto la implementacion "Comparable" 
		Set<Persona> listaObjetos = new TreeSet<>();

		listaObjetos.add(new Persona(1, "MitoCode", 22));
		listaObjetos.add(new Persona(2, "Code", 23));
		listaObjetos.add(new Persona(3, "Mito", 24));
		listaObjetos.add(new Persona(4, "Jaime", 25));
		listaObjetos.add(new Persona(3, "Mito", 24));
		listaObjetos.add(new Persona(6, "AAA", 27));

		for (Persona persona : listaObjetos) {
			System.out.println(persona.getId() + " - " + persona.getNombre() + " - " + persona.getEdad());
		}

	}

}

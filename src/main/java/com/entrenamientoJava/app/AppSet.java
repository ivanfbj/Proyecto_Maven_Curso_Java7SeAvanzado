package com.entrenamientoJava.app;

import java.util.HashSet;
import java.util.Set;

public class AppSet {

	public static void main(String[] args) {

		// HashSet: se preocupa de que no existan elementos duplicados y no se preocupa
		// por el orden en que vamos agregando
		Set<String> lista = new HashSet<>();

		lista.add("MitoCode");
		lista.add("Mito");
		lista.add("Code");
		lista.add("MitoCode");
		lista.add("Jaime");
		lista.add("AAAA");
		lista.add("Ivan");

		for (String elemento : lista) {
			System.out.println(elemento);
		}

		// Lista de Objetos
		System.out.println("\nLista de Objetos");

		Set<Persona> listaObjeto = new HashSet<>();
		listaObjeto.add(new Persona(1, "MitoCode", 22));
		listaObjeto.add(new Persona(1, "Mito", 22));
		listaObjeto.add(new Persona(1, "Code", 22));
		listaObjeto.add(new Persona(1, "Code", 22));
		listaObjeto.add(new Persona(1, "MitoCode", 22));
		listaObjeto.add(new Persona(1, "AAAA", 22));

		for (Persona persona : listaObjeto) {
			System.out.println(persona.getNombre());
		}

	}

}

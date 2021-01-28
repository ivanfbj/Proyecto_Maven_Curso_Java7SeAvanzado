package com.entrenamientoJava.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {
		ArrayList<Persona> listaDeObjetos = new ArrayList<>();

		listaDeObjetos.add(new Persona(1, "Jaime", 25));
		listaDeObjetos.add(new Persona(1, "Mito", 15));
		listaDeObjetos.add(new Persona(1, "Code", 25));
		listaDeObjetos.add(new Persona(1, "prueba", 18));
		listaDeObjetos.add(new Persona(1, "Fernando", 27));

		Collections.sort(listaDeObjetos);

		for (Persona p : listaDeObjetos) {

			System.out.println(p.getNombre() + " - " + p.getEdad());

		}

	}

}

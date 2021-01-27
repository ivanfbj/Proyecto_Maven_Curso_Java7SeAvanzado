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

		System.out.println("\nOrdenado Por Nombre\n");
		Collections.sort(listaDeObjetos, new NombreComparator());

		for (Persona p : listaDeObjetos) {

			System.out.println(p.getNombre() + " - " + p.getEdad());

		}

		System.out.println("\nOrdenado Por edad\n");

		Collections.sort(listaDeObjetos, new Comparator<Persona>() {
			public int compare(Persona per1, Persona per2) {
				int rpta = 0;

				if (per1.getEdad() > per2.getEdad()) {
					rpta = 1;
				} else if (per1.getEdad() < per2.getEdad()) {
					rpta = -1;
				} else {
					rpta = 0;
				}
				return rpta;

			}
		});

		for (Persona p : listaDeObjetos) {

			System.out.println(p.getNombre() + " - " + p.getEdad());

		}

	}

}

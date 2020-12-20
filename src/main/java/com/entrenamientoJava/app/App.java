package com.entrenamientoJava.app;

import java.awt.List;
import java.util.ArrayList;

public class App {

	private static ArrayList canasta = new ArrayList();

	private static void verificar(Object objeto) {
		if (objeto instanceof Fruta) {
			canasta.add(objeto);
			System.out.println("Fruta agregada " + ((Fruta) objeto).getNombre());
		} else {
			System.out.println("Elemento no permitido, solo frutas por favor");
		}
	}

	public static void main(String[] args) {

		String texto = "Mitocode";

		if (texto instanceof String) {
			System.out.println("Es un String");
		}

		Alumno alumn = new Alumno();

		if (alumn instanceof Alumno) {
			System.out.println("Es un alumno");
		}

		if (alumn instanceof Persona) {
			System.out.println("Es un objeto hijo de la clase persona");
		}

		// Se tiene una canasta en donde solo se debe permitir ingresar frutas.
		System.out.println("");
		System.out.println("Canasta abierta, por favor ingresar SOLO frutas");

		Manzana m1 = new Manzana("Roja");
		Manzana m2 = new Manzana("Verde");
		Naranja n1 = new Naranja("NAranja sin pepa");
		Galleta g1 = new Galleta("Chocolate");

		App app = new App();

		App.verificar(m1);
		App.verificar(m2);
		App.verificar(n1);
		App.verificar(g1);

	}
}

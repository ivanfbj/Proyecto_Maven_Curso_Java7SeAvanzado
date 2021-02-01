package com.entrenamientoJava.app;

import java.util.Stack;

public class App {

	public static void main(String[] args) throws InterruptedException {

		Stack<String> pila = new Stack<>();

		pila.push("1-MitoCode");
		pila.push("2-Mito");
		pila.push("3-Code");
		pila.push("4-Jaime");
		pila.push("5-Fer");

		for (String elemento : pila) {
			System.out.println(elemento);
		}

		System.out.println("El elemento que está al tope es: " + pila.peek());

		// Sino encuentra el dato devuele un -1, si encuentra el elemento devulve la
		// posición del elemento empezando desde el ultimo
		System.out.println("Para buscar un elemento dentro de la Pila " + pila.search("2-Mito"));

		// Pop Para remover elementos
		while (!pila.isEmpty()) {
			System.out.println("Atendiendo a " + pila.pop());
			Thread.sleep(1000);// Me permite retrasar el proceso para que no se realice inmediatamente

		}

		
		System.out.println("\n Pila de Objetos \n");
		
		Stack<Persona> pilaObjetos = new Stack<>();
		
		pilaObjetos.push(new Persona(4, "MitoCode", 25));
		pilaObjetos.push(new Persona(3, "MitoCode", 26));
		pilaObjetos.push(new Persona(2, "MitoCode", 27));
		pilaObjetos.push(new Persona(1, "MitoCode", 28));
		
		for (Persona persona : pilaObjetos) {
			System.out.println(persona);
		}
		
		System.out.println("El elemento que está al tope es: " + pilaObjetos.peek());

		// Sino encuentra el dato devuele un -1, si encuentra el elemento devulve la
		// posición del elemento empezando desde el ultimo
		System.out.println("Para buscar un elemento dentro de la Pila " + pilaObjetos.search(new Persona(1, "MitoCode", 28)));
 
		// Pop Para remover elementos
		while (!pilaObjetos.isEmpty()) {
			System.out.println("Atendiendo a " + pilaObjetos.pop());
			Thread.sleep(1000);// Me permite retrasar el proceso para que no se realice inmediatamente

		}

	}

}

package com.entrenamientoJava.app;

import java.util.PriorityQueue;
import java.util.Queue;

public class App {

	public static void main(String[] args) throws InterruptedException {

		Queue<String> colaString = new PriorityQueue<>();
		colaString.offer("1-MitoCode");
		colaString.offer("2-Code");
		colaString.offer("3-Mito");
		colaString.offer("4-Jaime");

		for (String elemento : colaString) {
			System.out.println(elemento);
		}

		System.out.println("\n \n");

		while(!colaString.isEmpty()) {
			System.out.println("El registro actual es " + colaString.peek());
			
			System.out.println("Eliminando el registro  " + colaString.poll());
			Thread.sleep(1000);
		}
		
		System.out.println("\n Cola de tipo objeto\n");
		
		Queue<Persona> colaObjeto = new PriorityQueue<>();
		
		colaObjeto.offer(new Persona(1, "MitCode", 27));
		colaObjeto.offer(new Persona(1, "MitoCode", 25));
		colaObjeto.offer(new Persona(1, "MitCode", 28));
		colaObjeto.offer(new Persona(1, "Code", 26));
		
		while(!colaObjeto.isEmpty()) {
			System.out.println("El registro actual es " + colaObjeto.peek());
			
			System.out.println("Eliminando el registro  " + colaObjeto.poll());
			Thread.sleep(1000);
		}
	
	
	}
	

	
	
	
}

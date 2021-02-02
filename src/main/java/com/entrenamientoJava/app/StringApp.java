package com.entrenamientoJava.app;

public class StringApp {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("MitoCode").append(" Tutos");
		System.out.println(sb.toString());

		System.out.println(sb.capacity());//Capacidad por defecto es de 16 caracteres.
		
		StringBuilder sb2 = new StringBuilder(32);//Se puede modificar la capacidad inicial.
		System.out.println("Capacidad modificada del StringBuilder " + sb2.capacity());
		
		
		
		StringBuilder sb3 = new StringBuilder("MitoCode");
		System.out.println("Capacidad modificada del StringBuilder " + sb3.capacity()); //La capacidad por defecto de 16 se le suman la cantidad de caracteres ingresados en el constructor
		
		System.out.println("Longitud de caracteres del StringBuilder " + sb3.length());
		System.out.println("Invertir el texto ingresado en el StringBuilder " + sb3.reverse());
		
		sb3.setLength(0);//Para borrar el contenido de un StringBuilder.
		System.out.println(sb3.toString());
		
		
		StringBuffer sbuffer = new StringBuffer();
		System.out.println(sbuffer.append("Pruebas de SrtingBuffer"));;
		
	}

}

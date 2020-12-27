package com.entrenamientoJava.app;

public class Clase<T> {

	private T objeto;

	public Clase(T objeto) {
		this.objeto = objeto;
	}
	
	public void mostratTipo() {
		System.out.println("T es un : " + objeto.getClass().getName());
	}

	
	
}

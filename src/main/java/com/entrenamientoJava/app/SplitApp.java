package com.entrenamientoJava.app;

public class SplitApp {

	public static void main(String[] args) {

		String primerSplit = "Jaime;MitoCode;Mito;Code";
		String[] extraccion = primerSplit.split(";");

		for (String elemento : extraccion) {
			System.out.println(elemento);
		}

		System.out.println("\n");
		String segundoSplit = "Jaime|MitoCode|Mito|Code";
		String[] extraccion2 = segundoSplit.split("\\|");

		for (String elemento : extraccion2) {
			System.out.println(elemento);
		}

		System.out.println("\n");

		String tercerSplit = "Jaime|MitoCode|Mito|Code";
		String[] extraccion3 = tercerSplit.split("\\|",2);

		for (String elemento : extraccion3) {
			System.out.println(elemento);
		}
	}

}

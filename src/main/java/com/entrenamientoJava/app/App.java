package com.entrenamientoJava.app;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumerica1 = new ArrayList<>();

		listaNumerica1.add(25);
		listaNumerica1.add(10000);
		listaNumerica1.add(1);
		Collections.sort(listaNumerica1);
		System.out.println(listaNumerica1);

		//////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Integer> listaNumerica2 = new ArrayList<>();
		listaNumerica2.add(85);
		listaNumerica2.add(65000);
		listaNumerica2.add(15);
		Collections.reverse(listaNumerica2);
		System.out.println(listaNumerica2);

		//////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<String> listaString1 = new ArrayList<>();
		listaString1.add("Jaime");
		listaString1.add("MitoCode");
		listaString1.add("AAA");
		Collections.sort(listaString1);
		System.out.println(listaString1);

		
	}

}

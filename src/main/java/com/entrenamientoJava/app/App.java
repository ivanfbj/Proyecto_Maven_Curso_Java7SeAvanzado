package com.entrenamientoJava.app;

import java.awt.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		Clase c = new Clase("MitoCode");
		Clase d = new Clase(25);

		Clase<String> e = new Clase<String> ("Ivan");
		Clase<Integer> f = new Clase<Integer>(27);

		c.mostratTipo();
		d.mostratTipo();

		System.out.println("");

		e.mostratTipo();
		f.mostratTipo();

		
		
	}

}

package com.entrenamientoJava.app;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {

	ArrayList<String> Lista = new ArrayList<String>();
	
	Lista.add("MitoCode");
	//Lista.add(25);
	
	for (int i = 0; i < Lista.size(); i++) {
		System.out.println(Lista.get(i));
	}

		//Clase Clase
	System.out.println("");
	
	Clase <String,Integer,String,Double> c= new Clase<>("MitocCode",25,"Jaime",25.0);
	c.mostratTipo();	
	
	}

}

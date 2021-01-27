package com.entrenamientoJava.app;

import java.util.Comparator;

//public class NombreComparator implements Comparator {
public class NombreComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona per1, Persona per2) {

		// public int compare(Object objeto1, Object objeto2) {
		// Persona per1 = (Persona) objeto1;
		// Persona per2 = (Persona) objeto2;

		return per1.getNombre().compareTo(per2.getNombre());
	}

	/*
	 * Positivo: Obj1.x > Objt2.x 
	 * Cero: Obj1.x = Objt2.x 
	 * Negativo: Obj1.x < Objt2.x
	 * 
	 */
	
}

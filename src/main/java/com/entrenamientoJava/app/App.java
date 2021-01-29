package com.entrenamientoJava.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		Map<Integer, String> hMap = new HashMap<>();
		//HashMap: No almacena 2 valores con la misma llave, muestra el ultimo valor ingresado
		hMap.put(3, "MitoCode");
		hMap.put(4, "Mito");
		hMap.put(1, "Code");
		hMap.put(2, "Jaime");
		hMap.put(5, null);
		hMap.put(null, "Hola");

		Iterator it = hMap.keySet().iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: " + key + " -> Valor: " + hMap.get(key));
		}

		
		System.out.println("\nTreeMap\n");
		
		Map<Integer, String> tMap = new TreeMap<>();
		//TreeMap: No me permite llave duplicadas, no permite valores duplicados considera el ultimo valor ingresado, y los ordena de forma ascendente.
		tMap.put(3, "MitoCode2");
		tMap.put(4, "Mito2");
		tMap.put(1, "Code2");
		tMap.put(2, "Jaime2");
		tMap.put(5, null);
		//tMap.put(null, "Hola2");

		Iterator it2 = tMap.keySet().iterator();
		while (it2.hasNext()) {
			Integer key = (Integer) it2.next();
			System.out.println("Clave: " + key + " -> Valor: " + tMap.get(key));
		}
		
		System.out.println("\nLinkedHashMap\n");
		
		Map<Integer, String> lMap = new LinkedHashMap<>();
		//LinkedHashMap: Se preocupa por el orden en el que voy agregando los elementos
		lMap.put(3, "MitoCode2");
		lMap.put(4, "Mito2");
		lMap.put(1, "Code2");
		lMap.put(2, "Jaime2");
		lMap.put(5, null);
		//tMap.put(null, "Hola2");

		Iterator it3 = lMap.keySet().iterator();
		while (it3.hasNext()) {
			Integer key = (Integer) it3.next();
			System.out.println("Clave: " + key + " -> Valor: " + lMap.get(key));
		}
		
		System.out.println("\nLinkedHashMap con objetos \n");
		
		Map<Persona, String> lMapObjeto = new LinkedHashMap<>();
		//LinkedHashMap: Se preocupa por el orden en el que voy agregando los elementos
		lMapObjeto.put(new Persona(1, "MitoCode", 21), "MitoCode");
		lMapObjeto.put(new Persona(2, "MitoCode", 21), "Mito");
		lMapObjeto.put(new Persona(4, "MitoCode", 21), "Code");
		lMapObjeto.put(new Persona(5, "MitoCode", 21), "Jaime");
		lMapObjeto.put(new Persona(3, "MitoCode", 21), "AAA");
		lMapObjeto.put(new Persona(6, "MitoCode", 21), null);
		//tMap.put(null, "Hola2");

		Iterator it4 = lMapObjeto.keySet().iterator();
		while (it4.hasNext()) {
			Integer key = (Integer) it4.next();
			System.out.println("Clave: " + key + " -> Valor: " + lMapObjeto.get(key));
		}
		
	}

}

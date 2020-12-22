package com.entrenamientoJava.app;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

//Simulacion del patrón DAO, no es la implementación completa
public class PaisDAOImpl {

	public static PaisDAOImpl instancia = null;
	private static LinkedList paises = null;
	
	//colocar el constructor de forma privada para evitar el doble instanciamiento y se pierda la funcionalidad de
	//Singleton, de esta manera ya no se pueden crear instancias adicionales, obliga una sola instancia.
	private PaisDAOImpl() {
		
	}

	public static PaisDAOImpl getInstance() {
		if (instancia == null) {
			instancia = new PaisDAOImpl();
		}
		return instancia;
	}

	public static LinkedList getPaises() {

		if (paises == null) {

			paises = new LinkedList();

			Pais p1 = new Pais("PERU");
			Pais p2 = new Pais("MEXICO");
			Pais p3 = new Pais("COLOMBIA");

			paises.add(p1);
			paises.add(p2);
			paises.add(p3);

		}
		return paises;
	}

}

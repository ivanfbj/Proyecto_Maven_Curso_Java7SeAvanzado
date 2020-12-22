package com.entrenamientoJava.app;

import java.awt.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
//		PaisDAOImpl dao = new PaisDAOImpl();

		// Con sigleton correcto

		PaisDAOImpl dao = PaisDAOImpl.getInstance();

		for (Object obj : dao.getPaises()) {
			System.out.println(((Pais) obj).getNombre());
		}
		System.out.println("*******************************");

		for (Object obj : dao.getPaises()) {
			System.out.println(((Pais) obj).getNombre());
		}
		System.out.println("*******************************");

		PaisDAOImpl daoi = PaisDAOImpl.getInstance();
		for (Object obj : daoi.getPaises()) {
			System.out.println(((Pais) obj).getNombre());
		}

	}
}

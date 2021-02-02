package com.entrenamientoJava.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.lang.model.element.Element;
import javax.xml.xpath.XPathEvaluationResult;

public class PatternApp {

	public static void main(String[] args) {
		/*
		 * Pattern p = Pattern.compile(".");// EL punto significa que voy a evaluar
		 * cualquier caracter en particular Matcher m = p.matcher("XYZ");// Indicamos la
		 * secuencia que vamos a evaluar en el método "matcher"
		 * System.out.println(m.matches());
		 * 
		 * Pattern p2 = Pattern.compile(".Y");// Matcher m2 = p2.matcher("XY");//
		 * Indicamos la secuencia que vamos a evaluar en el método "matcher"
		 * System.out.println(m2.matches());
		 * 
		 * Pattern p3 = Pattern.compile("[abc]");// Matcher m3 = p3.matcher("a");//
		 * System.out.println(m3.matches()); // Devuelve TRUE ya que el caracter a
		 * buscar está dentro de la lista de // caracteres
		 * 
		 * Pattern p4 = Pattern.compile("[^abc]");// Matcher m4 = p4.matcher("a");//
		 * System.out.println(m4.matches()); // Devuelve FALSE ya que el caracter a
		 * buscar está dentro de la lista de // caracteres
		 */
		System.out.println("Tiempo del Pattern");

		long inicioTimePattern = System.currentTimeMillis();

		Pattern p5 = Pattern.compile(";");
		for (int i = 0; i < 10000; i++) {
			String[] arregloPattern = p5.split("Jaime;MitoCode;Code;Mito");
		}
		long finTimePattern = System.currentTimeMillis();

		System.out.println(finTimePattern - inicioTimePattern);

		/////////////////////////////////////////////////////////////////////////
		System.out.println("Tiempo del SPLIT");

		long inicioTimeSplit = System.currentTimeMillis();
				
		for (int i = 0; i < 10000; i++) {
			String[] arregloSplit = "Jaime;MitoCode;Code;Mito".split(";");
		}
		long finTimeSplit = System.currentTimeMillis();
		
		System.out.println(finTimeSplit - inicioTimeSplit);	}

}

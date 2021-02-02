package com.entrenamientoJava.app;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherApp {

	public static void main(String[] args) {

		String texto = "Suscribete al canal de MitoCode";
		Pattern p = Pattern.compile("suscribete", Pattern.CASE_INSENSITIVE);// Pattern.CASE_INSENSITIVE omite las
																				// mayusculas //iniciar y terminar con
																				// .* quiere decir que va a buscar en
																				// toda la cadena de texto
		Matcher m = p.matcher(texto);
		System.out.println("matches " + m.matches());
				
		int contador=0;
		while (m.find()) {
			contador++;
			System.out.println("Coincidencia N° " + contador + " Start " + m.start() + " end " + m.end());
		}
		
		System.out.println("lookingAt " + m.lookingAt());//lookingAt valida si la información que se está buscando inicia en la validación que se está realizando
		
	}

}

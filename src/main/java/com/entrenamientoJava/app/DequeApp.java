package com.entrenamientoJava.app;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {

	public static void main(String[] args) {

		Deque<String> dqString = new ArrayDeque<>();
		dqString.add("1-Jaime");
		dqString.add("2-Mito");
		dqString.add("3-Code");

		String x = dqString.peek();
		System.out.println("Peek " + x);

		x = dqString.poll();
		System.out.println("Poll " + x);
		
		x=dqString.pop();
		System.out.println("Pop " + x);
		
		dqString.addFirst("0-MitoCode");
		dqString.addLast("4-JCode");
		
		for (String elemento : dqString) {
			
			System.out.println(elemento);
		}

	}

}

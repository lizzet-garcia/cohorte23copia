package com.generation.lggr.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions {
	public static void main(String[] args) {
		// el resultado sera una exception porque no se puede dividir entre 0
		// int division = 10/0;
		// System.out.println("---->" + division);
		
		Scanner dato = new Scanner(System.in);
		System.out.print("ingrese un valor ");
		int divisor;
		
			

		// como tratar la excepcion con try y catch
		try {
			divisor = Integer.parseInt(dato.next());
			
			int division = 10 / divisor;
			System.out.println("---->" + division);

		} catch (ArithmeticException e) {
			System.out.println("capturando la excepcion "+ e.getMessage());

		}catch(NumberFormatException nfe) {
			System.out.println("el dato es un caracter: " + nfe.getMessage());
			
		} finally {
			System.out.println("este bloque es opcional y se va a ejecutar con o sin la exception");
		}
		
		System.out.println("continuamos con el flujo de la app");

	}

}

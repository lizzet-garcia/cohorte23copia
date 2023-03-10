package com.generation.lggr.ManejoExcepciones;

public class TestExceptions {

	public static void main(String[] args) {
		
		try {
			Division d = new Division(4,2);
			d.visualizarD();
			
		} catch (OpExceptions e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		 
		System.out.println("continua...");
		

	}
}

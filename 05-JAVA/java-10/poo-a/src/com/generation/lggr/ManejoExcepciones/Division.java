package com.generation.lggr.ManejoExcepciones;

public class Division {
	private int  numerador;
	private int denominador;
	
	//constructor
	public Division(int numerador, int denominador)throws OpExceptions {
		
		if (denominador == 0){
			throw new OpExceptions("el denominador es un cero");
			
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void visualizarD() {
		System.out.println("el resultado de la division es: " + (this.numerador/ this.denominador));
		

	}
	

}

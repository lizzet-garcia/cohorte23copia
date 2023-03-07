package com.generation.lggr.clases;

//generic tipo T que parametriza a la clase
public class ClaseGenerica <T> {
	T obj;

	//constructor
	public ClaseGenerica(T obj) {
		this.obj = obj;
	}
	
	//METODO
	public void claseTipo() {
		System.out.println("el tipo T es: " + obj.getClass().getName());
		
		

	}
	
	

}

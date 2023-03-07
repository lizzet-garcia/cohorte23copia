package com.generation.lggr.mains;

import com.generation.lggr.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		
		//operador diamante esta parametrizando
		ClaseGenerica <Integer> intObj = new ClaseGenerica <Integer>(55);
		ClaseGenerica <String> caracteresObj = new ClaseGenerica <String>("prueba");
		
		intObj.claseTipo();
		caracteresObj.claseTipo();
		
		

	}

}

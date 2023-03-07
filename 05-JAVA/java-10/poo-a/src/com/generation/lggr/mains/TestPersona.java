package com.generation.lggr.mains;

import com.generation.lggr.clases.Persona;

public class TestPersona {
	public static void main(String[] args) {

		Persona persona = new Persona();
		persona.setNombre("Melina");
		System.out.println("--->" + persona.getNombre());
	}
}

package com.lggr.testers;

import com.lggr.clases.AlumnoB;
import com.lggr.clases.PersonaP;

public class TestPB {

	public static void main(String[] args) {
		AlumnoB a = new AlumnoB(123, 8.5, "Armando", 25);
		PersonaP b = new PersonaP("Pedro", 24);
		a.getNombre();
		System.out.println("el nombre es: " + a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
		System.out.println(b.toString());
		 // System.out.println(a.mostrarDatos());
		a.mostrarDatos("Lara");

	}

}

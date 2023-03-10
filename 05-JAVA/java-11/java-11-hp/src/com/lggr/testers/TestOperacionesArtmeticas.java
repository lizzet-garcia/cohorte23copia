package com.lggr.testers;

import com.lggr.clases.Mensajes;
import com.lggr.clases.OperacionesAritmeticas;
import com.lggr.clases.Suma;

public class TestOperacionesArtmeticas {

	public static void main(String[] args) {
		Suma s = new Suma(5,2);
		OperacionesAritmeticas ss = new Suma(10,3);
		Mensajes sss = new Suma();
		
		System.out.println("Suma" + s.Sumar());
		System.out.println("Operaciones Artimeticas: " + ss.Sumar());
		s.mensaje();
		sss.mensaje();
		
		
		
		
		

	}

}

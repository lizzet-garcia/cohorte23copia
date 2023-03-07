package com.generation.lggr.mains;

// el * me permite acceder a todos los datos
import java.util.*;

public class Colecciones {

	public static void main(String[] args) {
		
		//al agregar el operador diamante <> se le dice que tipo de dato aceptara (parametrizacion: decirle a la coleccion
		// que solo va a usar una coleccion de un tipo)
		ArrayList <String> coleccion = new ArrayList <String> ();
		coleccion.add("colecciones");
		coleccion.add("cohorte");
		
		
		// coleccion.add(13);
		// coleccion.add(15.15);
		// coleccion.add("a");
		
		for (int i = 0; i < coleccion.size(); i++) {
			System.out.println(coleccion.get(i));
			
			
		}
	}

}

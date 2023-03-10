package com.lggr.testers;

import com.lggr.clases.Circulo;
import com.lggr.clases.Cuadrado;
import com.lggr.clases.FigurasGeometricas;
import com.lggr.clases.Rectangulo;
import com.lggr.clases.Triangulo;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		//REFERENCIA a FigurasGeometricas. porque esa la implementa Rectangulo.
		FigurasGeometricas rectangulo = new Rectangulo (10,2);
		FigurasGeometricas circulo = new Circulo (2);
		FigurasGeometricas cuadrado = new Cuadrado (2);
		FigurasGeometricas triangulo = new Triangulo (10,15);
		System.out.println(rectangulo.areas());
		System.out.println(circulo.areas());
		System.out.println(cuadrado.areas());
		System.out.println(triangulo.areas());
		System.out.println(rectangulo.toString());
		System.out.println(circulo.toString());
		
		//pedir datos
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		System.out.println(rectangulo.areas());
		
		
		

	}

}

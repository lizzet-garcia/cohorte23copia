package com.generation.lggr.mains;

import com.generation.lggr.clases.AreaPerimetro;
import com.generation.lggr.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		AreaPerimetro ap = new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();
		fg.setArea(ap.areaCuadrado(5));
		System.out.println("el area del cuadrado es: " + fg.getArea());
		
		fg.setPerimetro(ap.perimetroCuadrado(5));
		System.out.println("perimetro del cuadrado: " + fg.getPerimetro());
		
		fg.setPerimetro(ap.perimetroTriangulo(2, 5, 2));
		System.out.println("perimetro del triangulo: " + fg.getPerimetro());
		
		fg.setArea(ap.areaTrianguloint(23, 20));
		System.out.println("area del triangulo: " + fg.getArea());
		
		fg.setArea(ap.areaCirculo(24));
		System.out.println("area circulo: " + fg.getArea());
		
		fg.setPerimetro(ap.perimetroCirculo(24));
		System.out.println("perimetro circulo: " + fg.getPerimetro());
		

	}

}

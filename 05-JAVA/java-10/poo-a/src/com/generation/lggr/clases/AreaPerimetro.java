package com.generation.lggr.clases;

public class AreaPerimetro {

	//cuadrado
	public double areaCuadrado(double lado) {
		double area = lado * lado;
		return area;

	}
	
	public double perimetroCuadrado(double lado) {
		double perimetro = lado * 4;
		return perimetro;

	}
	
	//triangulo
	public double areaTrianguloint (int base, int altura) {
		return (base * altura)/2;
		

	}
	
	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {
		return (ladoA + ladoB + ladoC);

	}

	//circulo
	
	public double areaCirculo(double radio) {
		return (Math.PI * (radio * radio));

	}
	
	public double perimetroCirculo(double radio) {
		return (Math.PI * (radio*radio));

	}
}

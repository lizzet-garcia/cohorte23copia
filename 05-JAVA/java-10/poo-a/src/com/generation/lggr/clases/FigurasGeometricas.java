package com.generation.lggr.clases;

public class FigurasGeometricas {
	private double perimetro;
	private double area;

	//constructor vacio
	public FigurasGeometricas() {

	}

	//constructor sobrecargado 
	public FigurasGeometricas(double perimetro, double area) {

		this.perimetro = perimetro;
		this.area = area;
	}

	//getters and setters
	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	
}

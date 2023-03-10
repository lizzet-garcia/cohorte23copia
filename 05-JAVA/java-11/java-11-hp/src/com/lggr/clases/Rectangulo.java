package com.lggr.clases;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas {
	private double base;
	private double altura;

//constructor que inicializa base y altura
	public Rectangulo(double base, double altura) {
		super("Rectangulo");

		this.base = base;
		this.altura = altura;
	}

//getters y setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// implementando clase abstracta de clase padre
	@Override
	public double areas() {

		return (base * altura);
	}

	//pedir datos
	public void pedirDatos() {
		Scanner datos = new Scanner(System.in);
		System.out.print("introduzcla la base: ");
		double B = datos.nextDouble();
		this.setBase(B);
		System.out.print("introduzcla la altura: ");
		this.setAltura(datos.nextDouble());
	
		
	}
}

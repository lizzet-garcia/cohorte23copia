package com.lggr.clases;

public class Triangulo extends FigurasGeometricas{
	private double base;
	private double altura;
	
	//implementando clase abstracta de clase padre
	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return (base*altura/2);
	}
	
//constructor
	public Triangulo(double base, double altura) {
		super("triangulo");
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

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}
	
	

}

package com.lggr.clases;

public class Cuadrado extends FigurasGeometricas {
public int lado;

//implementando clase abstracta de clase padre
	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return (lado * lado);
		
	}

//constructor
	public Cuadrado(int lado) {
		super("cuadrado");
		this.lado = lado;
	}


	//getters y setters
	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}



	

}

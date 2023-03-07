package com.generation.lggr.clases;

public class Taco {
	//atributos
private String tipoDeTortilla;
private String guisado;
private int numeroDeTortilla;
private String tamañoDeTortilla;
private float precio;

//metodos
public void preparar() {

}
public void vender() {

}
public void ponerSalsa() {

}
public void subirPrecio() {

}

//constructor vacio
public Taco() {
	
}



//constructor sobrecargado
public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamañoDeTortilla, float precio) {
	
	this.tipoDeTortilla = tipoDeTortilla;
	this.guisado = guisado;
	this.numeroDeTortilla = numeroDeTortilla;
	this.tamañoDeTortilla = tamañoDeTortilla;
	this.precio = precio;
}




//to String
@Override
public String toString() {
	return "Taco [tipoDeTortilla=" + tipoDeTortilla + ", guisado=" + guisado + ", numeroDeTortilla=" + numeroDeTortilla
			+ ", tamañoDeTortilla=" + tamañoDeTortilla + ", precio=" + precio + "]";
}



//getters and setters
public String getTipoDeTortilla() {
	return tipoDeTortilla;
}
public void setTipoDeTortilla(String tipoDeTortilla) {
	this.tipoDeTortilla = tipoDeTortilla;
}
public String getGuisado() {
	return guisado;
}
public void setGuisado(String guisado) {
	this.guisado = guisado;
}
public int getNumeroDeTortilla() {
	return numeroDeTortilla;
}
public void setNumeroDeTortilla(int numeroDeTortilla) {
	this.numeroDeTortilla = numeroDeTortilla;
}
public String getTamañoDeTortilla() {
	return tamañoDeTortilla;
}
public void setTamañoDeTortilla(String tamañoDeTortilla) {
	this.tamañoDeTortilla = tamañoDeTortilla;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}




}

package com.generation.lggr.mains;

import com.generation.lggr.clases.Taco;

public class TestTaco {
public static void main(String[] args) {
	Taco t = new Taco();
	t.setTipoDeTortilla("maiz");
	System.out.println("el tipo de tortilla es: " + t.getTipoDeTortilla());
	
	t.setGuisado("Pastor");
	System.out.println("el guisado es: " + t.getGuisado());
	
	t.setNumeroDeTortilla(2);
	System.out.println("el numero de tortilla es: " + t.getNumeroDeTortilla());
	
	t.setTamañoDeTortilla("grande");
	System.out.println("el tamaño es: " + t.getTamañoDeTortilla());
	
	t.setPrecio(25);
	System.out.println("el precio es: " + t.getPrecio());
	
	//llamada a to string
	System.out.println(t.toString());
}
}

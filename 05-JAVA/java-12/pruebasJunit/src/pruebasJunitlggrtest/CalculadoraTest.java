package pruebasJunitlggrtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebasJunitlggrapp.Calculadora;

class CalculadoraTest {
	private Calculadora ct;
	private Calculadora ct1 = null;
	
	@BeforeEach
	private void configurandoBefore() {
		ct = new Calculadora();
		System.out.println("ejecutando Before");

	}
	@AfterEach
	private void configurandoAfter() {
		// TODO Auto-generated method stub
		System.out.println("ejecutando after each");

	}


	@Test
	public void CalculadoraNull() {
		ct = null;
		assertNull(ct1, "la clase es una instancia no nula");
		System.out.println("ejecutando el primer test: calculadora");
		

	}
	

	@Test
	public void CalculadoraNotNull() {
		assertNotNull(ct, "la clase esta instanciada");
		System.out.println("ejecutando el segundo test: calculadora");
	}
	
	/*PRIMERAS PRUEBAS */
	
	@Test
	private void primerosAssert() {
		
		//1.-Indicar que se va a evaluar
		//2.-Indicar lo que se va a realizar
		//3.-Evaluar con el assert indicado
		
		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = ct.sumar(7,3);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("ejecutando tercer test");
		

		}
	@Test
	public void sumaTest() {
		Calculadora calculadora = new Calculadora();
	assertEquals(20,ct.sumar(10, 10));
	System.out.println("ejecutando cuarto test");

	}
	
	/**** TIPOS TEST *****/
	
	@Test
	public void tiposAsserts() {
		assertNull(ct);
		assertTrue(1 == 2);
		assertEquals("generation", "generation");
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = c1;
		
		assertSame(c1, c3);
		assertNotSame(c2, c3);
		assertEquals(1, 1.5,.5);
	
		
	}
	
	@Test
	private void validandoSuma() {
		assertEquals(11, ct.sumar(5, 6));

	}
	
	@Test
	private void validandoResta() {
		assertEquals(50, ct.restar(56, 6)); 
	}
	
	@Test
	public void validadoRestaNegativa() {
		assertEquals(-10,ct.restar(1, 20));
		

	}
	@Test
	public void validandoDivision() {
		assertEquals(2, ct.division(10, 5));

	}
	
	/*
	@Test
	public void validandoByZero() {
		assertThrows(ArithmeticException.class, ()->ct.divisionByZer0(10, 0));

	}
	*/
	@Disabled ("en espera")
@Test	
public void validandoByZero() {
	assertThrows(ArithmeticException.class, ()->ct.divisionByZer0(10, 0));

}
	

}
	

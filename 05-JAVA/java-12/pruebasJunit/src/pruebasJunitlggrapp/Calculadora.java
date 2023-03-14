package pruebasJunitlggrapp;

public class Calculadora {

	public int sumar(int n1, int n2) {
		return (n1 + n2);

	}

	public int restar(int n1, int n2) {
		return (n1 - n2);
	}

	public double division(double d1, double d2) {
		return (d1 / d2);

	}

	public double divisionByZer0(double v1, double v2) {
		if (v2 == 0) {
			throw new ArithmeticException("no se puede dividir por cero");
		}
		return (v1 / v2);
	}

}

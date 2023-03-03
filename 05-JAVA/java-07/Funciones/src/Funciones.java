
public class Funciones { // clase funciones

	// las funciones se pueden declarar en cualquier lugar de la clase (si retorna
	// algo)
	public static int sumar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	} // cierrre sumar

	public static int restar(int num3, int num4) {
		int resultado = num3 - num4;
		return resultado;
	} // cierrre restar

	public static int multiplicar(int num5, int num6) {
		int resultado = num5 * num6;
		return resultado;
	} // cierrre multipicar

	public static int dividir(int num7, int num8) {
		int resultado = num7 / num8;
		return resultado;
	} // cierrre dividir
	
	
	
	
	

	// funcion para imprimir asteriscos (void)
	public static void imprimirAsteriscos() {
		System.out.println("******");
	} // cierrre imprimirAsteriscos
	
	
	//Funcion que combina distintos tipos de valores
	public static float sumaDecimal (float valor1, int valor2) {
		float resultadoDecimal = valor1 + valor2;
		return resultadoDecimal;
	} //fin funcion

	
	//Funcion que usa Strings como argumentos
	public static String awitaDeLimon (String ingrediente1, String ingrediente2, String ingrediente3) {
		String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3;
		return recetaCompletada;
	}
	
	//funcion ejercicio triangulo
	public static double altura (double valor1, double valor2) {
		double resultado = valor1 * valor2;
		return resultado; 
	}
	
	
	
	
	
	
// este metodo tiene conmo funcion, ejecutar cosas
	public static void main(String[] args) {

		// las invocaciones de la funcion se hacen generalmente dentro del metodo
		// principal o main
		System.out.println("es resultado de la suma es: " + sumar(5, 5));

		imprimirAsteriscos();
		System.out.println("el resultado de la suma decimal es: " + sumaDecimal (5.7f, 5));
		System.out.println("Estos son los pasos para preparar awita de Limon" + awitaDeLimon("agua", "limon", "azucar"));
		
		//FUNCIONES DE LA BIBLIOTECA DE MATEMATICAS (Math)
		double valorEjemplo = 7.65497834d;
		System.out.println("la raiz cuadrada: " + Math.sqrt(valorEjemplo));
		
		System.out.println("el seno de mi valor es" + Math.sin(valorEjemplo));
		
		System.out.println("La potencia de mi valot es" + Math.pow(valorEjemplo, 2));
		
		
		
		// ejercicio triangulo. JAVA SOLO ENTIENDE RADIANES, primero hay que pasar los grados a radianes.
		System.out.println("la base es: 100");
		System.out.println(Math.toRadians(30));
		System.out.println("grados en radianes es: 0.523598 ");
		System.out.println("es resultado es "+ altura (100,  Math.tan(0.523598)));
		
				
		
		
		
		
	} // cierre metodo main

} // cierrre clase Funciones








/*
 * FUNCIONES -no retornan valores: no devuelven nada, no se especifica nada y no
 * usamos la palabra return. -si retornan valores: se especifica el tipo de
 * dato, el tipo de valor que refresa y se usa la palabra return.
 * 
 * 
 * - Sintaxis de las funciones que si retornan valores     tipoDeRetorno
 * nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {   //
 * Cuerpo de la función }
 * 
 *     - Sintaxis de las funciones que no retornan valores     palabraReservada
 * nombreDeLaFuncion(){     //cuerpo de la funcion      }
 * 
 * Cosas que debemos tomar en cuenta al momento de crear nuestras funciones: -
 * Deben de llevar un nombre unico - Opcionalmente podran recibir argumentos y
 * devolver el resultado - Se debe especificar el tipo de dato que vamos a pasar
 * como argumnto, y el resultado final de nuestra funcion - Cuidar el orden en
 * como estamos agregando nuestros parametros o argumentos.
 * 
 * 
 * 
 * 
 *
 * 
 * 
 */
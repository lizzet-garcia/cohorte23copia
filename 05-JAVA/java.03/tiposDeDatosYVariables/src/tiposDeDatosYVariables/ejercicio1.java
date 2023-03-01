package tiposDeDatosYVariables;

public class ejercicio1 {

	public static void main(String[] args) {
	  //declara 3 variables de tipo entero y utiliza el operador * y %
		int z = 5;
		int x = 2;
		int y = 3;
		int v = z * x % y;
		System.out.println(v);
		
		//declara dos variables de tipo boolean y utliza el operador ==
		boolean a = true;
		boolean b = false;
		boolean c = a == b;
		System.out.println(c);
		
		//declara dos variables de tipo double y utiliza el operador <
		double s = 5.5;
		double d = 6.6;
		if(s<d) {
			System.out.println("es menor el primer valor");
		}else {
			System.out.println("es menor el segundo valor");
		}
		
		//comprobar si un numero es par o impar
		int num = 4;
		if (num % 2 == 0) {
			System.out.println("el numero es par");
		}else {
			System.out.println("el numero es impar");
		}
		
		//conversion de farenheit a kelvin y celsius
		int gradosF = 50;
		double gradosK = (gradosF - 32 ) * 5/9 + 273.15;
		double gradosC = (gradosF -32) * 5/9;
		System.out.println("los grados Kelvin son:" + gradosK);
		System.out.println("los grados Celsius son: " + gradosC);

	}

}

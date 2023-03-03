package colecciones.lggr;

import java.util.*;

public class MisCollection {

	public static void main(String[] args) {
		
		wrapperClass();
		

	}
	
	
	public void listasCollections() {
		
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);

	}
	
	private void imprimir(Collection collection) {
		for (Object elementos : Collection) {
			
		}

	}
	

	static void wrapperClass() {
		//byte, short, char, long, float, int, double
		
		byte numeroB= 12;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor max " + Byte.MAX_VALUE);
		System.out.println("Valor min " + Byte.MIN_VALUE);
		System.out.println("---->" + numeroB);
		
		
		int numeroI = 2147; 
		System.out.println("Tamaño de un entero bytes " + Integer.BYTES);
		System.out.println("Tamaño de un entero " + Integer.SIZE);
		System.out.println("Valor max " + Integer.MAX_VALUE);
		System.out.println("Valor min " + Integer.MIN_VALUE);
		System.out.println("---->" + numeroI);
		
		short numeroA= 12;
		System.out.println("Tamaño de un short " + Short.SIZE );
		System.out.println("Valor max " + Short.MAX_VALUE );
		System.out.println("Valor min " + Short.MIN_VALUE );
		System.out.println("---->" + numeroA);
		
		
		int numeroE = 2147; 
		System.out.println("Tamaño de un long " + Long.SIZE );
		System.out.println("Valor max " + Long.MAX_VALUE);
		System.out.println("Valor min " + Long.MIN_VALUE);
		System.out.println("---->" + numeroE);


	}

}

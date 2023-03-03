package colecciones.lggr;

import java.util.*;

public class MisCollection {

	// metodo main
	public static void main(String[] args) {

		MisCollection c = new MisCollection();
		// imprimir(c.listasCollections());
		// imprimir(c.setCollection());

		mapCollections();

		// wrapperClass();

	}

	// metodo map
	private static void mapCollections() {
		Map miMap = new HashMap();
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");

		// miMap.clear();
		miMap.remove("valor3");

		imprimir(miMap.values());
		imprimir(miMap.keySet());

	}

	Set setCollection() {
		Set miSet = new HashSet();
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");

		System.out.println(miSet + "Tamaño de la lista " + miSet.size());
		System.out.println(miSet + "contiene pato? " + miSet.contains("pato"));

		return miSet;

	}

	// metodo list
	private List listasCollections() {

		// la interfaz List no se puede instanciar por eso se implementa con el
		// ArrayList.
		List miLista = new ArrayList();
		System.out.println(miLista + "Tamaño de la lista " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());

		miLista.add("a");
		miLista.add(2);
		miLista.add(3);
		miLista.add(0, "pato");

		miLista.set(0, miLista);
		miLista.remove(0);

		System.out.println(miLista + "Tamaño de la lista despues " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());

		// contains dice el elemento no el indice
		boolean e = miLista.contains(2);
		System.out.println(e);

		return miLista;

	}

	// metodo imprimir
	private static void imprimir(Collection collection) {
		for (Object elementos : collection) {
			System.out.println("elementos " + elementos);
		}

	}

//metodo clase wrapper
	static void wrapperClass() {
		// byte, short, char, long, float, int, double

		byte numeroB = 12;
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

		short numeroA = 12;
		System.out.println("Tamaño de un short " + Short.SIZE);
		System.out.println("Valor max " + Short.MAX_VALUE);
		System.out.println("Valor min " + Short.MIN_VALUE);
		System.out.println("---->" + numeroA);

		int numeroE = 2147;
		System.out.println("Tamaño de un long " + Long.SIZE);
		System.out.println("Valor max " + Long.MAX_VALUE);
		System.out.println("Valor min " + Long.MIN_VALUE);
		System.out.println("---->" + numeroE);

	}

}

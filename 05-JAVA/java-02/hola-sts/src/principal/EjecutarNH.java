package principal;
import java.util.Scanner;

import clases.NuevoHola;


public class EjecutarNH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn =new Scanner(System.in);
		
		NuevoHola nh = new NuevoHola("Lizzet");
		nh.saludo();
		
		String nombre;
		System.out.print("Cual es tu nombre: ");
		nombre = sn.next();
		
		NuevoHola nh1 = new NuevoHola (nombre);
		nh1.saludoConNombre ( );
		
	}

}

package testers;

import oop.clases.Fecha;

public class TestFecha {
	public static void main(String[] args) {
		Fecha f = new Fecha();
		f.setDia(6);
		f.setMes(3);
		f.setAño(2023);
		System.out.println(f.diaMesAño());
		System.out.println("--->" + f.toString()); //este viene de un metodo heredado de object, que sobreescribe los atrubutos de fecha
	}
}

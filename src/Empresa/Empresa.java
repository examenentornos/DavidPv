package Empresa;

import java.util.Scanner;


public class Empresa {

	private final static int COMPLEMENTO1 = 1000; 
	private final static int COMPLEMENTO2 = 500; 
	private final static int COMPLEMENTO3 = 300; 
	private final static int COMPLEMENTO4 = 100; 

	public static void main(String[] args) {
		
	}

	public static int calcularCodigo(String cadena) {
		int resultadoComplemento = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(cadena); 
		int codigo;
		String[] nombre;
		String nombreA;
		int antiguedad;
		String plus;

		sc.useDelimiter(";");
		System.out.println("Delimitador -->  " + sc.delimiter() + "\n");
		while (sc.hasNext() == true) {

			
			codigo = sc.nextInt(); 
			if (codigo <= 0 || codigo >= 1000) {
				System.out.println("codigo: Incorrecto " + codigo);
				throw new RuntimeException();
			} else {

				System.out.println("codigo:  " + codigo);
			}

			
			nombreA = sc.next(); 
			nombre = new String[nombreA.length()];
			for (int i = 0; i < nombre.length; i++) {
				nombre[i] = nombreA;
			}
			System.out.println("nombre: " + nombre[0].toString());
			if (nombreA.length() > 20) {

				throw new RuntimeException();
			}

			
			antiguedad = sc.nextInt(); 
			if (antiguedad < 0 || antiguedad >= 100)
				throw new RuntimeException();
			else {
				System.out.println("Antiguedad ->"+ antiguedad);
				;
			}

			

			plus = sc.next();
			System.out.println("plus: " + plus + "\n");
			if (plus.equalsIgnoreCase("SI") || (plus.equalsIgnoreCase("NO"))) {

				if (antiguedad >= 5 && plus.equalsIgnoreCase("SI"))
					resultadoComplemento = COMPLEMENTO1;
				else if (antiguedad >= 5 && plus.equalsIgnoreCase("NO"))
					resultadoComplemento = COMPLEMENTO2;
				else if (antiguedad < 5 && plus.equalsIgnoreCase("SI"))
					resultadoComplemento = COMPLEMENTO3;
				else
					resultadoComplemento = COMPLEMENTO4;

			} else

				throw new RuntimeException();

		}
		System.out.println("FIN CADENA.");
		sc.close();

		return resultadoComplemento;
	}
}

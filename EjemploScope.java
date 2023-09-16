package java_primeros_pasos;

//El Scope es todo lo que va entre llaves --> { scope global { scope local} };

public class EjemploScope {

	public static void main(String[] args) {

		int edad = 21;
		int cantidadPersonas = 2;
		// System.out.println("El valor de la condicion es: " + esPareja);

		boolean esPareja;
		
		//System.out.println("--->" + esPareja); //Descomenta esta linea; que pasa si esPareja no esta inicializada
		
		System.out.println();
		if (cantidadPersonas > 1) {
			esPareja =true;
			
		}else {
			esPareja = false;
		}
		
		System.out.println("---->" + esPareja); //esPareja ya esta inicializada;
		
		
		boolean puedeEntrar = edad >= 18 && esPareja; //esPareja compila por que previamente fue inicializada;
		if (puedeEntrar) {
			System.out.println("Sea bienvenido");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}

		System.out.println();

	}

}

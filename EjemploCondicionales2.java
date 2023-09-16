package java_primeros_pasos;
//Da doble clic en la pestaña con el nombre de archivo para maximizarla

public class EjemploCondicionales2 {
	public static void main(String[] args) {

		int edad = 15;
		int cantidadPersonas = 2;

		if (edad >= 18 || cantidadPersonas >= 2) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}

		System.out.println();

		if (edad >= 18 && cantidadPersonas >= 2) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}

		System.out.println();
		
		// Boolean, variable del tipo primitivo: true false;
		edad = 21;
		boolean esPareja = true;

		if (edad >= 18 && esPareja == true) { // ponemos "==" porque estamos comparando, no asignado un valor
			// (edad >=18 && esPareja) -->Es lo mismo que la condicion de arriba
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}

		System.out.println();
		edad = 18;
		esPareja = false;

		if (edad >= 18 && esPareja == false) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}

		// Checa lo siguiente:
		System.out.println();
		cantidadPersonas = 3;
		edad = 22;
		boolean sonPareja = cantidadPersonas > 1;
		System.out.println("El valor de la varialble boolean es: " + sonPareja + "  ;)");

		if (edad >= 18 && sonPareja) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}

		// Otro ejemplo:
		System.out.println();
		cantidadPersonas = 1;
		edad = 18;
		sonPareja = cantidadPersonas > 1; // Esta expresion es false; cantidadPersonas es de solo 1;

		if (edad >= 18 && sonPareja) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}

		// usando otra variable boolena:
		System.out.println();
		cantidadPersonas = 3;
		edad = 22;
		sonPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && sonPareja;

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}
		System.out.println("Puede entrar es :" + puedeEntrar);

		// Otro ejemplo, en este ejemplo, fijate como "no" se actualiza la variable
		// puedeEntrar:
		System.out.println();
		cantidadPersonas = 1;
		edad = 17;

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}

		System.out.println("Puede entrar es :" + puedeEntrar);

		// Otro ejemplo, en este ejemplo, fijate como "sí" actulizamos la variable
		// puedeEntrar:
		System.out.println();
		cantidadPersonas = 1;
		sonPareja = cantidadPersonas > 1;
		edad = 18;
		puedeEntrar = edad >= 18 && sonPareja;

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}

		System.out.println("Puede entrar es :" + puedeEntrar);

		// Un ejemplo mas:

		System.out.println();
	    cantidadPersonas = 3;
	    edad=18;
		boolean conAmigos = cantidadPersonas >=2;
		boolean edadPermitida = edad >= 18;
		puedeEntrar = edadPermitida && conAmigos;

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}

		System.out.println("Puede entrar es :" + puedeEntrar);
		
		//-------->
		
		System.out.println();
	    cantidadPersonas = 2;
	    edad=17;
		
	    conAmigos = cantidadPersonas >=2;
		edadPermitida = edad >= 18;
		
		puedeEntrar = conAmigos && edadPermitida;

		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no tiene permitida la entrada");

		}

		System.out.println("Puede entrar es :" + puedeEntrar);

	}

}

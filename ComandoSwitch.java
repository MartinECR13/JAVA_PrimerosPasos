package java_primeros_pasos;
//Vimos como hacer pruebas con if;¿y si necesitamos hacee varias pruebas?

//Ejemplo: tenemso una variable --> mes; que necesitamso probrar su numero e imprimir su mes
//correspondiente, Entonces ,¿haremos 12 if?
//Alternativa: if/else --> switch. Ésta es una estructura de control, permite ejecutar difereentes acciones
//basadas en el valor de la expresion.
//I.E. es una forma mas simple y legible de escribir varios bloques 
//if/else encadenados.

public class ComandoSwitch {

	public static void main(String[] args) {
		// Sintaxis switch:

//		switch (variableASerProbaba) {
//		case opcion1:
//			comando (s) si se ha elegido al opcion 1
//			break;
//		case opcion2:
//			comando (s) si se ha elegido la opcion 2
//			break;
//		case opcion3:
//			comando(s) si se ha elegido al opcion 3
//			break;
//		default:
//			comando (s) si ninguna de las anteriores opciones ha sido elegida
//			
//		}

		// El codigo qeu se ejecutara, que en nuestro caso sera la
		// impresion del nombre del mes, sera el codigo donde se
		// cumple la condicion:

		int mes = 10;

		switch (mes) {
		case 1:
			System.out.println("El mes es enero");
			break;
		case 2:
			System.out.println("El mes es febrero");
			break;
		case 3:
			System.out.println("El mes es marzo");
			break;
		case 4:
			System.out.println("El mes es abril");
			break;
		case 5:
			System.out.println("El mes es mayo");
			break;
		case 6:
			System.out.println("El mes es junio");
			break;
		case 7:
			System.out.println("El mes es julio");
			break;
		case 8:
			System.out.println("El mes es agosto");
			break;
		case 9:
			System.out.println("El mes septiembre");
			break;
		case 10:
			System.out.println("El mes es octubre");
			break;
		case 11:
			System.out.println("El mes es noviembre");
			break;
		case 12:
			System.out.println("El mes es diciembre");
			break;
		default:
			System.out.println("Mes invalido");
			break;
		}
		
		System.out.println();
		// El break interrumpira la ejecucion del caso qeu lo contien,de
		// modo qeu los demas no se ejecutran y si no se aceptan condiciones, se
		// ejecutará el codigo
		// default. Por ejemplo:

		mes = 13;

		switch (mes) {
		case 1:
			System.out.println("El mes es enero");
			break;
		case 2:
			System.out.println("El mes es febrero");
			break;
		case 3:
			System.out.println("El mes es marzo");
			break;
		case 4:
			System.out.println("El mes es abril");
			break;
		case 5:
			System.out.println("El mes es mayo");
			break;
		case 6:
			System.out.println("El mes es junio");
			break;
		case 7:
			System.out.println("El mes es julio");
			break;
		case 8:
			System.out.println("El mes es agosto");
			break;
		case 9:
			System.out.println("El mes septiembre");
			break;
		case 10:
			System.out.println("El mes es octubre");
			break;
		case 11:
			System.out.println("El mes es noviembre");
			break;
		case 12:
			System.out.println("El mes es diciembre");
			break;
		default:
			System.out.println("Mes invalido");
			break;
		}
		System.out.println("Impresion del Mes: invalido");
		System.out.println("Switch-> solucion para ifs encadenados");
		
		//Ventajas:
		//*Codigo mas facil de entender y mas legible;
		//*Es ideal cuando hay multiples condiciones posibles.


	}

}

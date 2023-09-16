package java_primeros_pasos;

public class EjerciciosTablaMultiplicacion {
	public static void main(String[] args) {

		// Vamos a imprimir todos los multiplos de 1...2... hasta el 10;

		for (int contador = 1; contador <= 10; contador++) {

			for (int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
				// Lo queremos es hallar el resultado de multiplicacion con contador
				// Aqui contador en su primera iteracion sera: 1;
				// Una vez termine de iterar hasta: multiplicacion <=10;
				// saldrá de este ciclo for anidado y contador pasará a : 2;
				// y entrara nuevamente a este for anidado;
				System.out.print(contador * multiplicacion); // .print -->imprime todo en una sola linea;
				System.out.print(" "); // --> dará un espacio entre cada valor;

			}
			System.out.println(); // daremos un salto de linea entre cada iteracion, esto esta fuera del for anidado
		}

		// Ahora imprimiremos una matriz de 10 * 10:
		System.out.println();

		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		// Ahora imprimiremos la anterior matriz de la siguiente forma :
		// Utilizaremos--> Ciclo break --> con break rompemos el ciclo;
		// Aun cuando la condicion es verdadera;
		// *
		// **
		// ***
		// ****

		System.out.println();

		for (int y = 0; y <= 10; y++) {
			//Primera iteracion y = 0;
			for (int x = 0; x <= 10; x++) {
				//Primera iteracion x = 0;
				// Si "x" es mayor o igual "y";
				//  x>y;
				//  0>0?                   -> (*);       1>0(true) -> break;
				//  0>1?; 1>1?;            -> (**);      2>1(true) -> break;
				//  0>2; 1>2 ; 2>2;        -> (***);     3>2(true) -> break;
				//  0>3; 1>3 ; 2>3; 3>3 ;  -> (****);    4>3(true) -> break;
				//  
				if (x > y) {  //En cada iteracion entra a este if y chequea si la condicion es true;
					
					break;    // Rompe el ciclo si la condicion se vuelve true;
				}
				System.out.print("* ");// Se imprime si la condicion es false;
			}
			System.out.println();  //Salto de linea en cada iteracion; esto esta fuera del ciclo for anidado
		}
		
		//Otra forma de resolverlo:
		for (int y = 0; y <= 10; y++) {
			//Primera iteracion: y = 0;
			//Segunda iteracion: y = 1;
			for(int x = 0; x<y ; x++ ) {
				//Mientras x< y se imprime "* ";
				//0<0; 
				//0<1; 1<1;
				//0<2; 1<2; 2<2;
				// .............
				
				System.out.print("* ");
			}
			System.out.println(); //salto de linea en cada iteracion, esto esta fuera del ciclo for anidado
		}
		
		
		
		

	}

}

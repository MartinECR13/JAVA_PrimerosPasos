package java_primeros_pasos;

public class Factorial {
	public static void main(String[] args) {
		// Imprimir factoriales del 1 al 10;

//		El factorial de 0 es 1;
//		El factorial de 1 es (0!) * 1 = 1;
//		El factorial de 2 es (1!) * 2 = 2;
//		El factorial de 3 es (2!) * 3 = 6;
//		
//		O sea:
//		
//		El factorial de 4! es = 1 * 2 * 3 * 4 = 24;
			int factorial = 1;
		
		for (int i = 1; i <= 10; i++) {
			factorial *= i;
			System.out.println("El factorial de : " + i +" es " +factorial);
			
			
		}

	}

}

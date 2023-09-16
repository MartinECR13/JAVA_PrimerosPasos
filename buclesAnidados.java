package java_primeros_pasos;

public class buclesAnidados {
	public static void main(String[] args) {
		//Ayuda a imprimir lo siguiente:
		//1
	    //12
		//123
	    //.................10
		
		for(int y = 0; y <= 10 ; y++ ) {
			for(int x = 0; x<=y; x++ ) {
				System.out.print(x);
				System.out.print(" ");
			}
			System.out.println(":)");
		}
		
		//Tambien se puede de la siguiente manera:
		System.out.println();
		
		for(int y = 0; y <= 10 ; y++ ) {
			for(int x = 0; x <= 10; x++ ) {
				if(x>y) {
					break;
				}
				System.out.print(x);
				System.out.print(" ");
			}
			System.out.println(":)");
		}
		
		//Para más detalles revisa:
		//EjerciciosTablaMultiplicacion.java
		
		
		
		
		
		
	}	
	
	

}

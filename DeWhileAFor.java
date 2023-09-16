package java_primeros_pasos;
//Ayuda a transformar el siguiente ciclo while a for:

public class DeWhileAFor {
	public static void main(String[] args) {
		int contador = 0;
		
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println();
		System.out.println(contador);
		System.out.println();
		
		//Tansformando a for, utilizando la misma variable contador:
		//Fijate como dentro del for no es necesaria la sintaxis --> int contador = 0;
				
		for ( contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		System.out.println();
		
		System.out.println("Fijate que llega a: " + contador + " pero al estar fuera de la condicion; "
				+ "éste no se imprime dentro de for o while");
		
		
		//For con una variable diferente:
		//ademas obtenemos la suma de los numeros del 1 al 10;
		System.out.println();
		int suma = 0;
		
		for(int contar = 0; contar <= 10; contar++) {
			suma = contar + suma;         //1era iternacion--> sum= 0 + 0;
			System.out.println("La suma va en: " + suma);
			System.out.println();
			System.out.println("El contador va en: "+ contar);   //2da it --> suma = 0 + 1;
		}                                 //3ra it ---> suma = 1 + 2;
		                                  //       ................
		                                  //11va it ---> suma = 45 + 10;
		
		System.out.println();
		System.out.println("El total es:" + suma);
		

		
		
	}

}

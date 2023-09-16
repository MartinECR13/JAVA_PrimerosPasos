package java_primeros_pasos;
//Un ciclo es ejecutar cierta parte de codigo mientras se cumpla

//cierta condición o la condicion sea verdadera.

public class EjemploCiclosWhile {
	public static void main(String[] args) {
		// Ejemplo: Yo necesito imprimir todos los numeros del 1 al 10:
		// Un ciclo nos ayuda a ejecutar una tarea repetitiva;

		int contador = 0;

		// while ejecutara mi ciclo, siempre y cuando la condicion
		// dentro de los parentesis sea verdadera;
		// while(ExpresionBooleana){
		// codigo}

		while (contador <= 10) {          // Mientras (condicion sea verdadero){
			System.out.println(contador); // Ejecuta esto:
			contador = contador + 1;      // En cada iteracion contador tiene que
										    // aumentar (hasta alcanzar) o la condicion siempre sera
										    // verdadera y tendremos un bucle infinito;
		}								  // }
		
		//Tambien podemos escribirla de la siguiente manera:
		System.out.println();
		contador = 0;
		while(contador <= 10) {
			System.out.println(contador);
			contador += 1;  //tambien puede ser --> contador++;
		}
		
		//Si queremos que imprima de dos en dos:
		System.out.println();
		contador = 0;
		while(contador <= 10) {
			System.out.println(contador);
			contador += 2;
		}
		
		//Y, si yo deseo hallar la suma de todos los numero del 1 al 10?
		
		//Checa la class EjercicioCiclos2;
		
		
		
		
		
		
		
		
		
		
		

	}

}

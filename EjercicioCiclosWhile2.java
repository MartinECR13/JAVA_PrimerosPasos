package java_primeros_pasos;
//*Refactor --> rename : para cambiar de nombre al archivo

//sin que éste tenga problemas de compilacion.

public class EjercicioCiclosWhile2 {
	public static void main(String[] args) {
		
		//Vamos a hallar la suma de todos lo numeros del 1 al 10:
		

		int contador = 0;
		int total = 0;  //Declaramos total fuera del while;
		                //para que vaya guardando;
		 				//si lo ponemos dentro del while-->siempre sera 0;
		

		while (contador <= 10) {		//Cada vez qeu vaya iterando se imprimirá la suma;
			total = total +  contador;  //que vaya al momento.
			System.out.println(total);
			contador ++;
		}
		
		//Y si queremos solo la suma final:
		System.out.println();
		
		contador = 0;
		total = 0;
		
		while(contador <= 10) {
			total = total + contador;
			contador ++;
		}
		
		
		System.out.println("El total es: " + total);
		
		
		
		
		

	}

}

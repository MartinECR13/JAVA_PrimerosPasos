package java_primeros_pasos;

public class EjemploCaracteres {
	public static void main(String[] args) {
		//DAto chart
		//--> solo acepta un solo caracter o un numero (Estos representan la tabla ASCII:
		
		 char caracter = 'a'; //Va entre comillas simples; no soporta valores vacios
		 System.out.println(caracter);
		 
		 caracter = 1;
		 System.out.println(caracter);
		 
		 caracter = 65;
		 System.out.println(caracter);
		 
		 caracter = 65 + 1;
		 System.out.println(caracter);
		 
		 //Cast
		 char segundoCaracter = (char)(caracter +1); //(tipo chart) (Este resultado qeuiro qeu sea tipo char)
		 System.out.println(segundoCaracter);
		 
		 //String -->ya no es un dato primitivo es un Objeto de JAVA:
		 
		 String palabra = "Alura cursos online";
		 System.out.println(palabra);
		 
		 //Concatenando Strings
		 palabra = palabra + " 2020";
		 
		 System.out.println(palabra);
		 String cuota1 ="10";
		 String cuota2 = "20";
		 System.out.println(cuota1 + cuota2);
		 
	}

}

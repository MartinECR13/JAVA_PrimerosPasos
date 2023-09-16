package java_primeros_pasos;

public class TipoVariable {
	public static void main(String[] args) {
		System.out.println("Hola Mundo!!!");
		 //Numeros enteros --> int
		 int edad = 28;
		 System.out.println(edad);
		 
		 //sobreescribiendo valor
		 edad = 47;
		 System.out.println(edad);
		 
		 //Podemos realizar operaciones aritmeticas dentro de la variable
		 edad = 46 + 48;
		 //Concatenacion de valores
		 System.out.println("Mi edad es: " + edad);
		 
		 
		 //Trabajando con valores decimales --> double:
		 double salario = 1250.56;
		 System.out.println(salario);
		 
		 double miEdad = 28; //con double tenemos en doble de espacio de bits para almacenar valores
		 double miSalario = salario / 2; //double soporta division
		 System.out.println(miSalario);
		 
		 //Dividiendo con int:
		 int division = 1250 /3;
		 System.out.println(division);//El resultado será redondeado--> 416. Cuando el resultado es 416.6666
		 
		 //En JAVA no podemos utlizar una variable si no ha sido inicalizada y declarada.
		 
		 //"Cast"-->tranformar un tipo de variable en otro tipo:
		 double variable1 = 230.89;
 		 int variableEntero = (int) variable1; //Cast, en este caso solo se imprimira la parte entera 230
 		 
 		 System.out.println(variableEntero);
 		 
 		 //int soporta hasta 32 bits; ie numeros muy grandes nos daran un error; para ello
 		 //usamos long:
 		 
 		 int prueba1 = 1222222222;  //intenta agregar mas numero y te aparecera un error de compilacion
 		 long prueba = 1222222222222222222L; //Utilizamos la "L" al final;
 		 System.out.println(prueba);
 		 
 		 //Otro tipo de dato-->short ; tipo de dato de hasta 16 bits:
 		 
 		 short numeroPequeno = 13555;
 		 
 		 //--> byte 8 bits de tamaño
 		 byte numeroAunMasPequeno = 99;
 		 
 		 //float --> soporta decimales pero es mas pequeño:
 		 
 		 float numeroDecimalPequeno = 2.5F;//Agregamos "F" al final del numero;
 		 
 		 //Podemos sumar variables:
 		 int resultado = (int) variable1 + variableEntero;
 		 System.out.println("El resultado es: " + resultado);
	}
	}



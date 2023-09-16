package java_primeros_pasos;

public class EjemploCondicionales {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println();
		
		int edad = 28;
				   //Condicionales
		   //(condicion)
		if(edad >= 18) {
		   //{codigo que se ejecuta si la condicion es true}
			System.out.println("Usted puede entrar");
			System.out.println("Bienvenido");		
		}
		System.out.println();
		//Tambien se puede escribir de la sigueinte manera
		//Ten cuidado con la identacion...en JAVA es indispensable
		
		
		edad = 17;
		//No utilizamos llaves pero si identacion y solo se ejecuta una linea del codigo
		if (edad >= 18)
			System.out.println("Usted puede pasar");
		System.out.println("Bienvenido");
		System.out.println();
		
		//Tenemos otra condicion --> else    
		//En caso que la condicion no se cumpla:
		
		edad = 15;
		 if (edad >= 18) {
			 System.out.println("Usted puede entrar");
		 }else {
			 System.out.println("Usted no tiene permitida la entrada");
		 }
		 
		 System.out.println();
		 
		 //Pero si vienes con amigos, si puedes entrar
		 edad = 15;
		 int amigos = 2;
		 
		 if (edad >= 18) {
			 System.out.println("Usted puede entrar");
		 }else {
			 if (amigos >= 1 ) {
				 System.out.println("Usted es menor de edad pero: Adelante caminante");
			 }else {
					System.out.println("Usted no tiene permitida la entrada");	 
			 }
			 
		 }
		 
		 //Haz doble clic en: Console --> maximiza la ventana consola 
		 //DOble clic en console para minimizar ventana
		
		
	}

}

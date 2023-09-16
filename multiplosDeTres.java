package java_primeros_pasos;
//Un bucle para imprimir todos los multiplos de 3 entre
//1 y 100;
public class multiplosDeTres {
	public static void main(String[] args) {
		
		for(int y = 3; y <4 ; y++ ) {
			
			for(int x = 0; x<= 100; x++ ) {
				int multiplosTres = x * y;
				if (multiplosTres >= 100) {
					break;
				}
					
				System.out.println(multiplosTres);
			}
			System.out.println(":)");
		}
		
		//Otra forma es:
		System.out.println();
		for(int y = 0; y <= 100 ; y++ ) {
			if (y % 3 == 0) {
				System.out.println(y);
			}
		}
		
		//Otra forma es:
				System.out.println();
				for(int y = 3; y <= 100 ; y+=3 ) {
					System.out.println(y);
				}
		
		
		
		
		
		
		
		
		
	}

}

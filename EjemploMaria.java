package java_primeros_pasos;
//Maria es una propietaria de una tienda de ropa:
//Si el valor de la compra estra entre 100 y 199.99 el descuento es del 10%
//Si el valro de la compra esta entre 200 y 299.99 el descuento es del 15
//Compras superiores a 300, el descuento es del 20%

public class EjemploMaria {
	public static void main(String[] args) {
		
		double compra = 700;  //Modifica el valor de compra y ve lo que sucede:
	    boolean descuento10 = compra >= 100 && compra <= 199.99;
	    boolean descuento15 = compra >= 200 && compra <= 299.99;
	    boolean descuento20 = compra >=300;
	    
	    if(descuento10) {
	    	compra = compra - (compra * 0.1);
	    	System.out.println("Usted tiene un descuento del 10%, su pago total es de: " + compra);
	    	
	    }else if (descuento15) {
	    	compra = compra - (compra * 0.15);
	    	System.out.println("Usted tiene un descuento del 15%, su pago total es de: " + compra);
	    }else if (descuento20) {
	    	compra= compra -(compra * 0.20);
	    	System.out.println("Usted tiene un descuento del 20%, su pago total es de: " + compra);
	    }else {
	    	System.out.println("Gracias por su compra, su pago es de: " + compra);
	    }
	    
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}

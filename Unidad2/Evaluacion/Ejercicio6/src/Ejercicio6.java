import java.util.Scanner;

public class Ejercicio6 {
	

		public static void main(String[] args) {
	
		float precioreal, precioventa, descuento;
		
		// Pido los datos necesarios
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el precio real y pulsa Intro:");
		precioreal=lector.nextFloat();
		System.out.println("Introduce el precio de venta y pulsa Intro:");
		precioventa=lector.nextFloat();
		
		// Hago los cálculos
		

		descuento=100-((100*precioventa)/precioreal);
		
		
		//Lanzo a pantalla los calculos
		
		System.out.println("El porcentaje es "+descuento);
		}




}

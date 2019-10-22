import java.util.Scanner;

public class Practica7 {
	

		public static void main(String[] args) {
	
		float alto, ancho, area, perimetro;
		
		// Pido los datos necesarios
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el alto del rectangulo y pulsa Intro:");
		alto=lector.nextFloat();
		System.out.println("Introduce el ancho del rectangulo y pulsa Intro:");
		ancho=lector.nextFloat();
		
		// Hago los cálculos
		
		area=alto*ancho;
		perimetro=2*alto+2*ancho;
		
		//Lanzo a pantalla los calculos
		
		System.out.println("El area del rectangulo es "+area+" y el perimetro "+perimetro);
		}




}

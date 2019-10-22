import java.util.Scanner;

public class Prac11 {

	public static void main(String[] args) {
		
		float a, b, c, x;
		
		// Leo los segundos
		Scanner lector=new Scanner(System.in);
		
		System.out.println("Dame el coeficiente a y pulsa Intro");
		a=lector.nextFloat();
		if (a!=0) {
		System.out.println("Dame el coeficiente b y pulsa Intro");
		b=lector.nextFloat();
		
		System.out.println("Dame el resultado c y pulsa Intro");
		c=lector.nextFloat();
		
		
		// Realizo los calculos
	
		x=(c-b)/a;
		
		System.out.println("El valor de x es "+x);
		} else {System.out.println("Error, a distinto de 0");}
	}
}

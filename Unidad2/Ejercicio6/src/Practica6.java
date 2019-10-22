import java.util.Scanner;

public class Practica6 {
	public static void main(String[] args) {
		
		// Defino los variables
		
	int num1, num2;
	int intercambio;
	Scanner lector=new Scanner(System.in);
	
	
	//Leo los valores y los muestro
	
	System.out.println("Dame un numero y pulsa Intro:");
	num1=lector.nextInt();
	System.out.println("Dame otro numero y pulsa Intro:");
	num2=lector.nextInt();
	System.out.println("Los valores proporcionados son num1: "+num1+" y num 2: "+num2);
	
	
	//los intercambio
	
	intercambio=num1;
	num1=num2;
	num2=intercambio;
	
	// Muestro de nuevo las variables, ya intercambiadas
	System.out.println("Los valores intercambiados son num1: "+num1+"  num 2: "+num2);
	}

}

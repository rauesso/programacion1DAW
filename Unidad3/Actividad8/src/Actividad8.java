import java.util.Scanner;
public class Actividad8 {
	public static void main(String[] args) {
		
		int a, b, contadorpares=0;
		
		Scanner lector=new Scanner(System.in);
		
		do {
		
		System.out.println("Introduce el número A y pulsa intro: ");
		a=lector.nextInt();
		System.out.println("Introduce el número B y pulsa intro: ");
		b=lector.nextInt();
		
		} while (a>=b);
		
		System.out.print("Los números entre "+a+" y "+b+" son: ");
		for (int x=a; x<=b; x++) {
			System.out.print(x+" ");
			if (x%2==0) contadorpares++;
		}
		System.out.println("");
		System.out.print("El numero de pares es: "+contadorpares);
		
		lector.close();
	}
}

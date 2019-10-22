
import java.util.Scanner;
public class Actividad12 {
	public static void main(String[] args) {
	
		int a, suma=0;
		Scanner lector=new Scanner(System.in);

		//Solicito el numero al usuario
		
		System.out.println("Introduce un numero y pulsa Intro");
		a=lector.nextInt();
		
		for (int i=1;i<a;i++) {
			if (a%i==0) suma++;
		}
		if (suma==1) System.out.println("El numero "+a+" es primo.");
		else System.out.println("El numero "+a+" no es primo.");
		
		lector.close();
	}

}
import java.util.Scanner;

public class Prac10 {

	public static void main(String[] args) {
		
		int gradc, gradf;
		
		// Leo los grados C
		Scanner lector=new Scanner(System.in);
		
		System.out.println("Dame los grados en C y pulsa Intro");
		gradc=lector.nextInt();
		
		// Realizo los calculos
		gradf=(9/5)*gradc+32;
		
		
		
		System.out.println("Los grados F son: "+gradf);
		
	}
}
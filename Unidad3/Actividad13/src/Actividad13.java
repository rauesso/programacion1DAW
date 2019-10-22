import java.util.Scanner;
public class Actividad13 {
	public static void main(String[] args) {
	
		int a, factor=2, contadorfactor;
		
		Scanner lector=new Scanner(System.in);

		//Solicito el numero al usuario
		
		do {
		System.out.println("Introduce un numero y pulsa Intro");
		a=lector.nextInt();
		} while (a<=0);
		
		while (a>1) {
			
			contadorfactor=0;
			while ((a%factor==0)){
				contadorfactor++;
				a=a/factor;
			}
		if (contadorfactor>0) {
			System.out.print(factor+"^"+contadorfactor+" ");
		}
		factor++;

		} // del while externo
		
		
		lector.close();
	}

}
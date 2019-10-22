
import java.util.Scanner;
public class Actividad11 {
	public static void main(String[] args) {
	
		int a, b;
		double resultado=1;
		
		Scanner lector=new Scanner(System.in);

		//Solicito los datos al usuario
		
		System.out.println("Introduce el numero A y pulsa Intro");
		a=lector.nextInt();
		
		System.out.println("Introduce el numero B y pulsa Intro");
		b=lector.nextInt();		
		
		if (a==0)
			{
			System.out.println("El resultado de A elevado a B es 0");
			}//del primer if 
				else if (b==0) 
				{
				System.out.println("El resultado de A elevado a B es infinito");
				}//del segundo if
					else if (b<0) {
					resultado=1;
					for (int i=1;i<=-b;i++) {
						resultado=resultado*a;
					}//del for
					resultado=1/resultado;
					System.out.println("El resultado de A elevado a B es: "+resultado);
					}// del tercer if
					else {
						resultado=1;
						for (int i=1;i<=b;i++) {
							resultado=resultado*a;
						}//del for
						System.out.println("El resultado de A elevado a B es: "+resultado);
					} //del cuarto if
		
		
		lector.close();
	}

}
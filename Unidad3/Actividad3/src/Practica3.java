import java.util.Scanner;


public class Practica3 {

public static void main(String[] args) {
		

		String nombre, padres;
		int edad;
		float cuota=0, cuotageneral=500, mayor=(float) 0.5, menor=(float) 0.25, menorpadre=(float) 0.35; 
		
		// pedimos datos
		Scanner lector=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre y pulsa intro: ");
		
		nombre=lector.nextLine();

		System.out.println("Introduce tu edad y pulsa intro: ");
		
		edad=lector.nextInt();
		
		if (edad<18) {
			
			do {
			
				System.out.println("Tus padres son socios (Si/No)????[pulsa intro]: ");
			
				padres=lector.next();
				

			
				if (padres.equals("Si")) {
				
					cuota=cuotageneral-(cuotageneral*menorpadre);	

				} else if (padres.contentEquals("No")) {
				
				
					cuota=cuotageneral-(cuotageneral*menor);					
				
				} 

			
			} while (!padres.equals("Si") && !padres.equals("No")); //do
			
			
			
			
			
			
			
		} // menor de edad
		
		else {
			
			if (edad>65) {
			cuota=cuotageneral-(cuotageneral*mayor);			
			
			} else cuota=500;		
			


			
		}
		
		System.out.println("La cuota a pagar es "+cuota);
		
		lector.close();
		
	

} // del metodo mail
	
	
} // de la clase

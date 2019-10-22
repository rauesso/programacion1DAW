

public class Actividad9 {
	
	public static void main(String[] args) {
		
		int contadorpares=0, sumapares=0, contadorimpares=0, sumaimpares=0;
		int contador7=0, suma7=0;
		
		for (int x=1; x<=100; x++) {
			
			System.out.print(x+" ");
			
			//pares
			
			if (x%2==0) {
				
				contadorpares++;
				sumapares=sumapares+x;
				
			}
			
			//impares
			
			if (x%2!=0) {
				
				contadorimpares++;
				sumaimpares=sumaimpares+x;
				
			}
			
			
			
			// Multiplos de 4 y 7, son aquellos que divididos entre 4 dan resto 0, y entre 7 tambien
			
			if ((x%4==0) && (x%7==0)) {
				
				contador7++;
				suma7=suma7+x;

				
			}
			
			
			
		}
		System.out.println("");
		System.out.println("El numero de pares es: "+contadorpares+" y su suma "+sumapares);
		System.out.println("El numero de impares es: "+contadorimpares+" y su suma "+sumaimpares);
		System.out.println("El numero multiplos de 4 y 7 es: "+contador7+" y su suma "+suma7);
		

	}

}

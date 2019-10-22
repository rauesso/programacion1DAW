
public class Actividad7 {
	public static void main(String[] args) {
		int contadorimpares=0, contadorpares=0, contador5=0;
		
			//impares
		
			System.out.print("Numeros impares: ");
		
			for (int x=1;x<=99;x=x+1) {
				if (x%2!=0) {
					contadorimpares++;
					System.out.print(x+" ");
				}
				
			}
			System.out.println("");
			System.out.print("Numero de numeros impares: "+contadorimpares);
					
			//pares
			
			System.out.println("");
			System.out.print("Numeros pares: ");
		
			for (int x=1;x<=99;x=x+1) {
				if (x%2==0) {
					contadorpares++;
					System.out.print(x+" ");
				}
				
			}
			System.out.println("");
			System.out.print("Numero de numeros pares: "+contadorpares);
			
			//multiplos de 5
			
			System.out.println("");
			System.out.print("Numeros multiplos de 5: ");
		
			for (int x=1;x<=99;x=x+1) {
				if (x%5==0) {
					contador5++;
					System.out.print(x+" ");
				}
				
			}
			System.out.println("");
			System.out.print("Numero de numeros multiplos de 5: "+contador5);
		}

}

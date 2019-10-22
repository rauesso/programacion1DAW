
public class Actividad14 {
	public static void main(String[] args) {
		
		int numerocaras=0, numerocruces=0;
		float porcentajecaras, porcentajecruces;
		double moneda;
		for (int i=1;i<=1000000;i++) {
			moneda=Math.random();
			// si el numero es menor que 0,5, cara, sino, cruz
			if(moneda<0.5) numerocaras++;
			else numerocruces++;;
		}
		porcentajecaras=(numerocaras*100)/1000000f;
		porcentajecruces=(numerocruces*100)/1000000f;
		System.out.println("El numero de caras es: "+numerocaras+" "+porcentajecaras+"%");
		System.out.println("El numero de cruces es: "+numerocruces+" "+porcentajecruces+"%");
	}

}

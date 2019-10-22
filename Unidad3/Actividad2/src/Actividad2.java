import java.util.Scanner;
public class Actividad2 {
	public static void main(String[] args) {
		
		double pasta, pastacentimo;
		
		int euro2, euro1, centimo50, centimo20, centimo10, centimo5, centimo2, centimo1;
		
		
		Scanner lector=new Scanner(System.in);
		
		System.out.println("Introduce el importe sobre el que trabajar y pulsa intro: ");
		
		pasta=lector.nextDouble();
		
		
		// realizamos los calculos
		
		pastacentimo=pasta*100;
		
		//calculos de monedas de 2 euros
		
		euro2=0;
		
		while (pastacentimo>=200) {
			pastacentimo-=200;
			euro2++;
		}
		
		//calculos de monedas de 1 euro
		
		euro1=0;
		while (pastacentimo>=100) {
			pastacentimo-=100;
			euro1++;
		}
		
		//calculos de monedas de 50 centimos
		
		centimo50=0;
		while (pastacentimo>=50) {
			pastacentimo-=50;
			centimo50++;
		}
		
		//calculos de monedas de 20 centimos
		
		centimo20=0;
		
		
		while (pastacentimo>=20) {
			pastacentimo-=20;
			centimo20++;
		}
		
		
		//calculos de monedas de 10 centimos
		
		centimo10=0;
		
		while (pastacentimo>=10) {
			pastacentimo-=10;
			centimo10++;
		}
		
		
		//calculos de monedas de 5 centimos
		
		centimo5=0;
		while (pastacentimo>=5) {
			pastacentimo-=5;
			centimo5++;
		}
		
		//calculos de monedas de 2 centimos
		
		centimo2=0;
		while (pastacentimo>=2) {
			pastacentimo-=2;
			centimo2++;
		}
		
		
		//calculos de monedas de 1 centimos
		
		centimo1=0;
		
		while (pastacentimo>=1) {
			pastacentimo-=1;
			centimo1++;
		}
	
		
		System.out.println("La descomposicion en monedas es: ");
		System.out.println(euro2+" monedas de 2 euros.");
		System.out.println(euro1+" monedas de 1 euros.");
		System.out.println(centimo50+" monedas de 50 centimos.");
		System.out.println(centimo20+" monedas de 20 centimos.");
		System.out.println(centimo10+" monedas de 10 centimos.");
		System.out.println(centimo5+" monedas 5 centimos.");
		System.out.println(centimo2+" monedas de 2 centimos.");
		System.out.println(centimo1+" monedas de 1 centimo.");
		
		lector.close();
		
	}

}

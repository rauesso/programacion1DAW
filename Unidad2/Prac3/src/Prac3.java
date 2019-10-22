import java.util.Scanner;
public class Prac3 {
	public static void main(String[] args) {
		
		int x1, y1, x2, y2;
		
		double distancia;
		
		
		// leo las coordenadas de los puntos
		Scanner lector=new Scanner(System.in);
		
		System.out.println("Dame  la coordenada X del primer punto y pulsa Intro");
		x1=lector.nextInt();
		System.out.println("Dame la coordenada y del primer punto y pulsa Intro");
		y1=lector.nextInt();
		System.out.println("Dame la coordenada x del segundo punto y pulsa Intro");
		x2=lector.nextInt();
		System.out.println("Dame la coordenada y del segundo punto y pulsa Intro");
		y2=lector.nextInt();
		
		// calculo la distancia
		
		distancia=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		
		System.out.println("La distancia entre los dos puntos es:"+distancia);
		
		
		
		
	}
}

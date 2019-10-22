import java.util.Scanner;

public class Prac9 {

	public static void main(String[] args) {
		
		int cantidad, dias, horas, minutos, segundos;
		
		// Leo los segundos
		Scanner lector=new Scanner(System.in);
		
		System.out.println("Dame el número de segundos y pulsa Intro");
		cantidad=lector.nextInt();
		
		// Realizo los calculos
		dias=cantidad/86400;
		horas=(cantidad-dias*86400)/3600;
		minutos=(cantidad-dias*86400-horas*3600)/60;
		segundos=cantidad-dias*86400-horas*3600-minutos*60;
		
		System.out.println("La cantidad de segundos introducida supone: "+dias+" dias, "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos.");
		
	}
}
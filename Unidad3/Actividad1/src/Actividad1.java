import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		
		double nota;
		
		Scanner lector=new Scanner(System.in);
		
		System.out.println("Introduce la nota del alumno, y pulsa intro: ");
		
		nota=lector.nextDouble();
		
		
		if (nota<3) {
			System.out.println("Muy deficiente");
		} else if (nota<5) {
			
			System.out.println("Insuficiente");
		} else if (nota<6) {
			System.out.println("Suficiente");
		} else if (nota<7) {
			System.out.println("Bien");			
		}else if (nota<9) {		
			System.out.println("notable");			
		} else 			
			System.out.println("Sobresaliente");
		
	}

}

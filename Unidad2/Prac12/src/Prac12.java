import java.util.Scanner; 

public class Prac12 {
	
	public static void main(String[] args) {
	
	int num, centena, decena, unidades; 
	// leo el numero
	Scanner lector=new Scanner(System.in);
	
	System.out.println("Dame un numero entero y pulsa Intro");
	num=lector.nextInt();
	// compruebo el numero
	
	if ((num>0) && (num<1000))
	{
	
	//Ahora procedo a descomponer
	
	centena=num/100;
	decena=num/10-(centena*10);
	unidades=num-centena*100-decena*10;
	
	System.out.println("El numero descompuesto es: "+centena+" centenas, "+decena+" decenas y "+unidades+" unidades");
	}// del if
	
	else { System.out.println("En numero no es válido");
	
	} //Del else
	
	
	lector.close();
	
	
	} // del metodo main
	
	
	

}

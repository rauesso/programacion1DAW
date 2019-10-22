
public class Actividad16 {
	
	public static void main(String[] args) {
		
		double inicio=0, rango1=10/6f, rango2=rango1*2, rango3=rango1*3, rango4= rango1*4, rango5=rango1*5, rango6=10;
		
		int numero1=0, numero2=0, numero3=0, numero4=0, numero5=0, numero6=0;
		float porcentaje1, porcentaje2, porcentaje3, porcentaje4, porcentaje5, porcentaje6;
		
		double dado;
		for (int i=1;i<=1000000;i++) {
			dado=Math.random()*10;
			
			// compruebo rangos
			if ((dado>=0) && (dado<rango1)) numero1++;
			else if ((dado>=rango1) && (dado<rango2)) numero2++;
			else if ((dado>=rango2) && (dado<rango3)) numero3++;
			else if ((dado>=rango3) && (dado<rango4)) numero4++;
			else if ((dado>=rango4) && (dado<rango5)) numero5++;
			else if ((dado>=rango5) && (dado<=rango6)) numero6++;
			
		}
		
		
		porcentaje1=(numero1*100)/1000000f;
		porcentaje2=(numero2*100)/1000000f;
		porcentaje3=(numero3*100)/1000000f;
		porcentaje4=(numero4*100)/1000000f;
		porcentaje5=(numero5*100)/1000000f;
		porcentaje6=(numero6*100)/1000000f;
		
		System.out.println("Veces que ha aparecido el numero 1: "+numero1+" "+porcentaje1+"%");
		System.out.println("Veces que ha aparecido el numero 2: "+numero2+" "+porcentaje2+"%");
		System.out.println("Veces que ha aparecido el numero 3: "+numero3+" "+porcentaje3+"%");
		System.out.println("Veces que ha aparecido el numero 4: "+numero4+" "+porcentaje4+"%");
		System.out.println("Veces que ha aparecido el numero 5: "+numero5+" "+porcentaje5+"%");
		System.out.println("Veces que ha aparecido el numero 6: "+numero6+" "+porcentaje6+"%");
	}


}

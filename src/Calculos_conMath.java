
public class Calculos_conMath {

	public static void main(String[] args) {
	
		//Raiz cuadrada
		
		double raiz = Math.sqrt(9);
		
		//Metodo para redondear
		
		double num1 = 5.85;
		
		int resultado = (int)Math.round(num1);  //Refundicion
		
		//Potencia con refundicion
		
		double base = 5;
		
		double exponente = 3;
		
		int resultado2 = (int)Math.pow(base, exponente);
		
		System.out.println(resultado2);

	}

}

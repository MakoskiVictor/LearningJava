
public class PasoPorValor {

	public static void main(String[] args) {
		
		int numero = 10;
		
		// Este me permite usar metodos
		
		// Integer numeroObj = 10; 
		
		System.out.println("Valor original: " + numero);
		
		modificarNumero(numero);
		
		System.out.println("Valor despues  del paso por valor al método: " + numero);

	}
	
	private static void modificarNumero (int numero) {
		numero = 2000;
	}

}

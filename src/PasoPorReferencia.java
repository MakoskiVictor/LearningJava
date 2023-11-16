import java.util.Arrays;

public class PasoPorReferencia {

	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 4, 5 };
		
		System.out.println("Array original: " + array);
		System.out.println("Array original posición 0: " + array[0]);
		System.out.println("Array original con método toString: " + Arrays.toString(array));
		
		modificarArray(array);
		
		System.out.println("Array después de la función: " + array);

	}
	
	private static void modificarArray(int[] array) {
		
		int[] copiaArray = array.clone(); // Se puede crear una copia para no modificar el original
		
		copiaArray[0] = 1000;
		
		System.out.println("Array dentro de la función: " + array);
	}

}

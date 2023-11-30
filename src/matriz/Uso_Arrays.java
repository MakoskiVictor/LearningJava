package matriz;

import java.util.Arrays;

public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mi_matriz = new int[5];
		
		mi_matriz[0] = 5;
		mi_matriz[1] = 15;
		mi_matriz[2] = -25;
		mi_matriz[3] = 35;
		mi_matriz[4] = 45;
		
		System.out.println(Arrays.toString(mi_matriz));
		
		// For each
		for (int numero : mi_matriz) {
			System.out.println(numero);
		}
	}

}

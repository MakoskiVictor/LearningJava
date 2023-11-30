package matriz;

import java.util.Arrays;

public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
				{15, 12, -25, 96},
				{0, 16, 94, -9},
				{-1, 98, 1230, 47},
				{87, 98, -900, 35}
		};
		
		/*
		int[][] matrix = new int[4][5];
		
		
		matrix[0][0] = 15;
		matrix[0][1] = 150;
		matrix[0][2] = 25;
		matrix[0][3] = 14;
		matrix[0][4] = 1;
		
		matrix[1][0] = 42;
		matrix[1][1] = -20;
		matrix[1][2] = -65;
		matrix[1][3] = 95;
		matrix[1][4] = 78;
		
		matrix[2][0] = 14;
		matrix[2][1] = -2;
		matrix[2][2] = 0;
		matrix[2][3] = 500;
		matrix[2][4] = 12000;
		
		matrix[3][0] = 13;
		matrix[3][1] = 12;
		matrix[3][2] = 152;
		matrix[3][3] = -501;
		matrix[3][4] = 13;
		*/
		
		/*
		 * for (int[]number : matrix) {
			System.out.println(Arrays.toString(number));
		}*/
		
		 for (int[] number : matrix) {
			System.out.println();
			for (int value : number) {
				System.out.print(value + " ");
			}
			
		} 
		
		/*for (int i = 0; i < matrix.length; i++) {
			System.out.println("Valores dentro de la posición " + i);
			
			for (int number : matrix[i]) {
				if (number >= 0) {
					System.out.println(number);
				} else {
					System.out.println("Este valor es menor a 0");
				}
				
			}
		}*/
		

	}

}

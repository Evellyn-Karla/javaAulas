package basico3;

import java.util.Arrays;

public class arrayReverse {

	public static void main(String[] args) {
		int num[] = { 20, 17, 22, 16, 36, 57, 33 };
		int n = 0, reverse[] = new int[7];
		int ord[] = new int[7];

		
		System.out.println("Print reverso: ");
		for (int i = 0; i < 6; i++) {
			int z = num.length-i-1;
			System.out.print(num[z] + " ");
		}

		for (int j = 6; j > -1; j--) {
			reverse[n] = num[j];
			n++;
		}

		System.out.println("\n\nO array reverso desordenado é: " + Arrays.toString(reverse));

		 Arrays.sort(reverse);
//		for (int x = 0; x < ; x++) {
//			for (int y = 0; y < 7; y++) {
//				if (reverse[x] < reverse[y]) {
//					menor=reverse[x];
//				}
//				if (reverse[y] < reverse[x]) {
//					menor=reverse[y];
//				}
//			}
//			ord[x] = menor;
//		}

		System.out.println("O array reverso ordenado é: " + Arrays.toString(reverse));

	}

}

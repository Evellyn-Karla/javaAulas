package basico3;
import java.util.*;  

public class fillArray {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		Scanner sc=new Scanner(System.in);   
		 
		System.out.println("Escreva o array: ");  
		for(int i=0; i<10; i++)  
		{   
		array[i]=sc.nextInt();  
		}  
		
		System.out.println("Array: ");  
		 
		for (int j=0; j<10; j++) {
			System.out.print(array[j] + " ");   
		}

	}

}

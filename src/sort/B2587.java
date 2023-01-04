package sort;

import java.util.Scanner;

public class B2587 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		int[] a = new int[5]; 
		int sum = 0; 
		
		for(int i = 0; i<5; i++) {
			a[i] = input.nextInt(); 
			sum += a[i]; 
		}
		
		for(int i = 0; i<5-1; i++) {
			for(int j = i+1; j<5; j++) {
				if(a[i] > a[j]) {
					int temp = a[j]; 
					a[j] = a[i]; 
					a[i] = temp;
				}
			}
		}
		
		System.out.println(sum/5);
		System.out.println(a[2]); 
	}
}

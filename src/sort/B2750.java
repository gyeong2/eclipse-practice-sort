package sort;

import java.util.Scanner;

public class B2750 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		int n = input.nextInt(); 
		int[] a = new int[n]; 
		
		for(int i = 0; i<n; i++) {
			a[i] = input.nextInt(); 
		}
		
		for(int i = 0; i<n-1; i++) {
			for(int j = i+1; j<n; j++) {
				if(a[i] > a[j]) {
					int temp = a[j]; 
					a[j] = a[i]; 
					a[i] = temp; 
				}
			}
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println(a[i]); 
		}
	}
}

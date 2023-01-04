package sort;

import java.util.Scanner;

public class B25305 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		int N = input.nextInt(); //응시자의 수
		int k = input.nextInt(); //상을 받는 사람의 수
		int[] a = new int[N]; 
		
		for(int i = 0; i<N; i++) { //점수 입력받기 
			a[i] = input.nextInt(); 
		}
		
		for(int i = 0; i<N-1; i++) {
			for(int j = i+1; j<N; j++) {
				if(a[j] > a[i]) {
					int temp = a[j]; 
					a[j] = a[i]; 
					a[i] = temp; 
				}
			}
		}
		
		System.out.println(a[k-1]); //커트라인 출력하기 
	}
}

package kr.co.green;

import java.util.Arrays;
import java.util.Scanner;

public class bak_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N , M;
		int total = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[] cards= new int[N];
		System.out.println();
		
		for(int i = 0 ;i < cards.length; i++) {
			cards[i] = sc.nextInt();
		}
		
		for(int i = 0; i < cards.length; i++) {
			
			for(int j = 0; j < cards.length; j++) {
				
				for(int k = 0; k < cards.length; k++) {
					if((i == j || i == k)|| j == k ) {
						break;
					}
					total = cards[i]+cards[j]+cards[k];
					if(total <= M) {
						if(result < total) {
							result = total;
						}
					}
				}
			}
		}
		System.out.println(result);
		
	}

}

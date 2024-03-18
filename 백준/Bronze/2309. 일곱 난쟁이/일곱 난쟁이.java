


import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tall = new int [9];

	
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tall.length; i++) {
			tall[i] = sc.nextInt();
		}
		
		int total = 0;
		for(int i : tall) {
			total += i;
		}
		for(int i = 0; i<tall.length; i++) {
			for(int j =0; j< tall.length; j++) {
				if(j==i) {break;}
				else if((total-(tall[i]+tall[j])) == 100) {
					tall[i] = 0;
					tall[j] = 0;
					}
				}
			if(tall[i] == 0) {break;}
			}
		Arrays.sort(tall);
		for(int i=2; i<tall.length; i++) {
			System.out.println(tall[i]);
		}
		
		}
	}



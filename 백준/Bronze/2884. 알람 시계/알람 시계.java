

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		minute -= 45;
		
		if(minute < 0) {
			hour -=1;
			minute = 60 +minute;
			if(hour == -1) {
				hour = 23;
			}
		}
		else if (minute>0) {
			minute = Math.abs(minute);
		}
		System.out.print(hour+ " "+ minute);

		
	}
}

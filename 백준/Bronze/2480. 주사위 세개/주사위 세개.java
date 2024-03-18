
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int equal = 0;
		int max_num;
		int dice1,dice2,dice3;
		Scanner sc = new Scanner(System.in);
		
		dice1 = sc.nextInt();
		dice2 = sc.nextInt();
		dice3 = sc.nextInt();
		if(dice1 == dice2|| dice1 == dice3) {
			count++;
			equal = dice1;
		}
		if(dice2 == dice3) {
			count++;
			equal = dice2;
		}
		if(dice1>dice2&&dice1>dice3) {
			max_num = dice1;
		}
		else if(dice2>dice3) {
			max_num = dice2;
		}
		else {
			max_num = dice3;
		}
		
		
		switch(count) {
		case 2: System.out.print(10000+(equal)*1000 ); break;
		case 1: System.out.print(1000+(equal)*100 );break;
		case 0: System.out.print((max_num)*100 );break;
		}
			
			
		

		
	}

}

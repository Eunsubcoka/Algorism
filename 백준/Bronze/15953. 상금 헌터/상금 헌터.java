
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		int money = 0;

		Scanner sc = new Scanner(System.in);

		d = sc.nextInt();
		int[] a = new int[d];
		int[] b = new int[d];
		for (int j = 0; j < d; j++) {
			a[j] = sc.nextInt();
			b[j] = sc.nextInt();
		}
		for (int i = 0; i < d; i++) {
			if (a[i] == 0) {
				money += 0 ;
			} else if (a[i] < 22) {
				if (a[i] <= 1) {
					money += 5000000;
				} else if (a[i] >= 2 && a[i] <= 3) {
					money += 3000000;
				} else if (a[i] >= 4 && a[i] <= 6) {
					money += 2000000;
				} else if (a[i] >= 7 && a[i] <= 10) {
					money += 500000;
				} else if (a[i] >= 11 && a[i] <= 15) {
					money += 300000;
				} else if (a[i] >= 16 && a[i] <= 21) {
					money += 100000;
				} else {
					money += 0;
				}
			}
			if (b[i] == 0) {
				money += 0 ;
			} else if (b[i] < 35) {
				if (b[i] <= 1) {
					money += 5120000;
				} else if (b[i] >= 2 && b[i] <= 3) {
					money += 2560000;
				} else if (b[i] >= 4 && b[i] <= 7) {
					money += 1280000;
				} else if (b[i] >= 8 && b[i] <= 15) {
					money += 640000;
				} else if (b[i] >= 16 && b[i] <= 31) {
					money += 320000;
				} else {
					money += 0;
				}
			}
			System.out.println(money);
			money = 0;
		}

	}

}

package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		int m;
		System.out.println("Nhập vào tháng : ");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			System.out.println("Tháng " + m + " có 31 ngày");
		}
		if (m == 2) {
			System.out.println("Tháng " + m + " có 28 hoặc 29 ngày");
		}
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			System.out.println("Tháng " + m + " có 30 ngày");
		} else {
			if (m > 12 || m < 1) {
				System.out.println("Không có tháng " + m);
			}
		}


	}

}

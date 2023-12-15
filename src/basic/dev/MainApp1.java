package basic.dev;

import java.util.Scanner;

public class MainApp1 {

	public static void main(String[] args) {
		// nhap vao mot so nguyen va kiem tra do la so nguyen am hay la nguyen duong

		int m;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao mot so nguyen: ");
		m = sc.nextInt();
		if (m > 0) {
			System.out.println("so nguyen duong");
		} else {
			System.out.println("so nguyen am");
		}
	}
}

package basic.dev;

import java.util.Scanner;

public class MainApp5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập độ dài cạnh a: ");
		int A = sc.nextInt();
		System.out.print("Nhập độ dài cạnh b: ");
		int B = sc.nextInt();
		System.out.print("Nhập độ dài cạnh c: ");
		int C = sc.nextInt();

		if ((A + B > C) && (A + C > B) && (B + C > A)) {
			System.out.println("a, b, c là độ dài của ba cạnh của một tam giác.");
		} else {
			System.out.println("a, b, c không phải là độ dài của ba cạnh của một tam giác.");
		}

	}

}

package t3h.ljava2007a.toantu;

import java.util.Scanner;

public class DieuKienAplication {
	
	public static void main(String[] args) {
		// Bai tap nhap gio dung if else
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap so tu 0 den 24:");
//		int input = scanner.nextInt();
//		
//		if (6 <= input && input <= 18) {
//			System.out.println("Chao buoi sang");
//		} else {
//			System.out.println("Chao buoi toi");
//		}

		// Bai tap in thu su dung switch case
		System.out.println("Nhap so tu 1 den 7");
		int input = scanner.nextInt();

		switch (input) {
		case 1:
			System.out.println("Thu hai");
			break;
		case 2:
			System.out.println("Thu ba");
			break;
		case 3:
			System.out.println("Thu tu");
			break;
		case 4:
			System.out.println("Thu nam");
			break;
		case 5:
			System.out.println("Thu sau");
			break;
		case 6:
			System.out.println("Thu bay");
			break;
		case 7:
			System.out.println("Chu nhat");
			break;
		default:
			System.out.println("Nhap so tu 1 - 7");
			break;
		}
	}
}

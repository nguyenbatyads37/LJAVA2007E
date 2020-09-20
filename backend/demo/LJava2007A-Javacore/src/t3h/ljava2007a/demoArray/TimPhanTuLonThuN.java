package t3h.ljava2007a.demoArray;

import java.util.Scanner;

public class TimPhanTuLonThuN {

	public static void main(String[] args) {
		int[] soNguyen = {5, 89, 55, 182, 54, 44, 154};
		
		sortDESC(soNguyen);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int input = scanner.nextInt();
		System.out.println(soNguyen[input - 1]);
	}
	
	public static void sortDESC(int[] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
//	public static void main(String[] args) {
//		int[] soNguyen = {5, 89, 55, 182, 54, 44, 154};
//		
//		// Sap xep tu len den be
//		int temp = soNguyen[0];
//		for (int i = 0; i < soNguyen.length; i++) {
//			for (int j = i+1; j < soNguyen.length; j++) {
//				if (soNguyen[i] < soNguyen[j]) {
//					temp = soNguyen[j];
//					soNguyen[i] = soNguyen[j];
//					soNguyen[j] = temp;
//				}
//			}
//		}
//		
//		// Lay ra gia tri lon thu n
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(" nhap vao phan tu N: ");
//		int n = scanner.nextInt();
//		System.out.println("số nguyên thứ n "+ soNguyen[n]);
//	}
	

}

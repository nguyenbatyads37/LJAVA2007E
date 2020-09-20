package t3h.ljava2007a.demoArray;

public class ArrayApplication {

	public static void main(String[] args) {
		String[] age = {"123", "", "dsds"};
		int []age1 = {1, 2, 3};
		int age2[] = {1, 2, 3};
		String age3[] = new String[3];
		age3[0] = "Phan tu 1";
		age3[1] = "Phan tu 2";
		age3[2] = "Phan tu 3";
		age3[2] = "Phan tu 3 sau thay doi";
		
		for(int i = 0; i < age3.length; i++) {
			System.out.println(age3[i]);
		}
	}

}

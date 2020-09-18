package t3h.ljava2007a.toantu;

public class VongLapApplication {

	public static void main(String[] args) {
		
		// Vong lap for
		for (int i = 0; i <= 5; i++) {
			System.out.println("Gia tri cua i for: " + i);
		}
		
		// Hien thi kim tu thap 6 *
		System.out.println("Kim tu thap 6 sao");
		for (int i =0; i<6; i++) {
			for (int j =0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Vong lap while
		int i = 0;
		while(i <= 5) {
			System.out.println("Gia tri cua i while: " + i);
			i++;
		}
		
		// Vong lap do while
		i = 0;
		do {
			System.out.println("Gia tri cua i do while: " + i);
			i++;
		} while (i <= 5);
		
		// Kim tu thap 6 sao bang vong while
		int n = 0;
		while(n < 6) {
			int j= 0;
			n++;
			while(j<n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
		
	}

}

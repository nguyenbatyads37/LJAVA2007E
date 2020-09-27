package t3h.ljava2007a.exception;

public class MyExceptionApplication {
	
	public final static String INPUT_ZERO_MSG = "Input khong duoc bang 0";

	public static void main(String[] args) {
		try {
			int number = 0;
			kiemTraDuLieu(number);
			int a = 100;
			System.out.println("Hello " + a);
		} catch (MyException e) {
			System.out.println("Ma loi: " + e.getCode());
			System.out.println("Thong bao: " + e.getMessage());
		}
	}
	
	public static void kiemTraDuLieu(int input) throws MyException {
		if (input == 0) {
			throw new MyException("100", INPUT_ZERO_MSG);
		}
	}

}

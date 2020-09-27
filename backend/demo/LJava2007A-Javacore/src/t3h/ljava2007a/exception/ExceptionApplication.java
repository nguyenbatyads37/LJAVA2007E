package t3h.ljava2007a.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionApplication {

	// demo throws
	public static void main(String[] args) throws Exception{
		File file = new File("C://demo");
		FileInputStream fileInput = new FileInputStream(file);
		
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}

	// demo throw
	public static void xuLyFile() throws FileNotFoundException {
		File file = new File("C://demo");
		if (!file.exists()) {
			throw new FileNotFoundException();
		}
	}

	// demo try catch
	public static void xyLyFile1() {
		File file = new File("C://demo");
		try {
			FileInputStream fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("File khong ton tai!");
		}
	}
}

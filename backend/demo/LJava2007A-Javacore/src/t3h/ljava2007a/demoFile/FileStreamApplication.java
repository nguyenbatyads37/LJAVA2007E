package t3h.ljava2007a.demoFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamApplication {

	public static void main(String[] args) {
		File file = new File("D:\\t3h\\demo.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write("Nguyen Van B".getBytes());
			fos.flush();
		} catch (Exception e) {
			System.out.println("Loi khi ghi file");
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("Loi khi dong ket noi file");
			}
		}
		
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			int i;
			while ((i = fileInputStream.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println("Loi khi doc file");
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				System.out.println("Loi khi dong ket noi file");
			}
		}
	}

}

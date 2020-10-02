package t3h.ljava2007a.demoFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFileApplication {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\t3h\\demo.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
			fileWriter.write("Nguyen Van A");
			fileWriter.flush();
		} catch (IOException e) {
			System.out.println("Loi xay ra khi mo file");
		} finally {
			fileWriter.close();
		}
		
		
		
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int i;
			while((i = fileReader.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.out.println("Loi xay ra khi mo file");
		} finally {
			fileReader.close();
		}
	}

}

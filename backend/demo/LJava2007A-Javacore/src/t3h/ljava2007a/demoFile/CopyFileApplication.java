package t3h.ljava2007a.demoFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileApplication {

	public static void main(String[] args) {
		File originFile = new File("D:\\demo.txt");
		File newFile = new File("D:\\demo-copy.txt");
		
		String dataToWrite = getCopyString(originFile);
		writeNewFile(newFile, dataToWrite);
	}
	
	public static void writeNewFile(File file, String data) {
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileWriter fileWrite = null;
		try {
			fileWrite = new FileWriter(file);
			fileWrite.write(data);
			fileWrite.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileWrite.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String getCopyString(File file) {
		FileReader fileReader = null;
		String copyData = "";
		try {
			fileReader = new FileReader(file);
			int i;
			boolean isNextUppercase = false;
			while ((i = fileReader.read()) != -1) {
				if (isNextUppercase) {
					copyData += String.valueOf((char) i).toUpperCase();
					isNextUppercase = false;
				} else {
					copyData += String.valueOf((char) i);
				}
				if (i == 10) {
					isNextUppercase = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return copyData.substring(0, 1).toUpperCase()
				+ copyData.substring(1);
	}

}

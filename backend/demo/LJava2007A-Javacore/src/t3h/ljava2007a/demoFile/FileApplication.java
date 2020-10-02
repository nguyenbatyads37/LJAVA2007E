package t3h.ljava2007a.demoFile;

import java.io.File;

public class FileApplication {

	public static void main(String[] args) throws Exception{
		File directory = new File("D:\\t3h\\Demo");
		// Tao thu muc
		directory.mkdir();
		
		File file = new File("D:\\t3h\\demo.txt");
		// Tao file
		file.createNewFile();
		
		// Kiem tra file ton tai
		System.out.println("File ton tai khong? " + file.exists());
		System.out.println("Co phai la file khong? " + file.isFile());
		System.out.println("Co phai la thu muc khong? " 
											+ file.isDirectory());
		// Kiem tra quyen cua file
		System.out.println("File co chay duoc khong? " + file.canExecute());
		System.out.println("File co doc duoc khong? " + file.canRead());
		System.out.println("File co viet duoc khong? " + file.canWrite());
		
		// Cap quyen cho file
		file.setExecutable(true);
		file.setReadable(true);
		file.setWritable(true);
		
		// Lay duong dan cua file
		System.out.println("Duong dan tuyet doi: " + file.getAbsolutePath());
		System.out.println("Duong dan tuong doi: " + file.getPath());
		System.out.println("Ten file: " + file.getName());
		
		// Thay doi ten file
		File fileRenameTo = new File("D:\\t3h\\demo1.txt");
		file.renameTo(fileRenameTo);
		
		// Xem danh sach file cua thu muc
		File[] listFile = directory.listFiles();
		for (File subFile : listFile) {
			System.out.println("File trong thu muc Demo: "
						+ subFile.getName());
		}
		
		// Xoa file
//		file.delete();
//		file.deleteOnExit();
	}

}

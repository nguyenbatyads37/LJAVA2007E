package t3h.ljava2007a.demoString;

public class StringApplication {
	
	public static void main(String[] args) {
		String greeting = "Hello"; // string pool
		String welcome = new String("Hello");
		System.out.println("Bieu thuc 1: " + greeting.equals(welcome));
		System.out.println("Bieu thuc 2: " + (greeting == welcome));
		
		System.out.println("Do dai cua bien greeting: " + greeting.length());
		
		String welcomeUpperCase = "HELLO";
		System.out.println("So sanh dung equals: " 
				+ welcome.equals(welcomeUpperCase));
		System.out.println("So sanh equalsIgnoreCase: "
				+ welcome.equalsIgnoreCase(welcomeUpperCase));
		
		String name = new String("Nguyen Van C");
		String name1 = null;
		System.out.println("Ham isEmpty(): " + name.isEmpty());
		//System.out.println("Ham isEmpty() cho bien null: " + name1.isEmpty());
		// --> bien null khong duoc phep goi ham va bien
		
		String noiChuoi = welcome.concat(name);
		System.out.println("Sau khi noi chuoi: " + noiChuoi);
		
		System.out.println("Sau khi replace: " 
				+ name.replace("C", "A"));
		System.out.println("Sau khi cat chuoi: "
				+ name.substring(7, 10));
		
		String khoangTrang = "   abc  ";
		System.out.println("Sau khi trim: " + khoangTrang.trim());
		
		int number = 30;
		String numberStr = String.valueOf(number);
		System.out.println("Sau khi convert: " + numberStr);
		
		String demo = new String("abcd");
		demo = new String("xyz");
		System.out.println(demo);
	}
}

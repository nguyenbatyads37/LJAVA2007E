package t3h.ljava2007a.demo;

public class Application {

	// Bien toan cuc
	int phone1 = 99999; // Default access
	public int age; // public access
	private double ageDouble;
	protected boolean isMan;
	
	static String newName = "abc";
	static char newNameChar = 'a';
	
	public void printAge() {
		ageDouble = 100;
		int phone = 10;
		System.out.println("This is my age " + ageDouble + " - " + phone + " - " + isMan);
	}
	
	public void printNameAge() {
		printAge();
	}
	
	public static void main(String[] args) {
		Application application = new Application();
		application.printAge();
		newName = "abc";
		
		// Bien cuc bo
		// Kieu du lieu nguyen thuy
		boolean isTrue = false;
		int number = 10; // number - reference : 10 - value
		float floatNum = 10f;
		double doubleNum = 10d;
		System.out.println("Hello world");
		
		// Kieu du lieu object
		String name = "Nguyen Van A";
		String name1 = new String("Nguyen Van A");
		System.out.println("This is my name " + number);
		
		LongNguyen longNguyen = new LongNguyen();
		System.out.println("This is longNguyen " + longNguyen);
	}
}

class LongNguyen {
	
}

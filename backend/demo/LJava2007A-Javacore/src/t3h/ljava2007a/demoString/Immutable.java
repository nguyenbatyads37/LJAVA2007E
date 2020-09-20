package t3h.ljava2007a.demoString;

public class Immutable {

	private final String value;
	
	public Immutable(String value) {
		this.value = value;
	}
	
	public String toString() {
		return this.value;
	}
	
	public Immutable setValue(String value) {
		Immutable newImmutable = new Immutable(value);
		return newImmutable;
	}
	
	public Immutable concat(String newValue) {
		Immutable newImmutable = new Immutable(this.value + newValue);
		return newImmutable;
	}
	
	public static void main(String[] args) {
		Immutable name = new Immutable("Nguyen Van C");
		String name1 = new String("Nguyen  VanD");
		System.out.println(name);
	}
}

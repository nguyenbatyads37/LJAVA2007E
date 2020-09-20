package t3h.ljava2007a.demoString;

public class StringBufferApplication {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello");
		System.out.println("Sau append: " + stringBuffer.toString());
		stringBuffer.insert(5, " World");
		System.out.println("Sau insert" + stringBuffer.toString());
		stringBuffer.replace(5, 11, " Nguyen Van C");
		System.out.println("Sau replace" + stringBuffer.toString());
		stringBuffer.delete(6, 12);
		System.out.println("Sau delete" + stringBuffer.toString());
		stringBuffer.reverse();
		System.out.println("Sau reverse" + stringBuffer.toString());
	}
	// StringBuffer ho tro da luong
	// StringBuilder khong ho tro da luong
}

package t3h.ljava2007a.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionApplication {

	public static void main(String[] args) {
		
		// ArrayList
//		List<String> arrayList = new ArrayList<String>();
//		arrayList.add("Nguyen Van A");
//		arrayList.add("Nguyen Van B");
//		arrayList.add("Nguyen Van C");
//		
//		System.out.println("Gia tri index dau tien: " + arrayList.get(0));
//		
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println("Gia tri thu " + i + ": " + arrayList.get(i));
//		}
//		
//		arrayList.remove(0);
//		
//		System.out.println("Sau khi xoa index 0");
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println("Gia tri thu " + i + ": " + arrayList.get(i));
//		}
		
//		List<String> linkedList = new LinkedList<String>();
//		linkedList.add("Nguyen Van A");
//		linkedList.add("Nguyen Van B");
//		linkedList.add("Nguyen Van C");
//		
//		System.out.println("Gia tri index dau tien: " + linkedList.get(0));
//		
//		for (int i = 0; i < linkedList.size(); i++) {
//			System.out.println("Gia tri thu " + i + ": " + linkedList.get(i));
//		}
//		
//		linkedList.remove(0);
//		
//		System.out.println("Sau khi xoa index 0");
//		for (int i = 0; i < linkedList.size(); i++) {
//			System.out.println("Gia tri thu " + i + ": " + linkedList.get(i));
//		}
		
		// Demo queue
//		Queue<String> queue = new LinkedList<String>();
//		queue.offer("Nguyen Van A"); // 1
//		queue.offer("Nguyen Van B"); // 2
//		queue.offer("Nguyen Van C"); // 3
//		queue.offer("Nguyen Van D"); // 4
//		
//		// Lay gia tri nhung khong xoa di
//		System.out.println("Lay gia tri moi nhat: " + queue.peek());
//		
//		// Lay gia tri va xoa gia tri do trong queue
//		System.out.println("Lay gia tri moi nhat: " + queue.poll());
//		System.out.println("Lay gia tri moi nhat: " + queue.poll());
		
		// Demo set
//		Set<String> set = new HashSet<String>();
//		set.add("Nguyen Van A");
//		set.add("Nguyen Van A");
//		set.add("Nguyen Van B");
//		set.add("Nguyen Van C");
//		
//		set.remove("Nguyen Van C");
//		
//		Iterator<String> iterator = set.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		// Demo map
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(1, "Nguyen Van A");
//		map.put(2, "Nguyen Van B");
//		map.put(3, "Nguyen Van C");
//		map.put(3, "Nguyen Van D");
//		
//		map.remove(2);
//		
//		Set<Integer> keySet = map.keySet();
//		for (Integer key : keySet) {
//			System.out.println("Key: " + key + " Value: " + map.get(key));
//		}
	}

}

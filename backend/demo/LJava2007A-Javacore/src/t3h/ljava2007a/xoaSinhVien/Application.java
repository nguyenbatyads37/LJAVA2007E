package t3h.ljava2007a.xoaSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<Student>();
		for (int i = 100; i <= 110; i++) {
			Student student = 
					new Student(String.valueOf(i), "Student" + i, 19);
			listStudent.add(student);
		}
		
		// Cach 1
//		Collections.sort(listStudent, new Comparator<Student>() {
//			@Override
//			public int compare(Student s1, Student s2) {
//				return Integer.parseInt(s2.getId()) 
//						- Integer.parseInt(s1.getId());
//			}
//		});
		
		// Cach 2
		Collections.sort(listStudent, new StudentComparator());
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		removeStudent(userInput, listStudent);
		
		for(int i = 0; i < listStudent.size() ; i++) {
			Student student = listStudent.get(i);
			System.out.println(student.toString());
		}
	}
	
	public static void removeStudent(String id, List<Student> listStudent) {
		for(int i=0;i<listStudent.size();i++) {
			if(String.valueOf(id).equals(listStudent.get(i).getId())) {
				listStudent.remove(i);
			}
		}
	}

}

class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return Integer.parseInt(s2.getId()) 
				- Integer.parseInt(s1.getId());
	}
}

package t3h.ljava2007a.demoJson;

import com.google.gson.Gson;

public class GsonApplication {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId("ABC123");
		student.setName("Nguyen Van A");
		student.setAge(20);
		
		Gson gson = new Gson();
		
		// Convert object thanh json string
		String jsonString = gson.toJson(student, Student.class);
		System.out.println("Student json: " + jsonString);
		
		// Convert json string thanh object
		String studentJson = 
				"{\"id\":\"MN111\",\"name\":\"Nguyen Thi B\",\"age\":30}";
		Student afterConvert = gson.fromJson(studentJson, Student.class);
		System.out.println("After convert to object: " + afterConvert.toString());
		// XML -> DOM XML -> w3s DOM
	}

}

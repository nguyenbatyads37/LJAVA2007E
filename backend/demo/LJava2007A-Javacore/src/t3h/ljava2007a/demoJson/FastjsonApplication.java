package t3h.ljava2007a.demoJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class FastjsonApplication {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId("ABC123");
		student.setName("Nguyen Van A");
		student.setAge(20);
		
		// Convert object thanh json string
		String jsonString = JSON.toJSONString(student);
		System.out.println(jsonString);
		
		// Convert json string thanh object
		String studentStr = 
				"{\"id\":\"MN111\",\"name\":\"Nguyen Thi B\",\"age\":30}";
		JSONObject object = JSONObject.parseObject(studentStr);
		System.out.println("Student id: " + object.getString("id"));
		System.out.println("Student name: " + object.getString("name"));
		System.out.println("Student age: " + object.getIntValue("age"));
		
		String jsonArray = 
				"[{\"age\":20,\"id\":\"ABC123\",\"name\":\"Nguyen Van A\"}]";
		JSONArray array = JSONArray.parseArray(jsonArray);
		JSONObject index0 = array.getJSONObject(0);
		System.out.println("Student id: " + index0.getString("id"));
		System.out.println("Student name: " + index0.getString("name"));
		System.out.println("Student age: " + index0.getIntValue("age"));
	}
}

package t3h.ljava2007a;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Application {

	public static void main(String[] args) {
		JSONObject object = JSON.parseObject("{\"name\":\"Nguyen\"}");
		System.out.println("Hello world: " + object.getString("name"));
	}
}

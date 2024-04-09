package api_Validation;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;

public class PostReq {

	public static void main(String[] args) {
		
	Map<String, Object> map = new HashMap<String, Object>();
	
	map.put("name", "morpheus");
	map.put("job", "leader");
		
	JSONObject obj = new JSONObject(map);
	System.out.println(obj.toJSONString());
	
	baseURI = "https://reqres.in/api";
		
		given().
			body(obj.toJSONString()).
		when()
			.put("/users/2").
		then().
			statusCode(200).log().all();
	}
}

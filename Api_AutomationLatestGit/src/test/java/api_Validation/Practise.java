package api_Validation;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Practise {
	
	public static void main (String [] arg) {
		
		Response response = get("https://api.demoblaze.com/entries");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getTime());
		System.out.println(response.getHeader("Content-Type"));
		System.out.println(response.getStatusLine());
		
		given().get("https://api.demoblaze.com/entries").then().statusCode(200);
		
	}

}

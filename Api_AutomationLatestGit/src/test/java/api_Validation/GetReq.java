package api_Validation;

import org.testng.Assert;
import static io.restassured.RestAssured.*;

import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class GetReq {

	public static void main (String []arg) {
		
		//get Request
		
		Response response = get("https://reqres.in/api/users/2");

		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);

		//baseURI = "https://reqres.in/api";
		given().
			get("https://reqres.in/api/users/2").
		then().
			statusCode(200).body("data.id",equalTo(2))
			.log().all();
		
		int [] array = {10,20,30,11,90,30};
		
		int max = array[0];
		
		for (int i = 1; i<=array.length; i++) {
			if (array[i]>max) {
				max= array[i];
			}
			
		}
		System.out.print(max);
		

	}


}



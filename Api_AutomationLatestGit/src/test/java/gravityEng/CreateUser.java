package gravityEng;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateUser {

	@Test
	public void testCreateNewUser() {
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Ashish Anarase");
		requestParams.put("job", "QA Engineer");

		//Approach 1  
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(requestParams.toString())
				.post("https://reqres.in/api/users");

		Assert.assertEquals(response.getStatusCode(), 201, "Status code should be 201");

		String userId = response.jsonPath().getString("id");
		Assert.assertNotNull(userId, "User ID should not be null");

		//Approach 2
		baseURI = "https://reqres.in/api";

		given().
			body(requestParams.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).log().all();


	}

}




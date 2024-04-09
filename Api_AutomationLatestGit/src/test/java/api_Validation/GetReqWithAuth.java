package api_Validation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetReqWithAuth {

	public static void main(String[] args) {

		String username = "your_username";
		String password = "your_password";

		// Set base URI
		RestAssured.baseURI = "https://example.com/api";

		// Perform GET request with basic authentication
		Response response = RestAssured.given()
				.auth().preemptive().basic(username, password)
				.get("/resource");
		
		Response response2 = RestAssured.given()
				.auth().digest(username, password)
				.get("/resource");
	}
}



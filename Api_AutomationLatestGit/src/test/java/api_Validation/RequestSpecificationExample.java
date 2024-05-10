package api_Validation;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationExample {

	public static void main(String[] args) {
		// Create a RequestSpecBuilder instance
		RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();

		// Set base URI
		requestSpecBuilder.setBaseUri("https://api.example.com");

		// Set authentication (if needed)
		// requestSpecBuilder.setAuth(...);

		// Set headers
		requestSpecBuilder.addHeader("Content-Type", "application/json");
		requestSpecBuilder.addHeader("Authorization", "Bearer your_access_token");

		// Build the request specification
		RequestSpecification requestSpec = requestSpecBuilder.build();

		// Use the request specification in a REST Assured test
		RestAssured.given()
		.spec(requestSpec)
		.get("/resource")
		.then()
		.statusCode(200);
	}
}


package api_Validation;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
public class Schema_Validator {

	public static void main (String []args) {


		given().
			get("https://reqres.in/api/users/2").
		then().
			assertThat().body(matchesJsonSchemaInClasspath("schema.json")).
			statusCode(200).log().all();
		System.out.println(true);


	}

}

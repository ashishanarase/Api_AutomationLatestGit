package api_Validation;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializationExample {
	public static void main(String[] args) throws Exception {
		// Simulated JSON response from an API
		String jsonResponse = "{\"name\":\"John Doe\",\"position\":\"Engineer\",\"salary\":10000}";

		// Create an ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		// Deserialize the JSON into a Java object
		Employee employee = objectMapper.readValue(jsonResponse, Employee.class);

		// Access the properties of the Java object
		System.out.println("Name: " + employee.getName());
		System.out.println("Position: " + employee.getPosition());
		System.out.println("Salary: " + employee.getSalary());
	}
}



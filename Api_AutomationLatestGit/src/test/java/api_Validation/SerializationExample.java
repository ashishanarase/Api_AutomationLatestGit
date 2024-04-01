package api_Validation;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationExample {

	public static void main(String[] args) throws Exception {
		// Create a Java object to serialize
		Employee employee = new Employee("John Doe", "Engineer", 10000);

		// Create an ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		// Serialize the object to JSON
		String jsonPayload = objectMapper.writeValueAsString(employee);

		// Print the serialized JSON
		System.out.println("Serialized JSON: " + jsonPayload);
	}
}



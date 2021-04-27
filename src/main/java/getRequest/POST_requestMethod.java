package getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_requestMethod {
	@Test
	public void postreqest() {
		RequestSpecification  httpRequest = null;

		 RestAssured.baseURI = "https://bookstore.toolsqa.com";
		httpRequest = RestAssured.given();
		String payload ="{\r\n" + 
				"  \"userName\": \"Nikitaadevakatt\",\r\n" + 
				"  \"password\": \"Niki*ta@132456\"\r\n" + 
				"}";
		httpRequest.header("Content-Type","application/json");
		Response response= httpRequest.body(payload).post("/Account/v1/User");
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		response.prettyPrint();
	}

}

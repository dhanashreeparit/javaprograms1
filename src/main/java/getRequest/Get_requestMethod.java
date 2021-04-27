package getRequest;


import java.io.IOException;

import org.testng.annotations.Test;

import com.jayway.restassured.response.ResponseBody;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Get_requestMethod {
	@Test
	public void getRequest_withoutauth() throws IOException {
		RequestSpecification  httpRequest = null;

		RestAssured.baseURI = "https://bookstore.toolsqa.com";	//	it calls the server to get resource
		httpRequest = RestAssured.given();//issue a request to a server
		Response response = httpRequest.request(Method.GET,"/BookStore/v1/Books");//it will  take  response from the server
		int statuscode = response.getStatusCode();// get a  status code from the server
		System.out.println(statuscode);//it will print the status code
		Headers header = response.getHeaders();
		System.out.println(" Header response is "+header);
		


		 }

}


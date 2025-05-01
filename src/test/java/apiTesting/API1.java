package apiTesting;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//get request
		Response apiget=RestAssured.get("https://automationexercise.com/api/productsList");
		
		// Validate the response status code
		Assert.assertEquals(apiget.getStatusCode(), 200, "Expected status code 200");
	// print status code ,time and body
		int statuscode=apiget.statusCode();
		long responseTime=apiget.getTime();
		String bodyData=apiget.asString();
		System.out.println(statuscode);
		System.out.println(responseTime);
		System.out.println(bodyData);
	}

}

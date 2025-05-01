package apiTesting;

import org.json.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class API7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //define data 
		JSONObject js=new JSONObject();
		js.put("email", "atulk23@gmail.com");
		js.put("password", "atul@23");
		
		//post request
		Response reqpost=RestAssured.given()
		.contentType(ContentType.JSON)
		.body(js.toString()).when().post(" https://automationexercise.com/api/verifyLogin").then().statusCode(200).extract().response();
		
		// Validate the response status code
        Assert.assertEquals(reqpost.getStatusCode(), 200, "Expected status code 200");

        // Validate the response message
        String responseBody = reqpost.getBody().asString();
        // Print the response body
        System.out.println("Response Body:");
        System.out.println(responseBody);
	}

}

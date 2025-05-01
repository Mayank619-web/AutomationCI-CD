package apiTesting;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class API5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// define data
	      JSONObject requestParams = new JSONObject();
	      requestParams.put("search_product", "tshirt");
	      
	      
	   // Send the POST request
	      Response response = RestAssured
	              .given()
	                  .contentType(ContentType.JSON)
	                  .body(requestParams.toString())
	              .when()
	                  .post(" https://automationexercise.com/api/searchProduct");
	      
	      int statuscode=response.statusCode();
			long responseTime=response.getTime();
			String bodyData=response.asString();
			System.out.println(statuscode);
			System.out.println(responseTime);
			System.out.println(bodyData);
	              
          
	}

}

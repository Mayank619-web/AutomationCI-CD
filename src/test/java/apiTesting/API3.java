package apiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get request
				Response apiget=RestAssured.get("https://automationexercise.com/api/brandsList");
			// print status code ,time and body
				int statuscode=apiget.statusCode();
				long responseTime=apiget.getTime();
				String bodyData=apiget.asString();
				System.out.println(statuscode);
				System.out.println(responseTime);
				System.out.println(bodyData);
			
	}

}

package apiTesting;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class API4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define data	
				JSONObject js=new JSONObject();
		        js.put("id", "1");
		        js.put("brand", "Polo");
		        js.put("id", "2");
		        js.put("brand", "H&M");
		        
		        //post request
		        Response reqpost=RestAssured.given().contentType(ContentType.JSON).body(js.toString()).post(" https://automationexercise.com/api/brandsList");
		   
		     // print status code ,time and body
		        int statusCode= reqpost.getStatusCode();
		        long responseTime= reqpost.getTime();
		        String bodyData=reqpost.asString();
		        System.out.println(statusCode);
		        System.out.println(responseTime);
		        System.out.println(bodyData);
	}

}

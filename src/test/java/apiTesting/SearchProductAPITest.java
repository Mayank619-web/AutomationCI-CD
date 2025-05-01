package apiTesting;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SearchProductAPITest {
  @Test
  public void testSearchProductAPI() {
      // Set the base URI
      RestAssured.baseURI = "https://automationexercise.com";

      // Construct the request payload
      JSONObject requestParams = new JSONObject();
      requestParams.put("search_product", "tshirt"); // Replace with desired search term

      // Send the POST request
      Response response = RestAssured
              .given()
                  .contentType(ContentType.JSON)
                  .body(requestParams.toString())
              .when()
                  .post("/api/searchProduct")
              .then()
                  .extract()
                  .response();

      // Validate the response status code
      Assert.assertEquals(response.getStatusCode(), 200, "Expected status code 200");

      // Print the response body
      System.out.println("Response Body:");
      response.prettyPrint();

      // Additional validations can be performed here
      // For example, checking if the response contains expected product details
  }
}

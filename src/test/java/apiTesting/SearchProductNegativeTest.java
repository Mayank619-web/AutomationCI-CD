package apiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SearchProductNegativeTest {
  @Test
  public void testSearchProductWithoutParameter() throws InterruptedException {
      // Set the base URI
      RestAssured.baseURI = "https://automationexercise.com";

      // Send POST request without the 'search_product' parameter
      Response response = RestAssured
              .given()
                  .contentType(ContentType.JSON)
                  .body("{}") // Empty JSON body
              .when()
                  .post("/api/searchProduct")
              .then()
                  .extract()
                  .response();

      Thread.sleep(3000);
      // Validate the response status code is 400
      Assert.assertEquals(response.getStatusCode(), 400, "Expected status code 400");

      // Validate the response message
      String responseBody = response.getBody().asString();
      Assert.assertTrue(responseBody.contains("Bad request, search_product parameter is missing in POST request"),
              "Expected error message not found in response");

      // Print the response body
      System.out.println("Response Body:");
      System.out.println(responseBody);
  }
}

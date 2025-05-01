package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTestCasesPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver bo=new ChromeDriver();
		  bo.get("https://www.automationexercise.com/");
		  bo.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		  bo.manage().window().maximize();
		  
		  String HomePageVisible=bo.getTitle();
		  System.out.println(HomePageVisible);
		  
		  WebElement tcl=bo.findElement(By.xpath("//a[contains(text(),'Test Cases')]"));
		  tcl.click();
		  String actualresult=bo.getTitle();
		  System.out.println(actualresult);
		  String expectedresult;
		  expectedresult="Automation Practice Website for UI Testing - Test Cases";
		  if(actualresult.equals(expectedresult)) {
			  System.out.println("Test case7 passed: Verify user is navigated to test cases page successfully");
		  }else {
			  System.out.println("Test case7 failed");
		  }
		  bo.quit();
	}

}

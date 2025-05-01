package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver bo=new ChromeDriver();
		  bo.get("https://www.automationexercise.com/");
		  bo.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		  bo.manage().window().maximize();
		  
		  String HomePageVisible=bo.getTitle();
		  System.out.println(HomePageVisible);
		  
		  bo.findElement(By.partialLinkText("Signup / Log")).click();
		  
		 
		  
		  WebElement email=bo.findElement(By.xpath("//input[@data-qa='login-email']"));
		  email.sendKeys("vinodk12@gmail.com");
		  bo.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("vin23@we");
		  //bo.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		  bo.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		  bo.findElement(By.partialLinkText("Logo")).click();
		  String actualresult=bo.getTitle();
		  System.out.println(actualresult);
		  
		  String expectedresult;
		  expectedresult="Automation Exercise - Signup / Login";
		  if(actualresult.equals(expectedresult)) {
			  System.out.println("Test Case 4 passed: Verify that user is navigated to login page");
		  }else {
			  System.out.println("Test case4 failed");
		  }
		  bo.quit();
	}

}

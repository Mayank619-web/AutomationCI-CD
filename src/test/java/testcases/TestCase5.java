package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver bo=new ChromeDriver();
		  bo.get("https://www.automationexercise.com/");
		  bo.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		  bo.manage().window().maximize();
		  
		  String HomePageVisible=bo.getTitle();
		  System.out.println(HomePageVisible);
		  
		  bo.findElement(By.partialLinkText("Signup / Log")).click();
		  
		  String NewUSignup=bo.getTitle();
		  System.out.println(NewUSignup);
		  
		  WebElement name=bo.findElement(By.xpath("//input[@name='name']"));
		  name.sendKeys("Mayank Tiwari");
		  WebElement email=bo.findElement(By.xpath("//input[@data-qa='signup-email']"));
		  email.sendKeys("mayanktiwari1572000@gmail.com");
		  bo.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
		  bo.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		  WebElement message=bo.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']"));
		  String actualresult=message.getText();
		  System.out.println(actualresult);
		  
		  String expectedresult;
		  expectedresult="Email Address already exist!";
		  if(actualresult.equals(expectedresult)) {
			  System.out.println("Test Case 5 passed: Verify error 'Email Address already exist!' is visible");
		  }else {
			  System.out.println("Test case5 failed");
		  }
		  bo.quit();
		  
		  
	}

}

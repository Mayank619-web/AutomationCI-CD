package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUserIncoreect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver bo=new ChromeDriver();
		  bo.get("https://www.automationexercise.com/");
		  bo.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		  bo.manage().window().maximize();
		  
		  String HomePageVisible=bo.getTitle();
		  System.out.println(HomePageVisible);
		  
		  bo.findElement(By.partialLinkText("Signup / Log")).click();
		  
		  String login=bo.getTitle();
		  System.out.println(login);
		  
		  WebElement email=bo.findElement(By.xpath("//input[@data-qa='login-email']"));
		  email.sendKeys("maynk65@gmail.com");
		  bo.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mayan23");
		  bo.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		  WebElement message=bo.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));
		  System.out.println(message);
		  bo.quit();
	}

}

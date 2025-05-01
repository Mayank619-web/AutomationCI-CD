package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUser {

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
		  email.sendKeys("mayank65@gmail.com");
		  bo.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("mayanktiwari23");
		  bo.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		  
		  
		  bo.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		  WebElement UsrnameVisible=bo.findElement(By.tagName("b"));
		  String usr=UsrnameVisible.getText();
		  System.out.println(usr);
		  
		  bo.findElement(By.partialLinkText("Delete Accou")).click();
		  String acct_created=bo.getTitle();
		  System.out.println(acct_created);
		  bo.quit();
	}

}

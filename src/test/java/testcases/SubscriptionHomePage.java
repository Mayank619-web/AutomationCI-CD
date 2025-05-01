package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscriptionHomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver bo=new ChromeDriver();
		  bo.get("https://www.automationexercise.com/");
		  bo.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		  bo.manage().window().maximize();
		  
		  String HomePageVisible=bo.getTitle();
		  System.out.println(HomePageVisible);
		  
		  //scroll down page
		  JavascriptExecutor js = (JavascriptExecutor) bo;
		  js.executeScript("window.scrollBy(0,9000)");
		  
		  String subs=bo.findElement(By.xpath("//h2[normalize-space()='Subscription']")).getText();
		  System.out.println(subs);
		  
		  WebElement email=bo.findElement(By.xpath("//input[@id='susbscribe_email']"));
		  email.sendKeys("swati123@gmail.com");
		  WebElement  sub=bo.findElement(By.id("subscribe"));
		  sub.click();
		  Thread.sleep(5000);
		  String actualresult=sub.getText();
		  System.out.println(actualresult);
		  
		  String expectedresult;
		  expectedresult="SUBSCRIPTION";
		  if(actualresult.equals(expectedresult)) {
			  System.out.println("Test case10 passed:  SUBSCRIPTION");
		  }else {
			  System.out.println("Test case10 failed");
		  }
		  bo.quit();
		  
	}

}

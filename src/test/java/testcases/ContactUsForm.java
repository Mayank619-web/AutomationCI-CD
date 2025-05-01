package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver bo=new ChromeDriver();
		  bo.get("https://www.automationexercise.com/");
		  bo.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		  bo.manage().window().maximize();
		  
		  String HomePageVisible=bo.getTitle();
		  System.out.println(HomePageVisible);
		  
		  bo.findElement(By.cssSelector("a[href='/contact_us']")).click();
		  
		  WebElement message=bo.findElement(By.xpath("//h2[normalize-space()='Get In Touch']"));
		  String GIT=message.getText();
		  System.out.println(GIT);
		  
		  bo.findElement(By.xpath("//input[@name='name']")).sendKeys("Atul Kumar");
		  bo.findElement(By.xpath("//input[@name='email']")).sendKeys("atulk23@gmail.com");
		  bo.findElement(By.xpath("//input[@name='subject']")).sendKeys("Website issue");
		  bo.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Website working slowly");
		  WebElement uploadFile=bo.findElement(By.xpath("//input[@type='file']"));
		  uploadFile.sendKeys("C:\\Users\\mayan\\OneDrive\\Desktop\\from text field.txt");
		  bo.findElement(By.xpath("//input[@name='submit']")).click();
		  bo.switchTo().alert().accept();
		  
		  
		  WebElement display=bo.findElement(By.xpath("//div[@class='status alert alert-success']"));
		  String actualresult=display.getText();
		  System.out.println(actualresult);
		  String expectedresult;
		  expectedresult="Success! Your details have been submitted successfully.";
		  if(actualresult.equals(expectedresult)) {
			  System.out.println("Test case6 passed: Success! Your details have been submitted successfully.");
		  }else {
			  System.out.println("Test case6 failed");
		  }
		  
		  bo.findElement(By.xpath("//span[normalize-space()='Home']")).click();
		  bo.quit();
		  
	}

}

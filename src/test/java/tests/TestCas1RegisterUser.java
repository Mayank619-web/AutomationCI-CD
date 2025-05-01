package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCas1RegisterUser {
  @Test
  public void testcase1() throws InterruptedException {
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
	  
	  String accntinfo=bo.getTitle();
	  System.out.println(accntinfo);
	  
	  bo.findElement(By.id("id_gender1")).click();
	  bo.findElement(By.id("password")).sendKeys("mayanktiwari23");
	  
	  
	  //scroll down page
	  bo.findElement(By.id("id_gender1")).sendKeys(Keys.DOWN);
	  bo.findElement(By.id("id_gender1")).sendKeys(Keys.DOWN);
	  bo.findElement(By.id("id_gender1")).sendKeys(Keys.DOWN);
	  bo.findElement(By.id("id_gender1")).sendKeys(Keys.DOWN);
	  
	  
	  //Select Day
	  WebElement dayDropdown=bo.findElement(By.xpath("//select[@id='days']"));
	  Select selectDay=new Select(dayDropdown);
	  selectDay.selectByVisibleText("14");
	  
	  
	  //Select month
	  WebElement monthDropdown=bo.findElement(By.id("months"));
	  Select selectMonth=new Select(monthDropdown);
	  selectMonth.selectByIndex(6);
	  
	  
	  //Select Year
	  WebElement yearDropdown=bo.findElement(By.id("years"));
	  Select selectYear=new Select(yearDropdown);
	  selectYear.selectByValue("2000");
	  Thread.sleep(2000);
	  
	  //selecting check-box
	  bo.findElement(By.id("newsletter")).click();
	  bo.findElement(By.xpath("//label[normalize-space()='Receive special offers from our partners!']")).click();
	  
	  
	  bo.findElement(By.xpath("//label[normalize-space()='Receive special offers from our partners!']")).sendKeys(Keys.DOWN);
	  bo.findElement(By.xpath("//label[normalize-space()='Receive special offers from our partners!']")).sendKeys(Keys.DOWN);
	  bo.findElement(By.xpath("//label[normalize-space()='Receive special offers from our partners!']")).sendKeys(Keys.DOWN);
	  
	  
	  
	  
	  
	  
	  
  }
}

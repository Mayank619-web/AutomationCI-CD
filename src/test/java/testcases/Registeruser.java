package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Registeruser {

	public static void main(String[] args) throws InterruptedException {
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
		  name.sendKeys("Mayank Kumar");
		  WebElement email=bo.findElement(By.xpath("//input[@data-qa='signup-email']"));
		  email.sendKeys("mayank65@gmail.com");
		  bo.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
		  bo.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		  
		  String accntinfo=bo.getTitle();
		  System.out.println(accntinfo);
		  
		  bo.findElement(By.id("id_gender1")).click();
		  bo.findElement(By.id("password")).sendKeys("mayanktiwari23");
		  
		  
		  //scroll down page
		  JavascriptExecutor js = (JavascriptExecutor) bo;
		  js.executeScript("window.scrollBy(0,1000)");
		  
		  
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
		  Thread.sleep(6000);
		  
		  //selecting check-box
		  bo.findElement(By.xpath("(//input[@id='newsletter'])[1]")).click();
		  bo.findElement(By.xpath("//label[normalize-space()='Receive special offers from our partners!']")).click();
		  
		  //scroll down page
		  JavascriptExecutor js1 = (JavascriptExecutor) bo;
		  js1.executeScript("window.scrollBy(0,1000)");
		  
		  //filling details
		  bo.findElement(By.id("first_name")).sendKeys("Mayank");
		  bo.findElement(By.id("last_name")).sendKeys("Kumar");
		  bo.findElement(By.id("company")).sendKeys("Infosys");
		  bo.findElement(By.id("address1")).sendKeys("XYZ Plot no2");
		  bo.findElement(By.name("address2")).sendKeys("House no-2,Lanka ");
		  //country drop down
		  WebElement countryDropdown=bo.findElement(By.xpath("//select[@id='country']"));
		  Select selectCountry=new Select(countryDropdown);
		  selectCountry.selectByVisibleText("India");
		  bo.findElement(By.id("state")).sendKeys("U.P");
		  bo.findElement(By.id("city")).sendKeys("Ghazipur");
		  bo.findElement(By.id("zipcode")).sendKeys("233001");
		  bo.findElement(By.id("mobile_number")).sendKeys("730776482");
		  js1.executeScript("window.scrollBy(0,100)");//scrolling down page
		  bo.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
		  
		  
		  
		  String acctcreated=bo.getTitle();
		  System.out.println(acctcreated);
		  Thread.sleep(3000);
		  
		  bo.findElement(By.linkText("Continue")).click();
		  
		  WebElement UsrnameVisible=bo.findElement(By.tagName("b"));
		  String usr=UsrnameVisible.getText();
		  System.out.println(usr);
		  
		  bo.findElement(By.partialLinkText("Delete Accou")).click();
		  String acct_created=bo.getTitle();
		  System.out.println(acct_created);
		  bo.findElement(By.linkText("Continue")).click();
		  
          bo.quit();
	}

}

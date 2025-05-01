package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver bo=new ChromeDriver();
		  bo.get("https://www.automationexercise.com/");
		  bo.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		  bo.manage().window().maximize();
		  
		  String HomePageVisible=bo.getTitle();
		  System.out.println(HomePageVisible);
		  
		  WebElement productsbutton=bo.findElement(By.cssSelector("a[href='/products']"));
		  productsbutton.click();
		  WebElement allproducts=bo.findElement(By.xpath("//h2[normalize-space()='All Products']"));
		  String alpage=allproducts.getText();
		  System.out.println(alpage);
		  WebElement list=bo.findElement(By.xpath("//ul[@class='nav nav-pills nav-stacked']"));
		  String productlist=list.getText();
		  System.out.println(productlist);
		  
		  //scroll down page
		  JavascriptExecutor js = (JavascriptExecutor) bo;
		  js.executeScript("window.scrollBy(0,500)");
		  
		  WebElement firstproduct=bo.findElement(By.cssSelector("a[href='/product_details/1']"));
		  firstproduct.click();
		  String proddetpage=bo.getTitle();
		  System.out.println( proddetpage);
		  
		  WebElement productdetails=bo.findElement(By.xpath("//div[@class='product-information']"));
		  String actualresult=productdetails.getText();
		  System.out.println(actualresult);
		  
		  String expectedresult;
		  expectedresult="";
		  if(actualresult.equals(expectedresult)) {
			  System.out.println("Test case8 passed: Verify that detail detail is visible: product name, category, price, availability, condition, brand");
		  }else {
			  System.out.println("Test case8 failed");
		  }
		  bo.quit();
	}

}

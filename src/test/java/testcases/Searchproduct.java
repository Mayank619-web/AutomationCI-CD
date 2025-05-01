package testcases;

import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchproduct {

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
		  bo.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Men Tshirt");	
		  bo.findElement(By.xpath("//button[@id='submit_search']")).click();
		  WebElement searchedproducts=bo.findElement(By.xpath("//h2[normalize-space()='Searched Products']"));
		  String actualresult=searchedproducts.getText();
		  System.out.println(actualresult);
		  
		  String expectedresult;
		  expectedresult="SEARCHED PRODUCTS";
		  if(actualresult.equals(expectedresult)) {
			  System.out.println("Test case9 passed: Verify all the products related to search are visible");
		  }else {
			  System.out.println("Test case9 failed");
		  }
		  bo.quit();
	}

		  
		  
	}



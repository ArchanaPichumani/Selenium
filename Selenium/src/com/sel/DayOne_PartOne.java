package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne_PartOne {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstechnologys.com");
		Thread.sleep(3000);
				
		driver.get("https://www.bbc.co.uk/");
		Thread.sleep(3000);
		
     	driver.get("http://www.flipkart.com"); 
         Thread.sleep(3000);
	      
	    driver.get("https://www.facebook.com/");
	    WebElement username=driver.findElement(By.id("email")); 
	    username.sendKeys("itsmeavinash@gmail.com");
	    Thread.sleep(3000);
	
	
       driver.get("http://greenstech.in/selenium-course-content.html");
       Thread.sleep(3000);
		
	   String title = driver.getTitle();
	   System.out.println(title); 
		
	}
	
	
}

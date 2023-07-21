package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DayOne_PartThree {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	
		driver.get("https://www.amazon.co.uk");
		driver.manage().window().maximize();
		
		driver.get("https://mail.google.com");
		Thread.sleep(3000);
		
    	driver.get("http://www.flipkart.com");
	    Thread.sleep(3000);
		
	    driver.get("http://greenstech.in/selenium-course-content.html");
	    Thread.sleep(3000);
	    
	    driver.close();
	    
		 
		 
		
		 
	}

}

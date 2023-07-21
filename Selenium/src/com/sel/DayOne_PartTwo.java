 package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DayOne_PartTwo {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.co.uk");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.get("https://mail.google.com");
		Thread.sleep(3000);
		
    	driver.get("http://www.flipkart.com");
	    Thread.sleep(3000);
	
	  
	    driver.get("http://greenstech.in/selenium-course-content.html");
	    Thread.sleep(3000);
						
	    driver.navigate().back();
	    Thread.sleep(3000); 
	    
      driver.navigate().back();
      Thread.sleep(3000); 
	    
	    driver.navigate().forward();
	    
	    driver.close();
		
		
		
		
	}
	
	

}

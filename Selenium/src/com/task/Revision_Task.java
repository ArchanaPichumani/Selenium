package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision_Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		WebElement Google = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		
		Google.sendKeys("greens velmurugan");
		Google.submit();
	    
	    Thread.sleep(3000);
	
    	
	WebElement Link = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
	
	Link.click();
	
	Thread.sleep(3000);
	
		
	}
	

}

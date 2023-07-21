package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Part3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	WebElement User=driver.findElement(By.xpath("//input[@type='text']"));
	User.sendKeys("SRKhan@gmail.com");
	
	WebElement Pw=driver.findElement(By.xpath("//input[@type='password']"));
	Pw.sendKeys("iamsrk_143");
	
   driver.findElement(By.xpath("//input[@type='Submit']")).click();
				
	}
	

}

package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Task {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//li[@class='Frames Example']")).click();
		
		
	   WebElement Topic=driver.findElement(By.xpath("//input[type='text']"));
	    Topic.sendKeys("Hello, Good Morning");
		Thread.sleep(3000);
		//driver.switchTo().frame("frame1");
		
		
		
	}

}

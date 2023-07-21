package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_Qs4 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement AlertText = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		AlertText.click();
		Thread.sleep(3000);
		
		WebElement Text = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		Thread.sleep(3000);
	    driver.switchTo().alert().sendKeys("Archana Pichumani");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
	}
	

}

	package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		
		//****Simple Alert****
		
		WebElement SimpleAlert=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		SimpleAlert.click(); 
		Thread.sleep(3000);
		 
		driver.switchTo().alert().accept();
		
		//*******Confirm Alert*****
		
		WebElement ConfirmAlert=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		
		ConfirmAlert.click();
		Thread.sleep(3000);
		
		//WebElement ConfirmAlert1 =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		WebElement ConfirmAlert1 =driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		
		ConfirmAlert1.click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		//**********Prompt Alert*******
		
		WebElement PromptAlert=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		//WebElement PromptAlert=driver.findElement(By.xpath("//a[@aria-expanded='true']"));
		PromptAlert.click();
		Thread.sleep(3000);
		
 	WebElement PromptAlert1=driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));    	PromptAlert1.click();
	driver.switchTo().alert().sendKeys("Archana Pichumani");
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
		
	
	
	}
	

}

package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(("webdriver.chrome.driver"), ("C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe"));
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("SingleFrame");
		
		
		WebElement SFrame = driver.findElement(By.xpath("//input[@type='text']"));
		SFrame.sendKeys("Welcome to Single Frame");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement MFrame = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		MFrame.click();
		
		WebElement Iframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(Iframe);
		
		WebElement Iframe1 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(Iframe1);
		
		WebElement SFrame1 = driver.findElement(By.xpath("//input[@type='text']"));
		SFrame1.sendKeys("Welcome to IFrame");
		
		
	}

}

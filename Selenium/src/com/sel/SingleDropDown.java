package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(3000);
		
		WebElement Products=driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		Select s= new Select(Products);
		s.selectByValue("Google");
		Thread.sleep(3000);
		
		WebElement Animals = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
		Select s1= new Select(Animals);
		//s1.selectByVisibleText("Baby Cat");
		//s1.selectByIndex(1);
		s1.selectByValue("babycat");   
		
		Thread.sleep(3000);
		
		 
		
	}

}

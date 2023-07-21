package com.task;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day9_Qs13 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select S=new Select(Fruits);
		S.selectByVisibleText("Banana");
		S.selectByVisibleText("Apple");
		S.selectByVisibleText("Orange");
		S.selectByVisibleText("Grape");
		
		WebElement firstSelectedOption = S.getFirstSelectedOption();
		 			 System.out.println(firstSelectedOption.getText());
			 	 }
		
				
	}



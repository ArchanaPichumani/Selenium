package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling_Day10Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement iphone7 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Actions An=new Actions(driver);
		iphone7.sendKeys("Iphone 7");
		
		WebElement search = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
		An.moveToElement(search).click().perform();
		Thread.sleep(3000);
		
		WebElement iphonesil = driver.findElement(By.xpath("//p[@title='Apple Silicon Soft cases For Apple iPhone 7 by NBOX - Silver']"));
		iphonesil.click();
		Thread.sleep(3000);
		
		WebElement addtocart = driver.findElement(By.xpath("//span[text()='add to cart ']"));
		An.moveToElement(addtocart).click().perform();
		Thread.sleep(3000);
		
	}

}

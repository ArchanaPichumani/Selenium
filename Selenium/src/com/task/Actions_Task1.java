package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Task1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
		
		WebElement Home = driver.findElement(By.xpath("//a[@data-reactid='499']"));
		Actions Ac=new Actions(driver);
		Ac.moveToElement(Home).perform();
		Thread.sleep(3000);
		
	
		WebElement Bed = driver.findElement(By.xpath("(//a[@class='desktop-categoryLink'])[168]"));
		Actions An=new Actions(driver);
		An.moveToElement(Bed).click().perform();
		Thread.sleep(3000);
		
	}

}

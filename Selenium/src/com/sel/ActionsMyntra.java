package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMyntra {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.myntra.com/");
	       driver.manage().window().maximize();
	       Thread.sleep(3000);
		
		WebElement Men = driver.findElement(By.xpath("(//a[@data-reactid='21'])[1]"));
		Actions At=new Actions(driver);
		At.moveToElement(Men).perform();
		Thread.sleep(3000);
		
		
		WebElement Helmets = driver.findElement(By.xpath("(//a[@class='desktop-categoryLink'])[54]"));
		Actions Ns=new Actions (driver);
		Ns.moveToElement(Helmets).perform();
		Thread.sleep(3000);
		
		
		
		 
		
	}
	

}

package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions_Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
				
		
		WebElement FB = driver.findElement(By.xpath("//a[@id='promo-3']"));
		//Actions N=new Actions(driver);
	    FB.click();
	    Thread.sleep(3000);
		
		WebElement Nut = driver.findElement(By.xpath("(//span[@class='prod_name '])[12]"));
		Actions S=new Actions(driver);
		S.click();
		Thread.sleep(3000);
		
	}
	
}

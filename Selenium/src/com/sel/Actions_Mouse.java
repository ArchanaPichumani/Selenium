package com.sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_Mouse {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement Mobiles = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
		Actions N= new Actions(driver);
		N.moveToElement(Mobiles).click().perform();
		Thread.sleep(3000);
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(6));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='xtXmba'])[2]"))).click();
		
		WebElement Realme=driver.findElement(By.xpath("//div[@title='realme']"));
		Actions S=new Actions(driver);
		S.moveToElement(Realme).click().perform();
		Thread.sleep(3000);
			
		
		WebElement model = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		Actions A=new Actions(driver);
		A.moveToElement(model).click().perform();
		Thread.sleep(3000);
		
		
		
	}

}

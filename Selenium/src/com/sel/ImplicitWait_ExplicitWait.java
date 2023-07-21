package com.sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait_ExplicitWait extends BaseClass{
	
public static void main(String[] args) throws InterruptedException {
		
		browser("Chrome");
		getUrl("https://www.facebook.com/");
		
			
		WebElement cookies = driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
		cookies.click();
		Thread.sleep(3000);
					   
 	    WebElement mailid = driver.findElement(By.xpath("//input[@type='text']"));
		mailid.sendKeys("rcc@gmail.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
		pw.sendKeys("rcc*13131314");
		WebDriverWait w=new WebDriverWait (driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).click();
		
		
		 
	}

}




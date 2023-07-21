package com.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sel.BaseClass;

public class Magento extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browser("Chrome");
		getUrl("https://magento.softwaretestingboard.com/");
		
		Mag_Page_One MP=new Mag_Page_One(driver);
		
		MP.getBag().click();
		Thread.sleep(2000);
		
		MP.getQty().sendKeys("1");
		Thread.sleep(2000);
		
		MP.getAdd2Cart().click();
		Thread.sleep(2000);
		
		MP.getViewCart().click();
		Thread.sleep(2000);
		
		MP.getProceed().click();
		Thread.sleep(2000);
		   		
		MP.getCusEmail().sendKeys("archavy8184@gmail.com");
		Thread.sleep(6000);
		
		MP.getCusPass().sendKeys("AmriAvyu*9");
		Thread.sleep(2000);
					
		MP.getSign().click();
		Thread.sleep(2000);
							
        WebElement Next = driver.findElement(By.xpath("//span[text()='Copyright © 2013-present Magento, Inc. All rights reserved.']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Next);
		
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(6000);
		
		MP.getNext().click();
		Thread.sleep(3000);
				
		MP.getPlaceOrder().click();
		Thread.sleep(2000);
		
		
	}
	



	

}

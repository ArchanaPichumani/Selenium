package com.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sel.BaseClass;

public class Day_2_Task_Qs10 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		browser("Chrome");
		getUrl("http://adactinhotelapp.com/");
		
				
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("AmriAvyu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
				
		WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
		passWord.sendKeys("arch160784");
		Thread.sleep(3000);
		
		WebElement logIn = driver.findElement(By.xpath("//input[@type='Submit']"));
		logIn.click();
		
	}

}

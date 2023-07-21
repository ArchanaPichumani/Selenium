package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_Qs8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Username = driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']"));
		Thread.sleep(3000);
		Username.sendKeys("11245782452");
		Username.click();
		Thread.sleep(3000);
		
		WebElement Password = driver.findElement(By.xpath("//input[@class='login-input-password']"));
		Password.sendKeys("160784");
		Thread.sleep(3000);
		
		WebElement Submit = driver.findElement(By.xpath("//input[@onclick='return feba.js.adaptive.icici.onLoginSubmit(this.id);']"));
		Submit.click();
		Thread.sleep(3000);
		
		
	}

}

package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
		
  
	 WebElement Mobiles = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[5]"));
		Actions A=new Actions(driver);
		A.moveToElement(Mobiles);
		A.contextClick(Mobiles).perform();
		Thread.sleep(3000);
		
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement Deals = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[6]"));
		Actions C=new Actions(driver);
		C.moveToElement(Deals);
		A.contextClick(Deals).perform();
		Thread.sleep(3000);
		
		Robot o =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement CS = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[7]"));
		Actions T=new Actions(driver);
		T.moveToElement(CS);
		A.contextClick(CS).perform();
		Thread.sleep(3000);
		
		Robot b =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	

		
		
	}

}

package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
	Actions As=new Actions(driver);
	As.contextClick(mobiles).perform();
	Thread.sleep(3000);
	
	Robot Ot= new Robot();
	
	Ot.keyPress(KeyEvent.VK_DOWN);
	Ot.keyRelease(KeyEvent.VK_DOWN);
	
	Ot.keyPress(KeyEvent.VK_ENTER);
	Ot.keyRelease(KeyEvent.VK_ENTER);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
	WebElement Todaysdeals = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
	As.contextClick(Todaysdeals).perform();
	Thread.sleep(3000);
	
	Ot.keyPress(KeyEvent.VK_DOWN);
	Ot.keyRelease(KeyEvent.VK_DOWN);
	
	Ot.keyPress(KeyEvent.VK_DOWN);
	Ot.keyRelease(KeyEvent.VK_DOWN); 
	
	Ot.keyPress(KeyEvent.VK_ENTER);
	Ot.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement CustomerService = driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));
	As.contextClick(CustomerService).perform();
	Thread.sleep(3000);	
	
	Ot.keyPress(KeyEvent.VK_DOWN);
	Ot.keyRelease(KeyEvent.VK_DOWN);
	
	Ot.keyPress(KeyEvent.VK_DOWN);
	Ot.keyRelease(KeyEvent.VK_DOWN);
	
	Ot.keyPress(KeyEvent.VK_ENTER);
	Ot.keyRelease(KeyEvent.VK_ENTER);
	
	Set<String> windowHandles = driver.getWindowHandles();
	ArrayList<String>li=new ArrayList<>(windowHandles);
	
	 driver.switchTo().window(li.get(0));
	 Thread.sleep(2000);
	 driver.switchTo().window(li.get(3));
	 Thread.sleep(3000);
	 driver.switchTo().window(li.get(0));
	 Thread.sleep(3000);
	 driver.close();
	 
	
	}

}

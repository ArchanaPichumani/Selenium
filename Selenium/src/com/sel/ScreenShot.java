package com.sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		TakesScreenshot ST=(TakesScreenshot)driver;//Interface (create obj Ts)
		File src= ST.getScreenshotAs(OutputType.FILE);//Method and take return type
		File des = new File("C:\\Users\\cex\\eclipse-workspace\\Selenium\\ScreenShot\\automation.png");//location of the file and name the file name.png
		Files.copy(src, des);//merge the src n des n exception thrown as IO Exception
		
		
		WebElement branch = driver.findElement(By.xpath("(//span[@class='red_text'])[1]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", branch);
		
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000); 
		
	}
	

}

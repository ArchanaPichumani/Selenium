package com.sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BaseClass {
	
	public static WebDriver driver;
	public static JavascriptExecutor js=(JavascriptExecutor)driver;
	public static WebElement findElement;
	
	
	public static void browser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
				
	}
		
		else if(browser.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
			
			 driver = new EdgeDriver();
			driver.manage().window().maximize();
					}
			
		}
	
	public static void getUrl(String Url) {
     driver.get(Url);
     
	}
	
     public static void getTitle() {
    	 String title = driver.getTitle();
    	 System.out.println(title);
      
     }
     
     public static void sendKeys(WebElement findElement, String Values) {
    	 findElement.sendKeys(Values);
    	 
     }
      public static void getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
}
     
      public static void SimpleAlert() {
    	  
    	  driver.switchTo().alert().accept();
    	  
      }
      
      public static void ConfirmAlert(boolean accept) {
    	  Alert alert = driver.switchTo().alert();
    	  String alertText = alert.getText();
    	  
    	  if(accept) {
    		  alert.accept();
    		  System.out.println(alertText);
    	  }else {
    		  alert.dismiss();
    		  System.out.println(alertText);
    	  }
      }
      
     
    public static void ScreenShot() throws IOException {
    	
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	
    	File src=ts.getScreenshotAs(OutputType.FILE);
    	
    	File des=new File("C:\\Users\\cex\\eclipse-workspace\\Selenium\\ScreenShot\\SS1.png");
    	
    	Files.copy(src, des);
    	   	
    }
    
         public static void findxpath(String xpathExpression) {
        	 WebElement findxpath = driver.findElement(By.xpath(""));
         }
      	  	
    	 public static void scrollUpAndDownwithElementJs(WebElement element) {
       	  js.executeScript("arguments[0].scrollIntoView();",element);
       	  
         }

    	  public static void scrollDownJs() {
    		  js.executeScript("window.scrollBy(0,1000)");
    	  }
    	   
    	  public static void scrollUpJs() {
    		  js.executeScript("window.scrollBy(0,-1000)");
    	 
    }

    public static void quitBrowser() {
    	driver.quit();
    }
    
    public static void Click(WebElement element) {
    	element.click();
    }
    
      
     
}

    



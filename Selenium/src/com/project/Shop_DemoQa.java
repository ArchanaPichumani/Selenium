package com.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sel.BaseClass;

public class Shop_DemoQa extends BaseClass {
	
	 
	public static void main(String[] args) throws InterruptedException {
		
		 
	browser("Chrome");  
	getUrl("https://shop.demoqa.com/");
	Thread.sleep(3000);
		
    Shop_Pojo_PageOne On=new Shop_Pojo_PageOne(driver);
    
    Shop_Pojo_PageTwo To=new Shop_Pojo_PageTwo(driver);
    
    On.getDress().click(); 
    Thread.sleep(3000); 
     
    On.getColor();
    Select Ts=new Select(On.getColor());  
    Ts.selectByValue("Black");
    Thread.sleep(3000);
    
    On.getSize();
    Select St=new Select(On.getSize()); 
    St.selectByValue("S");
    Thread.sleep(3000);
    
    
    On.getQty().click();
    Thread.sleep(3000);
    
    On.getAddToCart().click();
    Thread.sleep(3000);
    
    On.getBag().click();
    Thread.sleep(3000);
    
    On.getCoupon().sendKeys("ASKBH12");
    Thread.sleep(2000);
    
    On.getApply().click();
    Thread.sleep(3000); 
    
    On.getProceed().click();
    Thread.sleep(3000);
    
//    To.getLogin().click();
//    Thread.sleep(4000);
    
//    To.getUserName().sendKeys("Archavy09");
//    Thread.sleep(4000);
//    
//    To.getPassWord().sendKeys("AmriAvyu*9");
//    Thread.sleep(4000);
//    
//    To.getLog().click();
//    Thread.sleep(4000);
    
    To.getFname().sendKeys("Archana");
    Thread.sleep(2000);
    
    To.getLname().sendKeys("Avinash");
    Thread.sleep(2000);
   
    To.getCountry();
    Select S =new Select(To.getCountry());
    S.selectByValue("GB");
    Thread.sleep(2000);
    
    To.getHAdd().sendKeys("21, Oxford Street");
    Thread.sleep(2000);
    
    To.getTown().sendKeys("London");
    Thread.sleep(2000);
    
    To.getPost().sendKeys("SM5 3NE");
    Thread.sleep(2000);
    
    To.getPhone().sendKeys("07721778064");
    Thread.sleep(2000);
    
    To.getBEmail().sendKeys("Archavy8184@gmail.com");
    Thread.sleep(6000);
       
    driver.findElement(By.xpath("//input[@id='terms']"));
    WebDriverWait w=new WebDriverWait (driver,Duration.ofSeconds(10));
	w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='terms']"))).click();
    
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//    To.getCheckBox().click();
//    Thread.sleep(3000);
        
	 To.getPlaceOrder().click();
	 
	 WebElement order = driver.findElement(By.xpath("//p[text()='Thank you. Your order has been received.']"));
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();", order);
	 js.executeScript("window.scrollBy(0,1000)");
	
		
	}

}

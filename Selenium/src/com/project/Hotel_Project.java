package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sel.BaseClass;

public class Hotel_Project extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browser("Chrome"); 
		getUrl("https://adactinhotelapp.com/ ");
		Thread.sleep(3000);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@type='text']"));
		UserName.sendKeys("Archavy09");
		Thread.sleep(3000);
		
		WebElement PassWord = driver.findElement(By.xpath("//input[@type='password']"));
		PassWord.sendKeys("AmriAvyu*9");
		Thread.sleep(3000); 
		
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		Thread.sleep(3000);
		 
		Pojo_Page_One PO= new Pojo_Page_One(driver);
		
		Pojo_Page_Two PT= new Pojo_Page_Two(driver);
		
		Pojo_Page_Three PH= new Pojo_Page_Three(driver);
		 
		PO.getLocation();
		Select S=new Select(PO.getLocation());
		S.selectByValue("London");
		Thread.sleep(3000);
		
		PO.getHotels();
		Select S1=new Select(PO.getHotels());
		S1.selectByValue("Hotel Sunshine");
		Thread.sleep(3000);
		
		PO.getRoomType();
		Select S2=new Select(PO.getRoomType());
		S2.selectByIndex(2);
		Thread.sleep(3000);
		
		PO.getRoomNos();
		Select S3=new Select(PO.getRoomNos());
		S3.selectByValue("2");
		Thread.sleep(3000);
		
		PO.getCheckIn().sendKeys("07/16/2023");
		Thread.sleep(3000);
		
		PO.getCheckOut().sendKeys("07/21/2023");
		Thread.sleep(3000);
		
		PO.getAdults();
		Select S4=new Select(PO.getAdults());
		S4.selectByValue("4");
		Thread.sleep(3000);
		
		PO.getChild();
		Select S5=new Select(PO.getChild());
		S5.selectByValue("4");
		Thread.sleep(3000);
		
		PO.getSubmit().click();
		Thread.sleep(3000);
		
		PT.getRadioBtn().click();
		Thread.sleep(3000);
		
		PT.getContinue().click();
		
		PH.getFname().sendKeys("Archana");
		Thread.sleep(3000);
		
		PH.getLname().sendKeys("Avinash");
		Thread.sleep(3000);
		
		PH.getAddress().sendKeys("21, Oxford Road, SM3 9NE,London");
		Thread.sleep(3000);
		
		PH.getCC().sendKeys("1478523691235784");
		
		PH.getCCtype();
		Select Sl=new Select(PH.getCCtype());
		Sl.selectByValue("VISA");
		Thread.sleep(3000);
		
		PH.getExpDate();
		Select ST=new Select(PH.getExpDate());
		ST.selectByValue("7");
		Thread.sleep(3000);
		
		PH.getExpYear();
		Select SE=new Select(PH.getExpYear());
		SE.selectByValue("2025");
		Thread.sleep(3000);
		
		PH.getCvv().sendKeys("158");
		Thread.sleep(2000);	
		
		PH.getBookNow().click();
		Thread.sleep(3000);
				
        WebElement Log = driver.findElement(By.xpath("//a[text()='Adactin.com']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Log);
		
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(6000);
		
		PH.getLogOut().click();
		
			}
	}

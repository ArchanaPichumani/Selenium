package com.sel;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable extends BaseClass{
	
	
	public static void main(String[] args) throws InterruptedException {
		
		browser("Chrome");
		getUrl("https://www.w3schools.com/html/html_tables.asp");
		
	List<WebElement> Table = driver.findElements(By.xpath("//table[@id='customers']"));
	
	for (WebElement alldata : Table) {
		
		System.out.println(alldata.getText());
		}
	
	Thread.sleep(3000);
	System.err.println("*********Company*******");
	
	List<WebElement> company = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
	for (WebElement coname : company) {
		
		System.out.println(coname.getText());
		
	}
	
	Thread.sleep(3000);
	System.err.println("*********Contact*******");
	
	List<WebElement> contact = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
	for (WebElement conname : contact) {
		
		System.out.println(conname.getText());
			}
	Thread.sleep(3000);
	System.err.println("*********Country*******");
	
	List<WebElement> country = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
	for (WebElement countname : country) {
		
	System.out.println(countname.getText());
		}
	
	Thread.sleep(3000);
	System.err.println("*********Headers*******");
	
	List<WebElement> Headers = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	       for (WebElement Head : Headers) {
			System.out.println(Head.getText());
	    	   
		}
	       Thread.sleep(3000);
	   	System.err.println("*********Company1*******");
	
	       WebElement company1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
	        System.out.println(company1.getText());
	              
}
}
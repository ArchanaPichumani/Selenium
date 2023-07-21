package com.project;

import com.sel.BaseClass;

public class Automation_Excersice extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
				
		browser("Chrome");
		Thread.sleep(3000);
		
		getUrl("https://automationexercise.com/");
		Thread.sleep(3000);
		
		Auto_PageOne AP = new Auto_PageOne(driver);
		
		AP.getBaby().click();
		Thread.sleep(2000);
		
		AP.getTop().click();
		Thread.sleep(2000);
		
		AP.getViewCart().click();
		Thread.sleep(3000);
		
		AP.getProceed().click();
		Thread.sleep(2000);
		
		AP.getLogin().click();
		Thread.sleep(3000);
		
		AP.getEmail().sendKeys("archavy8184@gmail.com");
		Thread.sleep(3000);
		
		AP.getPassword().sendKeys("AmriAvyu*9");
		Thread.sleep(2000);
		
		AP.getLog().click();
		Thread.sleep(3000);
		
		AP.getCart().click();
		Thread.sleep(2000);
		
		AP.getCheckOut().click();
		Thread.sleep(2000);
		
		AP.getPlaceOrder().click();
		Thread.sleep(2000);
		
		AP.getName().sendKeys("Mrs.Archana Avinash");
		Thread.sleep(2000);
		
		AP.getCard().sendKeys("1234567895367891");
		Thread.sleep(2000);
		
		AP.getCvc().sendKeys("353");
		Thread.sleep(2000);
		
		AP.getExpiry().sendKeys("07");
		Thread.sleep(2000);
		
		AP.getExpiryYear().sendKeys("2024");
		Thread.sleep(2000);
		
		AP.getSubmit().click();
		
	}
	
}

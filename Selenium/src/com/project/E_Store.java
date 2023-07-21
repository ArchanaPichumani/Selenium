package com.project;

import org.openqa.selenium.support.ui.Select;

import com.sel.BaseClass;

public class E_Store extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		browser("Chrome");
		getUrl("https://estore.onesoftway.com/");
				
		Estore_Page_One EO=new Estore_Page_One(driver);
		
		EO.getToys().click();
		Thread.sleep(3000);
		
		EO.getHorse().click();
		Thread.sleep(3000);
		
		EO.getAdd().click();
		Thread.sleep(3000);
		
		EO.getCart().click();
		Thread.sleep(3000);
		
		EO.getTerms().click();
		Thread.sleep(3000);
		
		EO.getProceed().click();
		Thread.sleep(3000);
		
		EO.getFname().sendKeys("Archana");
		Thread.sleep(3000);
		
		EO.getLname().sendKeys("Avinash");
		Thread.sleep(3000);
		
		EO.getEmail().sendKeys("archavy8184@gmail.com");
		Thread.sleep(3000);
		
		EO.getCountry();
		Select T=new Select(EO.getCountry());
		T.selectByValue("80");
		Thread.sleep(3000);
		
		EO.getState();
		Select T1=new Select(EO.getState());
		T1.selectByVisibleText("London");
		Thread.sleep(3000);
								
		EO.getCity().sendKeys("Sutton");
		Thread.sleep(3000);
		
		EO.getAdd1().sendKeys("21, Oxford Street");
		Thread.sleep(3000);
		
		EO.getPost().sendKeys("SM5 9NE");
		Thread.sleep(3000);
		
		EO.getPhone().sendKeys("07721778064");
		Thread.sleep(5000);
		
		EO.getNext().click();
		Thread.sleep(6000);
		
		EO.getShip().click();
		Thread.sleep(2000);
		
		EO.getNext1().click();
		Thread.sleep(3000);
		
		EO.getNext2().click();
		Thread.sleep(3000);
		
		EO.getNext3().click();
		Thread.sleep(3000);
		
		EO.getConfirm().click();
		Thread.sleep(3000);
		
		
		
	}

}

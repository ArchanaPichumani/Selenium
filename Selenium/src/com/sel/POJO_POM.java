package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class POJO_POM extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		browser("Chrome");
		getUrl(" https://rahulshettyacademy.com/seleniumPractise/#/ ");
		
		Pojo_PageOne o=new Pojo_PageOne(driver);
		Pojo_PageTwo t=new Pojo_PageTwo(driver);
		Pojo_PageThree r=new Pojo_PageThree(driver);
		
		o.getSearch().sendKeys("Capsicum");
		Thread.sleep(3000);
		
		o.getQty().click();
		Thread.sleep(3000);
		
		o.getAddtoCart().click();
		Thread.sleep(3000);
		
		o.getItems().click();
		Thread.sleep(3000);
		
		o.getPtocheck().click();
		Thread.sleep(3000);
		
		t.getPromo().sendKeys("A1234");
		Thread.sleep(3000);
		
		t.getApply().click();
		Thread.sleep(3000);
		
		t.getPorder().click();
		Thread.sleep(3000);
		
		r.getSelect();
		Select s=new Select(r.getSelect());
		s.selectByValue("Malawi");
		Thread.sleep(3000);
		
		r.getAgree().click();
		Thread.sleep(3000);
		
		r.getProceed().click();
		Thread.sleep(3000);

		
		
	}
	
	
	

}

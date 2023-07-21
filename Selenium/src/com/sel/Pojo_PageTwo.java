package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_PageTwo {
	WebDriver driver;

	@FindBy(xpath="//input[@placeholder='Enter promo code']")
	private WebElement Promo;
	
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement Apply;
	
	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement Porder;

	public Pojo_PageTwo(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getPromo() {
		return Promo;
	}

	public WebElement getApply() {
		return Apply;
	}

	public WebElement getPorder() {
		return Porder;
	}
	
	
	
}

package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_PageThree {
	WebDriver driver;
	
	@FindBy(xpath="//select[@style='width: 200px;']")
	private WebElement Select;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement Agree;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement Proceed;

	public Pojo_PageThree(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver2, this);
	
	}

	public WebElement getSelect() {
		return Select;
	}

	public WebElement getAgree() {
		return Agree;
	}

	public WebElement getProceed() {
		return Proceed;
	}
	
	

}

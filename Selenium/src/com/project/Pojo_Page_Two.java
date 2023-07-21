package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_Page_Two {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement RadioBtn;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement Continue;


	
	public Pojo_Page_Two(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
 

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadioBtn() {
		return RadioBtn;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
	

}

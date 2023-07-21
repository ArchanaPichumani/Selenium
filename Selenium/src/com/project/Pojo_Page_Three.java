package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_Page_Three {
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement Fname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement Lname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement Address;
	
	public Pojo_Page_Three(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver; 
	} 

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCC() {
		return CC;
	}

	public WebElement getCCtype() {
		return CCtype;
	}

	public WebElement getExpDate() {
		return ExpDate;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getLogOut() {
		return LogOut;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getBookNow() {
		return BookNow;
	}

	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement CC;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement CCtype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement ExpDate;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement ExpYear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement Cvv;
	
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement BookNow;
		
	@FindBy(xpath="//input[@value='Logout']")
	private WebElement LogOut;

	
	
	
}

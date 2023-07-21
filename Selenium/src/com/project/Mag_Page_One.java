package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mag_Page_One {
	
	WebDriver driver;

	public Mag_Page_One(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getBag() {
		return Bag;
	}

	public WebElement getQty() {
		return Qty;
	}

	public WebElement getAdd2Cart() {
		return Add2Cart;
	}

	public WebElement getViewCart() {
		return ViewCart;
	}

	public WebElement getProceed() {
		return Proceed;
	}

//	public WebElement getSignin() {
//		return Signin;
//	}

//	public WebElement getEmail() {
//		return Email;
//	}

//	public WebElement getPass() {
//		return Pass;
//	}

	public WebElement getSign() {
		return Sign;
	}

	public WebElement getNext() {
		return Next;
	}

	public WebElement getPlaceOrder() {
		return PlaceOrder;
	}

	@FindBy(xpath="(//a[@class='product-item-link'])[6]")
	private WebElement Bag;
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement Qty;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Add2Cart;
	
	@FindBy(xpath="//a[@class='action showcart']")
	private WebElement ViewCart;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	private WebElement Proceed;
	
	@FindBy(xpath="(//input[@id='customer-email'])[1]")
	private WebElement CusEmail;
	
//	@FindBy(xpath="(//input[@type='email'])[1]")
//	private WebElement Email;
	
	@FindBy(xpath="(//input[@name='password'])[2]")
	private WebElement CusPass;
	
	@FindBy(xpath="//button[@class='action login primary']")
	private WebElement Sign;
	
	public WebElement getCusEmail() {
		return CusEmail;
	}

	public void setCusEmail(WebElement cusEmail) {
		CusEmail = cusEmail;
	}

	public WebElement getCusPass() {
		return CusPass;
	}

	public void setCusPass(WebElement cusPass) {
		CusPass = cusPass;
	}

	@FindBy(xpath="//span[text()='Next']")
	private WebElement Next;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement PlaceOrder;
}

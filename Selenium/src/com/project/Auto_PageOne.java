package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auto_PageOne {
	
	WebDriver driver;
		

	public Auto_PageOne(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getBaby() {
		return Baby;
	}

	public WebElement getTop() {
		return Top;
	}

	public WebElement getViewCart() {
		return ViewCart;
	}

	public WebElement getProceed() {
		return Proceed;
	}

	public WebElement getPlaceOrder() {
		return PlaceOrder;
	}

	public WebElement getName() {
		return Name;
	}

	public WebElement getCard() {
		return Card;
	}

	public WebElement getCvc() {
		return Cvc;
	}

	public WebElement getExpiry() {
		return Expiry;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	@FindBy(xpath="//a[text()='Babyhug']")
	private WebElement Baby;
	
	@FindBy(xpath="(//i[@class='fa fa-shopping-cart'])[8]")
	private WebElement Top;
	
	@FindBy(xpath="//u[text()='View Cart']")
     private WebElement ViewCart;
	
	@FindBy(xpath="//a[@class='btn btn-default check_out']")
	private WebElement Proceed;
	
	@FindBy(xpath="//u[text()='Register / Login']")
	private WebElement Login;
	
	@FindBy(xpath="(//input[@placeholder='Email Address'])[1]")
	private WebElement Email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement Password;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement Log;
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	private WebElement Cart;
	
	@FindBy(xpath="//a[@class='btn btn-default check_out']")
	private WebElement CheckOut;
	
	public WebElement getCheckOut() {
		return CheckOut;
	}

	public void setCheckOut(WebElement checkOut) {
		CheckOut = checkOut;
	}

	public WebElement getCart() {
		return Cart;
	}

	public void setCart(WebElement cart) {
		Cart = cart;
	}

	public WebElement getLog() {
		return Log;
	}

	public void setLog(WebElement log) {
		Log = log;
	}

	@FindBy(xpath="//a[text()='Place Order']")
	private WebElement PlaceOrder;
	
	public WebElement getLogin() {
		return Login;
	}

	public void setLogin(WebElement login) {
		Login = login;
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(WebElement email) {
		Email = email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	@FindBy(xpath="//input[@name='name_on_card']")
	private WebElement Name;
	
	@FindBy(xpath="//input[@name='card_number']")
	private WebElement Card;
	
	@FindBy(xpath="//input[@name='cvc']")
	private WebElement Cvc;
	
	@FindBy(xpath="//input[@name='expiry_month']") 
	private WebElement Expiry;
	
	@FindBy(xpath="//input[@name='expiry_year']") 
	private WebElement ExpiryYear;
	
	@FindBy(xpath="//button[@id='submit']") 
	private WebElement Submit;
	
	
}

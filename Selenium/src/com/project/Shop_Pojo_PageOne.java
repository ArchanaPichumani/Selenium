package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop_Pojo_PageOne {
	WebDriver driver;
	
	public Shop_Pojo_PageOne(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getDress() {
		return Dress;
	}

	public WebElement getColor() {
		return Color;
	}

	public WebElement getSize() { 
		return Size;
	}

	public WebElement getQty() {
		return Qty;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getBag() {
		return Bag;
	}

	public WebElement getCoupon() {
		return Coupon;
	}

	public WebElement getApply() {
		return Apply;
	}

	public WebElement getProceed() {
		return Proceed;
	}

	@FindBy(xpath="//a[text()='Tokyo Talkies']")
	private WebElement Dress;
	
	
	@FindBy (xpath="//select[@name='attribute_color']")
	private WebElement Color;
	
	@FindBy (xpath="//select[@name='attribute_size']")
	private WebElement Size;
	
	
	@FindBy(xpath="//button[@class='qty-increase']")
	private WebElement Qty;
	
		
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement AddToCart;
	
	@FindBy (xpath="//i[@class='icon_bag_alt']")
	private WebElement Bag;
	
	@FindBy(xpath="(//input[@placeholder='Coupon code'])[2]")
	private WebElement Coupon;
	
	@FindBy(xpath="//button[@class='noo-apply-coupon']")
			private WebElement Apply;
	
	
	@FindBy(xpath="//a[@class='checkout-button button alt wc-forward wp-element-button']")
	private WebElement Proceed;
	
	
	

}

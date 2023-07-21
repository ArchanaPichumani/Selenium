package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_PageOne {
	 WebDriver driver;

	@FindBy(xpath="//input[@placeholder='Search for Vegetables and Fruits']")
			private WebElement Search;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement AddtoCart;

	@FindBy(xpath="//a[@class='increment']")
	private WebElement Qty;
	
	@FindBy(xpath="//img[@alt='Cart']")
	private WebElement Items;
	
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	private WebElement Ptocheck;

	public Pojo_PageOne(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getAddtoCart() {
		return AddtoCart;
	}

	public WebElement getPtocheck() {
		return Ptocheck;
	}

	public void setPtocheck(WebElement ptocheck) {
		Ptocheck = ptocheck;
	}

	public WebElement getQty() {
		return Qty;
	}

	public WebElement getItems() {
		return Items;
	}
	
	
	
}

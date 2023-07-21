package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Estore_Page_One {
      
	public Estore_Page_One(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getToys() {
		return Toys;
	}

	public WebElement getHorse() {
		return Horse;
	}

	public WebElement getAdd() {
		return Add;
	}

	public WebElement getCart() {
		return Cart;
	}

	public WebElement getTerms() {
		return Terms;
	}

	public WebElement getProceed() {
		return Proceed;
	}

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getAdd1() {
		return Add1;
	}

//	public WebElement getAdd2() {
//		return Add2;
//	}

	public WebElement getPost() {
		return Post;
	}

	public WebElement getPhone() {
		return Phone;
	}

	public WebElement getNext() {
		return Next;
	}

	public WebElement getShip() {
		return Ship;
	}

	public WebElement getNext1() {
		return Next1;
	}

	public WebElement getNext2() {
		return Next2;
	}

	public WebElement getNext3() {
		return Next3;
	}

	public WebElement getConfirm() {
		return Confirm;
	}

	WebDriver driver;
	
	@FindBy(xpath="(//a[@class='with-subcategories'])[55]")
	private WebElement Toys;
	
	@FindBy(xpath="//button[@data-productid='215']")
	private WebElement Horse;
	
	@FindBy(xpath="//button[@id='add-to-cart-button-215']")
	private WebElement Add;
	
	@FindBy(xpath="(//button[text()='Go to cart'])[2]")
	private WebElement Cart;
	
	
	@FindBy(xpath="//input[@id='termsofservice']")
	private WebElement Terms;
	
	@FindBy(xpath="//button[text()=' Proceed to checkout ']")
	private WebElement Proceed;
	
	
	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
	private WebElement Fname;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
	private WebElement Lname;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Email']")
	private WebElement Email;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	private WebElement Country;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_StateProvinceId']")
	private WebElement State;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	private WebElement City;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	private WebElement Add1;
	
//	@FindBy(xpath="//input[@id='BillingNewAddress_Address2']")
//	private WebElement Add2;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	private WebElement Post;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	private WebElement Phone;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement Next;
	
	@FindBy(xpath="//button[@class='button-1 select-shipping-address-button']")
	private WebElement Ship;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement Next1;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement Next2;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement Next3;
	
	@FindBy(xpath="//button[@class='button-1 confirm-order-next-step-button']")
	private WebElement Confirm;
	
	
}

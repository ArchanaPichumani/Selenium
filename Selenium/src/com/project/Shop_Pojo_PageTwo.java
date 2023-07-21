package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop_Pojo_PageTwo {
	
	WebDriver driver; 
	
	public Shop_Pojo_PageTwo(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

//	public WebElement getLogin() {
//		return Login;
//	} 
//
//	public WebElement getUserName() {
//		return UserName;
//	}
//
//	public WebElement getPassWord() {
//		return PassWord;
//	}
//
//	public WebElement getLog() { 
//		return Log;
	 

//	public WebElement getCheckBox() { 
//		return CheckBox;
//	}

	public WebElement getPlaceOrder() { 
		return PlaceOrder;
	}

//	@FindBy(xpath="//a[text()='Click here to login']")
//	private WebElement Login;
//		
//	@FindBy(xpath="(//input[@type='text'])[1]")
//	private WebElement UserName;
//	
//	@FindBy(xpath="(//input[@type='password'])[1]")
//	private WebElement PassWord;
//	
//   @FindBy(xpath="(//button[@type='submit'])[2]")
//    private WebElement Log;
   
   
   @FindBy(xpath="//input[@name='billing_first_name']")
   private WebElement Fname;
   
   @FindBy(xpath="//input[@name='billing_last_name']")
   private WebElement Lname;
      
   @FindBy(xpath="//select[@name='billing_country']")
   private WebElement Country;
   
   @FindBy(xpath="//input[@name='billing_address_1']")
   private WebElement HAdd;
   
   @FindBy(xpath="//input[@name='billing_city']")
   private WebElement Town;
   
   @FindBy(xpath="//input[@name='billing_postcode']")
   private WebElement Post;
   
   @FindBy(xpath="//input[@name='billing_phone']")
   private WebElement Phone;
   
   @FindBy(xpath="//input[@name='billing_email']")
   private WebElement BEmail;
   
   
   public WebElement getFname() {
	return Fname;
}

public WebElement getLname() {
	return Lname;
}

public WebElement getCountry() {
	return Country;
}

public WebElement getHAdd() {
	return HAdd;
}

public WebElement getTown() {
	return Town;
}

public WebElement getPost() {
	return Post;
}

public WebElement getPhone() {
	return Phone;
}

public WebElement getBEmail() {
	return BEmail;
}

// @FindBy(xpath="(//input[@type='checkbox'])[3]")
//   private WebElement CheckBox;
   
   @FindBy(xpath="(//button[@type='submit'])[4]")
   private WebElement PlaceOrder;
    
   
   

}

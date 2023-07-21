package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_Page_One {
	WebDriver driver;
	
@FindBy(xpath ="//select[@name='location']")
private WebElement Location;

@FindBy(xpath ="//select[@name='hotels']")
private WebElement Hotels;

@FindBy(xpath ="//select[@name='room_type']")
private WebElement RoomType;

@FindBy(xpath="//select[@name='room_nos']")
private WebElement RoomNos;

@FindBy(xpath="//input[@name='datepick_in']")
private WebElement CheckIn;

@FindBy(xpath="//input[@name='datepick_out']")
private WebElement CheckOut;

@FindBy(xpath="//select[@name='adult_room']")
private WebElement Adults;

@FindBy(xpath="//select[@name='child_room']") 
private WebElement Child;

@FindBy(xpath="//input[@type='submit']")
private WebElement Submit;

public Pojo_Page_One(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}

public WebDriver getDriver() {
	return driver;
}

public WebElement getLocation() {
	return Location;
}

public WebElement getHotels() {
	return Hotels;
}

public WebElement getRoomType() {
	return RoomType;
}

public WebElement getRoomNos() {
	return RoomNos;
}

public WebElement getCheckIn() {
	return CheckIn;
}

public WebElement getCheckOut() {
	return CheckOut;
}

public WebElement getAdults() {
	return Adults;
}

public WebElement getChild() {
	return Child;
}

public WebElement getSubmit() {
	return Submit;
}

}

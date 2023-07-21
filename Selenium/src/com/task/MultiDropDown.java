package com.task;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(3000);
		
		
		WebElement multiple = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
		Select m=new Select(multiple);
		boolean multiple2 = m.isMultiple();
		
		System.out.println(multiple2);
		
	    System.out.println("List of all Food Items:");
	    
	    List<WebElement> options = m.getOptions();
	    	for(WebElement allData : options){
	    		System.out.println(allData.getText());
	    		
	    
	    		
	}
	
	    	m.selectByValue("pizza");
	    	m.selectByIndex(3);
	    	m.selectByVisibleText("Donut");
	    	
	    	 
	    

}
}

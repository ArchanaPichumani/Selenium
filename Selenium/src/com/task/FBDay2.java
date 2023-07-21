package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBDay2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	 		
		Thread.sleep(3000);
		
//      WebElement email=driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
//      WebElement password=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));	    
//		password.sendKeys("Hello1234*9");
//		Thread.sleep(3000);
	
		WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Thread.sleep(3000);
		create.click();
		
		Thread.sleep(3000);

		WebElement Fname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Fname.sendKeys("Rohan");
		Thread.sleep(3000);
		
	    WebElement Lname=driver.findElement(By.xpath("//input[@name='lastname']"));
 	    Lname.sendKeys("Chordia");
		Thread.sleep(3000);

		WebElement mailid = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mailid.sendKeys("rcc@gmail.com");
		Thread.sleep(3000);
		
		WebElement remailid = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		remailid.sendKeys("rcc@gmail.com");
		Thread.sleep(3000);

		WebElement pw = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		Thread.sleep(3000);
		pw.sendKeys("rcc*13131314");
		
		WebElement date=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s=new Select(date);
		s.selectByValue("28");
		Thread.sleep(3000);
		
		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s1=new Select(month);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2001");
		Thread.sleep(3000);
		
		WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		gender.click();
				
		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		submit.click();
		Thread.sleep(3000);
		
		
	}
	
}

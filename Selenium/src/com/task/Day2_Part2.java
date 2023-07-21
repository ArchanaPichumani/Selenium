package com.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2_Part2 {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\cex\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
	
		WebElement Firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Firstname.sendKeys("Archana");
		Thread.sleep(3000);
		
		WebElement Lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Lastname.sendKeys("Pichumani");
		Thread.sleep(3000);
		
	    WebElement Address=driver.findElement(By.xpath("//textarea[@rows='3']"));
	
		Address.sendKeys("No,21,Oxford Road, Carshalton");
		Thread.sleep(3000);
		
		
		 WebElement mail=driver.findElement(By.xpath("//input[@type='email']"));
		 mail.sendKeys("archana.pichumani@gmail.com");
		 Thread.sleep(3000);
			
		 WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
		 phone.sendKeys("+919841210129");
		 Thread.sleep(3000);
		 
		 WebElement gender=driver.findElement(By.xpath("(//input[@ng-model='radiovalue'])[2]"));
		 Thread.sleep(3000);
		 gender.click();
		 Thread.sleep(3000);
				  		 
		 WebElement hobbies=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		 hobbies.click();
		 Thread.sleep(3000);
				 
		 WebElement hobbies1=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		 hobbies1.click();
		 Thread.sleep(3000);

		 
//		 WebElement one = driver.findElement(By.xpath("//a[@style='text-decoration:none'][1]"));
//		 Thread.sleep(3000);
//		 Select SE=new Select(one);
//		 SE.selectByVisibleText("Arabic");
		 
	//	 WebElement two = driver.findElement(By.xpath("//a[@style='text-decoration:none'][8]"));
	//	 Thread.sleep(3000);
		// two.click();
		 
	//	 WebElement three = driver.findElement(By.xpath("//a[@style='text-decoration:none'][18]"));
	//	 Thread.sleep(3000);
		// three.click();
		 
	//	 WebElement four = driver.findElement(By.xpath("//a[@style='text-decoration:none'][40]"));
	//	 Thread.sleep(3000);
		// four.click();
		 
		// Thread.sleep(3000);
//		 Select s =new Select(multiple);
//		 boolean multiple2 = s.isMultiple();
//		 System.out.println(multiple2); 
//		
//		 List<WebElement> options = s.getOptions();
//		 for(WebElement items:options) {
//		 System.out.println(items.getText());
		// }
		 
//		 s.selectByVisibleText("Arabic");
//		 s.selectByVisibleText("Bulgarian");
		 	 
		 
		 WebElement skill=driver.findElement(By.xpath("//select[@type='text']"));
		 Select e=new Select(skill);
		 e.selectByValue("Excel");
		 Thread.sleep(3000);
		 
		 
		 WebElement CC = driver.findElement(By.xpath("(//select[@type='text'])[2]"));
		 CC.click();
		 Thread.sleep(3000);
		 
		 WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		 Select t=new Select(country);
		 t.selectByIndex(6);
		 Thread.sleep(3000);
		 
		 WebElement Date=driver.findElement(By.xpath("(//select[@type='text'])[3]"));
		 Select dt=new Select(Date);
		 dt.selectByValue("1921");
		 Thread.sleep(3000);
		
		 WebElement Month=driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		 Select th=new Select(Month);
		 th.selectByValue("April");
		 Thread.sleep(3000);
		 
		 WebElement Day=driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		 Select ay=new Select(Day);
		 ay.selectByValue("11");
		 Thread.sleep(3000);
		 
		 WebElement PassWord=driver.findElement(By.xpath("//input[@id='firstpassword']"));
		 PassWord.sendKeys("Abcdef*98");
		 Thread.sleep(3000);
		 
		 WebElement PassWord1=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		 PassWord1.sendKeys("Abcdef*98");
		 Thread.sleep(3000);
		 
		 WebElement Submit =driver.findElement(By.xpath("//button[@id='submitbtn']"));
		 Submit.click();
		 Thread.sleep(3000);
		 
		 
		 }
		 
		 	 
		 
		 
		 
        	        	         	   
       }  

           
       
  

		
		
		
		
		
		
		
		
		
		
	
	

	




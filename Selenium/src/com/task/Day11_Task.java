package com.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sel.BaseClass;

public class Day11_Task extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		browser("Chrome");
		
		getUrl("http://demo.guru99.com/test/write-xpath-table.html\r\n");
			
		System.err.println("*******Web Table*********");
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@border='l']"));
			
		for (WebElement Tborder : table) {
			
		System.out.println(Tborder.getText());
		
		
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@border='l']/tbody/tr"));
		 System.err.println("Row Size");      
		 System.out.println(rows.size());
		
		}
			
		System.err.println("********First Row*******");
		Thread.sleep(3000);
		
		List<WebElement> firstrow = driver.findElements(By.xpath("//table[@border='l']/tbody/tr[1]"));
		for (WebElement frow : firstrow) {
			System.out.println(frow.getText());
			
			
		}
		
		
		}

		
		
	}



package com.task;

import java.io.IOException;

import org.openqa.selenium.By;

import com.sel.BaseClass;

public class Day10_Qs4 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		browser("Chrome");
		getUrl("http://www.greenstechnologys.com/python-training.html");
		
		getTitle();
		getCurrentUrl();
		ScreenShot();
		
	    	
		
	}

}

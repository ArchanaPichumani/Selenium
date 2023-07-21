package shop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sel.BaseClass;

public class Shop_demoqa extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		browser ("Chrome");
		getUrl("https://shop.demoqa.com/");
		
		 WebElement compare = driver.findElement(By.xpath("//a[@data-product_id='1485'][1]"));
            compare.click();
            Thread.sleep(3000);
            
        driver.findElement(By.xpath("(//a[@target='_parent'])[2]"));
        WebDriverWait w=new WebDriverWait (driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@target='_parent'])[2]"))).click();
		
        Thread.sleep(3000);
            
			}  	
            
            	
				
			}
		    
	
	
	



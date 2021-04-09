package com.lumens.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lumens.pages.Homepage;
import com.lumens.pages.Loginpagee;
import com.lumes.qa.base.Testbase;

public class Loginpagetest extends Testbase {
	
	  Loginpagee loginpage;
	  Homepage homepage;
	
	public  Loginpagetest() {
		
		super();
	}
	
	
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		initailzation();
		//driver.findElement(By.xpath("//div[@id='ltkpopup-close-button']")).click();
		
		
		//Thread.sleep(2000);
		 loginpage =new Loginpagee();
				}

	@Test (priority = 1)
	public void logintest() throws Throwable {
		
		
		String title =loginpage.validateloginpagetitle();
		 Assert.assertEquals(title, "Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com");
		 
		 loginpage.clickonaccount();
			homepage =loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
			
			homepage.selectproduct();
			homepage.shoptheitem();
		}
	
	
	
	
	
	
}

package com.lumens.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumes.qa.base.Testbase;

public class Loginpagee extends Testbase {
	
	
	WebDriverWait wait = new WebDriverWait(driver,20);
	
	//pagefactory --OR
	
	@FindBy(xpath ="//button[@class='btn account-btn']")
	WebElement Accountbutton;
	
		@FindBy(xpath ="//div[@class='dropdown-menu']/div/a[contains(text(),'Sign In')]")
		WebElement Signupdropdown;

		@FindBy(xpath ="//input[@name='dwfrm_login_username']")
		WebElement Emailusername;
		
		@FindBy(xpath ="//input[@name='dwfrm_login_password']")
		WebElement userpassword;
		
		@FindBy (xpath ="//button[@name='dwfrm_login_login']")
		WebElement Submitbutton;
		@FindBy(xpath ="//button[@name='dwfrm_login_register']")
	WebElement Createaccountfornewuser;
		@FindBy(xpath="//div[@id='ltkpopup-close-button']")
		WebElement dalagbox;
		//initalizating the objects
		public Loginpagee() {
			
			PageFactory.initElements(driver,this);
			
		}
		
		//actions 
		public String  validateloginpagetitle() {
			return driver.getTitle();
		}
		
		public void clickonaccount() throws InterruptedException {
			
			dalagbox.click();
			
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn account-btn']")));
			Accountbutton.click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dropdown-menu']/div/a[contains(text(),'Sign In')]")));
	
			Signupdropdown.click();
			
			Createaccountfornewuser.click();
				
		}
		
		public Homepage login(String un, String pwd) {
			
			Emailusername.sendKeys(un);
			userpassword.sendKeys(pwd);
			Submitbutton.click();
			return new Homepage();
			
			
		}
		
			
			
		
}

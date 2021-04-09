package com.lumens.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumes.qa.base.Testbase;

public class AccountCreationpage extends Testbase {
	
	

	
	@FindBy(id="dwfrm_profile_customer_firstname")
	WebElement firstname;
	@FindBy(id="dwfrm_profile_customer_lastname")
	WebElement lastname;
	@FindBy(id="dwfrm_profile_customer_email")
	WebElement email;
	@FindBy(id="dwfrm_profile_customer_emailconfirm")
	WebElement emailconfirm;
	@FindBy(id="dwfrm_profile_login_password")
	WebElement emailpassword;
	@FindBy(id="dwfrm_profile_login_passwordconfirm")
	WebElement passwordconfirm;
	@FindBy(name ="dwfrm_profile_login_passwordconfirm")
	WebElement accountcreated;
	
	public AccountCreationpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void registration(String un,String pwd,String Email,String confirmemail,String epassword,String confirmpassword) {
		
		firstname.sendKeys(un);
		lastname.sendKeys(pwd);
		email.sendKeys(Email);
		emailconfirm.sendKeys(confirmemail);
		emailpassword.sendKeys(epassword);
		passwordconfirm.sendKeys(confirmpassword);
		
		accountcreated.click();
	}
	
}

package com.lumens.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lumens.pages.AccountCreationpage;
import com.lumens.pages.Loginpagee;
import com.lumes.qa.base.Testbase;

public class Signuptest extends Testbase {
	
	Loginpagee logipage;
	
	AccountCreationpage accpage;
	
	public Signuptest() {
		
	}
	
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		initailzation();
		logipage=new Loginpagee();
		
		accpage =new AccountCreationpage();
		
	}
	@Test
	public void Registration() throws InterruptedException {
		
		logipage.clickonaccount();
		
		accpage.registration(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"), prop.getProperty("emailconfirm"), prop.getProperty("password"), prop.getProperty("confirmpassword"));
		
	}

}

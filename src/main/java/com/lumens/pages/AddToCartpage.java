/**
 * 
 */
package com.lumens.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lumens.Action.Action;
import com.lumes.qa.base.Testbase;

/**
 * @author archana
 *
 */
public class AddToCartpage extends Testbase {
	
	
	
	@FindBy(xpath="//*[@id=\"add-to-cart\"]")
	WebElement Addtocart;
	
	@FindBy(xpath="//div/a[@title='View Cart'][contains(text(),'CHECKOUT')]")
	WebElement checkout;
	@FindBy(xpath="//a[@id='mcBookMark']/span[contains(text(),'Cart')]")
	WebElement cartbasket;
	
	@FindBy(xpath="//a[@title='View Cart'][contains(text(),'VIEW CART')]")
	WebElement viewcart;

	 public void clickoncart() {
		
		Action.scrollByVisibilityOfEelement(driver, Addtocart);
		Addtocart.click();
		checkout.click();
	}
	 
	 public void cartdetails() {
		 
		 
	 }

}

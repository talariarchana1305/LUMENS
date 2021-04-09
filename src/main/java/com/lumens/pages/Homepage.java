package com.lumens.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.lumens.Action.Action;
import com.lumes.qa.base.Testbase;

public class Homepage extends Testbase {
	
	
	@FindBy(xpath="//span[@class='menu-link'][contains(text(),'lighting')]")
	
	WebElement actionligtning;
	
	@FindBy(xpath="//a[@itemprop='significantLink'][contains(text(),'Ceiling Lights')]")
	WebElement celinglight;
	
	@FindBy(xpath="//a/span[contains(text(),'Chandeliers')]")
	WebElement chandeliers;
	
	@FindBy(xpath="//div[@class='subcat-image']/a[@title='Chandeliers Large Chandeliers']/img")
	WebElement largechandeliers;
	
	@FindBy(xpath="//div/ul/li/a[@title='Click to Refine By 1 business day']/span/input")
	WebElement Readytoship;
	
	@FindBy(xpath="//div/ul/li/a[@title='Click to Refine By Transitional']/span/input")
	WebElement transitional;
	
	@FindBy(xpath="//div/a/img[@title='Clairpointe 2 Tier Chandelier - OPEN BOX RETURN']")
	WebElement hoseclairpointe;
	
	
	
	public Homepage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public  void selectproduct() {
		Action.click(driver, actionligtning);
		
		celinglight.click();
		
		
		
		
		}
	
	public void shoptheitem() throws Throwable {
	
		Thread.sleep(2000);
		chandeliers.click();
		largechandeliers.click();
		}
	public void filters() {
		
		Readytoship.click();
		transitional.click();
		hoseclairpointe.click();
		
		
		
		
		
	}
	
	

}

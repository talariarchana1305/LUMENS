/**
 * 
 */
package com.lumens.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.lumes.qa.base.Testbase;

/**
 * @author archana
 *
 */
public class Action  extends Testbase{
	
	public static void scrollByVisibilityOfEelement(WebDriver driver, WebElement ele) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	
	public static void click(WebDriver ldriver,WebElement locatorName) {
		
		Actions action =new Actions (ldriver);
		action.moveToElement(locatorName).click().build().perform();
		
	}
	
	
}

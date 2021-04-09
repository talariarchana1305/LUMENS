package com.lumes.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Testbase {
	
	public static WebDriver driver;
	 public static Properties prop;
	 
	 public  static  WebDriverWait wait;
	
	
	
	public Testbase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\archana\\eclipse-workspace\\Lumens\\src\\main\\java\\com\\lumens\\"
					+ "qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
	public static void initailzation() throws InterruptedException {
		 String browsername =prop.getProperty("browser");
		 if(browsername.equals("chrome")){
			String chromepath = "C:\\Users\\archana\\browser\\chromedriver_win32 (4)\\ChromeDriver.exe";
		        System.setProperty("webdriver.chrome.driver", chromepath);
			
		       driver= new ChromeDriver();
		        }
		 else if (browsername.equals("firefox")) {
			 
			
			 
		 }
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 //driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 
		 
		 driver.get(prop.getProperty("url"));
		 
		 
		
		 
		 
		
	}

}

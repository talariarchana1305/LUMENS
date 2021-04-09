package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webtabledemo  extends webtablebase{
	
	
	public void getTableHeasders() {
		
		
		System.out.println("=========get table headers=====");
		
		List<WebElement> allheadersoftable=driver.findElements(By.xpath(""+xpathstring+"/thead/tr/th"));
		 int totalheader=allheadersoftable.size();
		 System.out.println("headers in table are below");
		 System.out.println("rotal header found :"+totalheader);
		 
		 for(WebElement ele:allheadersoftable)
		 {
			 System.out.println(ele.getText());
		 }
		
		
	}
	
	public void countRowsandColumns() {
		
		  List<WebElement> c=driver.findElements(By.xpath(""+xpathstring+"/thead/tr/th"));
		   System.out.println(c.size());
		   
		   List<WebElement> r=driver.findElements(By.xpath(""+xpathstring+"//tbody/tr"));
		   System.out.println(r.size());
		
				
	}
	
	

}

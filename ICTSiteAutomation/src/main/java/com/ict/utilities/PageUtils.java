package com.ict.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtils {
	
	public static void ButtonClick(WebElement ele)
	{
		ele.click();
	}
	
	public static void sendInput(WebElement ele,String input)
	{
		ele.clear();
		ele.sendKeys(input);
	}
	 public static void OverElement(WebDriver driver,WebElement ele)
	    {
	    	Actions action=new Actions(driver);
	    	action.moveToElement(ele).build().perform();
	    }
	 
	 public static void selectContent(WebElement ele)
	 {
		 Select select=new Select(ele);
		 select.selectByIndex(1);
	 }
	
	
	 
	
	 
	
	 
	 
	 
	

}

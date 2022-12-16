package com.ict.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginVerification {
	
WebDriver driver;
	
	public LoginVerification(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@id='lblName']")
	private WebElement link;
	
	public String loginVerification() throws InterruptedException
	{
		Thread.sleep(3000);
		String text=link.getText();
		return text;
	}
	

}

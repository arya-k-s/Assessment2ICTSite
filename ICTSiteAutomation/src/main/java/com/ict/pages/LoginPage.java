package com.ict.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ict.utilities.PageUtils;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnSubmit")
	private WebElement btn;
	
	public void getUsername(String args)
	{
		PageUtils.sendInput(username, args);
	}
	
	public void getPassword(String args)
	{
		PageUtils.sendInput(password, args);
	}
	
	public void setClick() {
		PageUtils.ButtonClick(btn);
	}

}

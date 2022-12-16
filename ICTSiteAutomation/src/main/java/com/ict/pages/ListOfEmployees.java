package com.ict.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ict.utilities.ExcelUtilities;
import com.ict.utilities.PageUtils;

public class ListOfEmployees {
	
WebDriver driver;
	
	public ListOfEmployees(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//a[text()='Employee']")
	private WebElement clickemployee;
	
	@FindBy(xpath="//a[contains(text(),'List Employee')]")
	private WebElement listclick;
	
	@FindBy(xpath="(//td[contains(text(),'Arya ks')]//parent::tr//following-sibling::a)[1]")
	private WebElement edit;
	
	@FindBy(xpath="(//td[contains(text(),'Arya ks')]//parent::tr//following-sibling::a)[2]")
	private WebElement delete;
	
	@FindBy(xpath="//a[contains(text(),'5')]")
	private WebElement page5;
	
	@FindBy(id="ContentPlaceHolder1_txtEmployeeId")
	private WebElement empid;
	
	@FindBy(id="ContentPlaceHolder1_btnSubmit")
	private WebElement update;
	
	@FindBy(id="Reset")
	private WebElement reset;

	public void addEmployee() throws InterruptedException
	{
	
		PageUtils.OverElement(driver, clickemployee);
	}
	
	public void clickListEmployee() 
	{
		PageUtils.OverElement(driver,listclick);
		PageUtils.ButtonClick(listclick);
	}
	
	public void pageClick()
	{
		PageUtils.ButtonClick(page5);
	}
	
	public void clickEdit() throws InterruptedException
	{
		Thread.sleep(1000);
		PageUtils.ButtonClick(edit);
	}
	
	public void editEmpid(String args)
	{
		PageUtils.sendInput(empid, args);
	}
	
	public void clickupdate() throws Exception
	{
		String value=ExcelUtilities.readDetails(11, 0).getStringCellValue();
		if(value.equals("update"))
		{
			Thread.sleep(1000);
			PageUtils.ButtonClick(update);
		}
		else if(value.equals("reset"))
		{
			Thread.sleep(1000);
			PageUtils.ButtonClick(reset);
		}

	}
	
	public void clickdelete() throws InterruptedException
	{
	
		PageUtils.ButtonClick(delete);
	}
	

	

}

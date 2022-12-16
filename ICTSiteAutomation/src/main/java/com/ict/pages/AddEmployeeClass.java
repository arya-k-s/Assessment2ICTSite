package com.ict.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ict.utilities.ExcelUtilities;
import com.ict.utilities.PageUtils;

public class AddEmployeeClass {
	
WebDriver driver;
	
	public AddEmployeeClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Employee']")
	private WebElement clickemployee;
	
	@FindBy(xpath="//a[contains(text(),'Add Employee')]")
	private WebElement addemployee;
	
	@FindBy(id="ContentPlaceHolder1_txtName")
	private WebElement name;
	
	@FindBy(id="ContentPlaceHolder1_txtPassword")
	private WebElement password;
	
	@FindBy(id="ContentPlaceHolder1_txtEmail")
	private WebElement email;
	
	@FindBy(id="ContentPlaceHolder1_drpDesignation")
	private WebElement designation;
	
	@FindBy(id="ContentPlaceHolder1_drpReportingTo")
	private WebElement reporting;
	
	@FindBy(id="ContentPlaceHolder1_drpGroup")
	private WebElement member;
	
	@FindBy(id="ContentPlaceHolder1_txtEmployeeId")
	private WebElement empid;
	
	@FindBy(id="ContentPlaceHolder1_txtConfirmPassword")
	private WebElement confirmpassword;
	
	@FindBy(id="ContentPlaceHolder1_txtMobileNumber")
	private WebElement phone;
	
	@FindBy(id="ContentPlaceHolder1_drpEmployeeType")
	private WebElement  emptype;
	
	@FindBy(id="ContentPlaceHolder1_ChkReportingStaff")
	private WebElement check;
	
	@FindBy(id="ContentPlaceHolder1_txtAddress")
	private WebElement address;
	
	@FindBy(id="ContentPlaceHolder1_btnSubmit")
	private WebElement submit;
	
	@FindBy(id="Reset")
	private WebElement edit;
	
	
	
	public void addEmployee() throws InterruptedException
	{
		//Thread.sleep(2000);
		PageUtils.OverElement(driver, clickemployee);
		//PageUtils.ButtonClick(add);
	}
	
	public void clickAddEmployee() 
	{
		PageUtils.OverElement(driver, addemployee);
		PageUtils.ButtonClick(addemployee);
	}
	
	public void sendName(String args)
	{
		PageUtils.sendInput(name,args);
	}

	public void sendPassword(String args)
	{
		PageUtils.sendInput(password,args);
	}
	
	public void sendEmail(String args)
	{
		PageUtils.sendInput(email,args);
	}
	
	public void sendDesignation()
	{
		PageUtils.selectContent(designation);
	}
	
	public void sendReporting()
	{
		PageUtils.selectContent(reporting);
	}
	
	public void sendMember()
	{
		PageUtils.selectContent(member);
	}
	
	public void sendEmpid(String args)
	{
		PageUtils.sendInput(empid, args);
	}
	
	public void sendConfirmpassword(String args)
	{
		PageUtils.sendInput(confirmpassword, args);
	}
	public void sendPhone(String args)
	{
		PageUtils.sendInput(phone, args);
	}
	
	public void sendEmptype()
	{
		PageUtils.selectContent(emptype);
	}
	
	public void clickCheck()
	{
		PageUtils.ButtonClick(check);
	}
	
	public void sendAddress(String args)
	{
		PageUtils.sendInput(address, args);
	}
	
	public void click() throws Exception
	{
		String value=ExcelUtilities.readDetails(9, 0).getStringCellValue();
		if(value.equals("Reset"))
		{
			Thread.sleep(1000);
			PageUtils.ButtonClick(edit);
		}
		else if(value.equals("Save"))
		{
			Thread.sleep(1000);
			PageUtils.ButtonClick(submit);
		}
	}
}

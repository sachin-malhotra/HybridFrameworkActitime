package com.actitime.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.actitime.common_library.SuperTestScript;

public class AddNewUserPage extends SuperPage
{
	@FindBy(name="username")
	private WebElement usernameTextBox;
	@FindBy(name="passwordText")
	private WebElement passwordTextBox;
	@FindBy(name="passwordTextRetype")
	private WebElement retypePasswordTextBox;
	@FindBy(name="firstName")
	private WebElement firstNameTextBox;
	@FindBy(name="lastName")
	private WebElement lastNameTextBox;
	@FindBy(name="middleName")
	private WebElement middleInitialTextBox;
	@FindBy(name="email")
	private WebElement emailAddressTextBox;
	@FindBy(name="phone")
	private WebElement phoneTextBox;
	@FindBy(name="fax")
	private WebElement faxTextBox;
	@FindBy(name="mobile")
	private WebElement mobileTextBox;
	@FindBy(name="otherContact")
	private WebElement otherContactTextBox;
	@FindBy(id="overtimeTracking_Enable")
	private WebElement enableOvertimeTrackingRadioButton;
	@FindBys(@FindBy(xpath="//input[@type='checkbox']"))
	private List<WebElement> allCheckBoxes;	
	@FindBy(css="input[value='   Create User   ']")
	private WebElement createUserButton;
	
	public AddNewUserPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void enterUsername(String un)
	{
		usernameTextBox.sendKeys(un);
	}
	public void enterPassword(String pwd)
	{
		passwordTextBox.sendKeys(pwd);
	}
	public void reEnterPassword(String repwd)
	{
		retypePasswordTextBox.sendKeys(repwd);
	}
	public void enterFirstName(String fn)
	{
		firstNameTextBox.sendKeys(fn);
	}
	public void enterLastName(String ln)
	{
		lastNameTextBox.sendKeys(ln);
	}
	public void enterMiddleInitial(String mi)
	{
		middleInitialTextBox.sendKeys(mi);
	}
	public void enterEmailAddress(String ema)
	{
		emailAddressTextBox.sendKeys(ema);
	}
	public void enterPhone(String ph)
	{
		phoneTextBox.sendKeys(ph);
	}
	public void enterFax(String fx)
	{
		faxTextBox.sendKeys(fx);
	}
	public void enterMobile(String mob)
	{
		mobileTextBox.sendKeys(mob);
	}
	public void enterOtherContact(String oc)
	{
		otherContactTextBox.sendKeys(oc);
	}
	public void clickOnEnableOvertimeTrackingRadioButton()
	{
		enableOvertimeTrackingRadioButton.click();
	}
	public void clickOnAllCheckBoxes()
	{
		for(int i=0; i<=allCheckBoxes.size()-1; i++)
		{
			allCheckBoxes.get(i).click();
		}
	}
	public void checkCheckBoxIsClickedOrNot()
	{
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("The check box selection state is "+checkBox.isSelected());
	}
	public void clickCreateUserButton()
	{
		createUserButton.click();
	}
}

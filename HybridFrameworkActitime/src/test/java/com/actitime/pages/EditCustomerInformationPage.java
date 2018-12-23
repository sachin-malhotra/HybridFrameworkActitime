package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.common_library.SuperTestScript;

public class EditCustomerInformationPage extends SuperPage
{
	@FindBy(name="name")
	private WebElement customerNameTextbox;
	@FindBy(name="saveChanges")
	private WebElement saveChangesButton;
	@FindBy(xpath="//input[@value='Delete This Customer']")
	private WebElement deleteThisCustomerButton;
	
	public EditCustomerInformationPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void enterCustomerName(String cn)
	{
		customerNameTextbox.sendKeys(cn);
	}
	public void clickOnSaveChangesButton()
	{
		saveChangesButton.click();
	}
	public void clearCustomerName()
	{
		customerNameTextbox.clear();
	}
	public void clickOnDeleteThisCustomerButton()
	{
		deleteThisCustomerButton.click();
	}
}

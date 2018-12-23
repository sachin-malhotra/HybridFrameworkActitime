package com.actitime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.common_library.SuperTestScript;

public class ActiveProjectsAndCustomersPage extends SuperPage
{
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjectButton;
	@FindBy(xpath="//input[@value='Archive Selected Customers & Projects']")
	private WebElement archiveSelectedCustomersandProjectsButton;
	
	public ActiveProjectsAndCustomersPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void clickAddNewCustomerButton()
	{
		addNewCustomerButton.click();
	}
	public void clickAddNewProjectButton()
	{
		addNewProjectButton.click();
	}
	public void clickOnExistingCustomer(String custName)
	{
		SuperTestScript.driver.findElement(By.linkText(custName)).click();
	}
	public void clickOnArchiveSelectedCustomersandProjectsButton()
	{
		archiveSelectedCustomersandProjectsButton.click();
	}
}

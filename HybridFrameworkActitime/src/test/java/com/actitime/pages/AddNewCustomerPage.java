package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.common_library.SuperTestScript;

public class AddNewCustomerPage extends SuperPage
{
	@FindBy(name="name")
	private WebElement customerNameTextBox;
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	@FindBy(linkText="Open Tasks")
	private WebElement openTasksButton;
	@FindBy(id="ConfirmWarning")
	private WebElement warningMessege;
	@FindBy(id="ConfirmQuest")
	private WebElement confirmationMessege;
	@FindBy(id="DiscardChangesButton")
	private WebElement cancelCustomerCreationandProceedButton;
	@FindBy(id="RemainOnThePageButton")
	private WebElement remainOnThePageButton;
	
	public AddNewCustomerPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void enterCustomerName(String cn)
	{
		customerNameTextBox.sendKeys(cn);
	}
	public void clickCreateCustomerButton()
	{
		createCustomerButton.click();
	}
	public void clickOnOpenTasksButton()
	{
		openTasksButton.click();
	}
	public String fetchWarningMessege()
	{
		String actMsg = warningMessege.getText();
		return actMsg;
	}
	public String fetchConfirmationMessege()
	{
		String actMsg = confirmationMessege.getText();
		return actMsg;
	}
	public String fetchCancelButtonTet()
	{
		String actMsg = cancelCustomerCreationandProceedButton.getAttribute("value");
		return actMsg;
	}
	public String fetchRemainOnThePageButtonText()
	{
		String actMsg = remainOnThePageButton.getAttribute("value");
		return actMsg;
	}
}

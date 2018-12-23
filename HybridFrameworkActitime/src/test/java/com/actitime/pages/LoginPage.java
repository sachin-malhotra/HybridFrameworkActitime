package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.common_library.SuperTestScript;

public class LoginPage 
{
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameTextBox;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(className="errormsg")
	private WebElement errormsg;
	
	public LoginPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void enterUserName(String un)
	{
		userNameTextBox.sendKeys(un);
	}
	public void enterPassword(String pwd)
	{
		passwordTextBox.sendKeys(pwd);
	}
	public void submitCredentialsWithUsernameTextField()
	{
		userNameTextBox.submit();
	}
	public void submitCredentialsWithPasswordTextField()
	{
		passwordTextBox.submit();
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	public String fetchErrorMsg()
	{
		String actErr = errormsg.getText();
		return actErr;
	}
}























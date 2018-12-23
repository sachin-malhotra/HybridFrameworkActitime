package com.actitime.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.common_library.SuperTestScript;

public class SuperPage extends SuperTestScript
{
	@FindBy(className="successmsg")
	private WebElement sucessMessege;
	@FindBy(className="logoutImg")
	private WebElement logoutButton;

	public SuperPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public String fetchSucessMessege()
	{
		String actMsg = sucessMessege.getText();
		return actMsg;
	}
	public void clickLogout()
	{
		logoutButton.click();
	}
	public void clickOnAlertOkButton()
	{
		Alert a1 = SuperTestScript.driver.switchTo().alert();
		a1.accept();
	}
	public void clickOnAlertCancelButton()
	{
		Alert a1 = SuperTestScript.driver.switchTo().alert();
		a1.dismiss();
	}
	public String fetchAlertMsg()
	{
		Alert a1 = SuperTestScript.driver.switchTo().alert();
		String textOnAlert = a1.getText();
		return textOnAlert;
	}

}

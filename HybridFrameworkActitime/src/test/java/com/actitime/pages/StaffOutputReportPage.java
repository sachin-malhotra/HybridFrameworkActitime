package com.actitime.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.common_library.SuperTestScript;

public class StaffOutputReportPage extends SuperPage
{
	@FindBy(xpath="//img[@alt='Click Here to Pick up the date']")
	private WebElement fromCalenderButton;
	@FindBy(xpath="//span[text()='30']")
	private WebElement dateButton;
	
	public StaffOutputReportPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	
	public void clickOnFromCalenderIcon()
	{
		fromCalenderButton.click();
	}
	public void clickOnDateFromCalenderWindow()
	{
		Set<String> allAddress = SuperTestScript.driver.getWindowHandles();
		Iterator<String> itr = allAddress.iterator();
		String oldWinAdd = itr.next();
		String newWinAdd = itr.next();
		SuperTestScript.driver.switchTo().window(newWinAdd);
		dateButton.click();
		SuperTestScript.driver.switchTo().window(oldWinAdd);
	}
	
}

package com.actitime.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.common_library.SuperTestScript;

public class UserListPage extends SuperPage
{
	@FindBy(css="input[value='Add New User']")
	private WebElement addNewUserButton;
	@FindBy(css="img[width='14']")
	private WebElement tooltipCheckboxButton;
	@FindBys(@FindBy(css="img[width='14']"))
	private List<WebElement> allCheckBoxes;
	
	public UserListPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void clickAddNewUserButton()
	{
		addNewUserButton.click();
	}
	public String fetchToolltipMessage()
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(tooltipCheckboxButton).perform();
		String tooltipMessege = tooltipCheckboxButton.getText();
		return tooltipMessege;
	}
	public void clickOnAllCheckBoxesToUncheck() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(SuperTestScript.driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[width='14']")));
		for(int i=0; i<=allCheckBoxes.size()-1; i++)
		{
			allCheckBoxes.get(i).click();
		}
	}
	
	
}

package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.common_library.SuperTestScript;

public class ProjectsAndTasksPage extends SuperPage
{
	@FindBy(partialLinkText="Customers")
	private WebElement projectsAndCutomersButton;
	@FindBy(linkText="Users")
	private WebElement usersLink;
	@FindBy(xpath="//input[@value='Add New Tasks']")
	private WebElement addNewTasksButton;
	@FindBy(linkText="Reports")
	private WebElement reportsButton;
	@FindBy(className="deadline")
	private WebElement deadlinesNaButton;
	@FindBy(linkText="Customer")
	private WebElement customerLink;
	@FindBy(id="deadlinePopupText")
	private WebElement deadlinePopupTextBox;
	@FindBy(name="searchTasks")
	private WebElement showTasksButton;
	
	public ProjectsAndTasksPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public String retrieveShowTasksButtonColor()
	{
		String buttonColor = showTasksButton.getCssValue("background-color");
		return buttonColor;
	}
	public void moveCursorToReportsButtonAndClick()
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(projectsAndCutomersButton).perform();
		a1.doubleClick().perform();
	}
	public void dragCustomerLinkAndDropToDeadlinePopupText()
	{
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(customerLink, deadlinePopupTextBox).perform();
	}
	public void clearDeadLinePopupText()
	{
		deadlinePopupTextBox.clear();
	}
	public void clickOnDeadlinesNaButton()
	{
		deadlinesNaButton.click();
	}
	public void clickOnReportsButton()
	{
		reportsButton.click();
	}
	public void clickProjectsAndCutomersButton()
	{
		projectsAndCutomersButton.click();
	}
	public void clickOnUsersLink()
	{
		usersLink.click();
	}
	public void clickAddNewTasksButton()
	{
		addNewTasksButton.click();
	}
}

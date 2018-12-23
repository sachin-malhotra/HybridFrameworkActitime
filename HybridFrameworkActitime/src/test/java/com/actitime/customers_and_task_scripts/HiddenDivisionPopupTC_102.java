package com.actitime.customers_and_task_scripts;

import org.testng.annotations.Test;

import com.actitime.common_library.ExcelLibrary;
import com.actitime.common_library.SuperTestScript;
import com.actitime.common_library.ValidationLibrary;
import com.actitime.pages.ActiveProjectsAndCustomersPage;
import com.actitime.pages.AddNewCustomerPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndTasksPage;

public class HiddenDivisionPopupTC_102 extends SuperTestScript
{
	@Test(priority = 2)
	public void testHiddenDivisionPopupTC_102_01()
	{
		String un = ExcelLibrary.readData("TC_102", 1, 0);
		String pw = ExcelLibrary.readData("TC_102", 1, 1);
		String cn = ExcelLibrary.readData("TC_102", 1, 2);
		String expWarningMsg = ExcelLibrary.readData("TC_102", 1, 3);
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		ActiveProjectsAndCustomersPage apacp = new ActiveProjectsAndCustomersPage();
		AddNewCustomerPage ancp = new AddNewCustomerPage();
		
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickLoginButton();
		patp.clickProjectsAndCutomersButton();
		apacp.clickAddNewCustomerButton();
		ancp.enterCustomerName(cn);
		ancp.clickOnOpenTasksButton();
		String actWarningMsg = ancp.fetchWarningMessege();
		ExcelLibrary.writeData("TC_102", 1, 4, actWarningMsg);
		String status1 = ValidationLibrary.verifySucessMsg(expWarningMsg, actWarningMsg);  
		ExcelLibrary.writeData("TC_102", 1, 5, status1);
		
	}
	@Test(enabled = false)
	public void testHiddenDivisionPopupTC_102_02()
	{
		String un = ExcelLibrary.readData("TC_102", 1, 0);
		String pw = ExcelLibrary.readData("TC_102", 1, 1);
		String cn = ExcelLibrary.readData("TC_102", 1, 2);
		String expConfirmationMsg = ExcelLibrary.readData("TC_102", 1, 6);
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		ActiveProjectsAndCustomersPage apacp = new ActiveProjectsAndCustomersPage();
		AddNewCustomerPage ancp = new AddNewCustomerPage();
		
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickLoginButton();
		patp.clickProjectsAndCutomersButton();
		apacp.clickAddNewCustomerButton();
		ancp.enterCustomerName(cn);
		ancp.clickOnOpenTasksButton();
		String actConfirmationMsg = ancp.fetchConfirmationMessege();
		ExcelLibrary.writeData("TC_102", 1, 7, actConfirmationMsg);
		String status2 = ValidationLibrary.verifySucessMsg(expConfirmationMsg, actConfirmationMsg);
		ExcelLibrary.writeData("TC_102", 1, 8, status2);
	}
	@Test(priority = 0)
	public void testHiddenDivisionPopupTC_102_03()
	{
		String un = ExcelLibrary.readData("TC_102", 1, 0);
		String pw = ExcelLibrary.readData("TC_102", 1, 1);
		String cn = ExcelLibrary.readData("TC_102", 1, 2);
		String expCancelButtonMsg = ExcelLibrary.readData("TC_102", 1, 9);
		String expRemainButtonMsg = ExcelLibrary.readData("TC_102", 1, 12);
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		ActiveProjectsAndCustomersPage apacp = new ActiveProjectsAndCustomersPage();
		AddNewCustomerPage ancp = new AddNewCustomerPage();
		
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickLoginButton();
		patp.clickProjectsAndCutomersButton();
		apacp.clickAddNewCustomerButton();
		ancp.enterCustomerName(cn);
		ancp.clickOnOpenTasksButton();
		String actCancelButtonMsg = ancp.fetchCancelButtonTet();
		String actRemainButtonMsg = ancp.fetchRemainOnThePageButtonText();
		ExcelLibrary.writeData("TC_102", 1, 10, actCancelButtonMsg);
		ExcelLibrary.writeData("TC_102", 1, 13, actRemainButtonMsg);
		String status3 = ValidationLibrary.verifySucessMsg(expCancelButtonMsg, actCancelButtonMsg);
		String status4 = ValidationLibrary.verifySucessMsg(expRemainButtonMsg, actRemainButtonMsg);   
		ExcelLibrary.writeData("TC_102", 1, 11, status3);
		ExcelLibrary.writeData("TC_102", 1, 14, status4);
	}
}

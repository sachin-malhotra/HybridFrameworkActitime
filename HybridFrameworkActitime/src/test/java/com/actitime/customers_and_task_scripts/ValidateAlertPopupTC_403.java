package com.actitime.customers_and_task_scripts;

import org.testng.annotations.Test;

import com.actitime.common_library.ExcelLibrary;
import com.actitime.common_library.SuperTestScript;
import com.actitime.common_library.ValidationLibrary;
import com.actitime.pages.ActiveProjectsAndCustomersPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndTasksPage;

public class ValidateAlertPopupTC_403 extends SuperTestScript
{
	@Test
	public void testValidateAlertPopupTC_403()
	{
		String un = ExcelLibrary.readData("TC_403", 1, 0);
		String pw = ExcelLibrary.readData("TC_403", 1, 1);
		String expAlertMsg = ExcelLibrary.readData("TC_403", 1, 2);
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		ActiveProjectsAndCustomersPage apacp = new ActiveProjectsAndCustomersPage();
		
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickLoginButton();
		patp.clickProjectsAndCutomersButton();
		apacp.clickOnArchiveSelectedCustomersandProjectsButton();
		String actAlertMsg = apacp.fetchAlertMsg();
		apacp.clickOnAlertOkButton();
		apacp.clickLogout();
		
		ExcelLibrary.writeData("TC_403", 1, 3, actAlertMsg);
		
		String status = ValidationLibrary.verifySucessMsg(expAlertMsg, actAlertMsg);
		ExcelLibrary.writeData("TC_403", 1, 4, status);
	}
}

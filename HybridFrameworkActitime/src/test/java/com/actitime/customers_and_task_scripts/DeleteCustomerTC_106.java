package com.actitime.customers_and_task_scripts;

import org.testng.annotations.Test;

import com.actitime.common_library.ExcelLibrary;
import com.actitime.common_library.SuperTestScript;
import com.actitime.common_library.ValidationLibrary;
import com.actitime.pages.ActiveProjectsAndCustomersPage;
import com.actitime.pages.EditCustomerInformationPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndTasksPage;

public class DeleteCustomerTC_106 extends SuperTestScript
{
	@Test
	public void testDeleteCustomerTC_106()
	{
		String un = ExcelLibrary.readData("TC_106", 1, 0);
		String pw = ExcelLibrary.readData("TC_106", 1, 1);
		String clickCustName = ExcelLibrary.readData("TC_106", 1, 2);
		String expRes = ExcelLibrary.readData("TC_106", 1, 3);
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		ActiveProjectsAndCustomersPage apacp = new ActiveProjectsAndCustomersPage();
		EditCustomerInformationPage ecip = new EditCustomerInformationPage();
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickLoginButton();
		patp.clickProjectsAndCutomersButton();
		apacp.clickOnExistingCustomer(clickCustName);
		ecip.clickOnDeleteThisCustomerButton();
		patp.clickOnAlertOkButton();
		String actRes = apacp.fetchSucessMessege();
		apacp.clickLogout();
		ExcelLibrary.writeData("TC_106", 1, 4, actRes);
		String status = ValidationLibrary.verifySucessMsg(expRes, actRes);
		ExcelLibrary.writeData("TC_106", 1, 5, status);
	}
}

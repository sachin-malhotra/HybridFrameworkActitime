package com.actitime.customers_and_task_scripts;

import org.testng.annotations.Test;

import com.actitime.common_library.ExcelLibrary;
import com.actitime.common_library.SuperTestScript;
import com.actitime.common_library.ValidationLibrary;
import com.actitime.pages.ActiveProjectsAndCustomersPage;
import com.actitime.pages.EditCustomerInformationPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndTasksPage;

public class ModifyCustomerTC_105 extends SuperTestScript
{
	@Test
	public void testModifyCustomerTC_105()
	{
		String un = ExcelLibrary.readData("TC_105", 1, 0);
		String pw = ExcelLibrary.readData("TC_105", 1, 1);
		String cn = ExcelLibrary.readData("TC_105", 1, 2);
		String clickCustName = ExcelLibrary.readData("TC_105", 1, 3);
		String expRes = ExcelLibrary.readData("TC_105", 1, 4);
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		ActiveProjectsAndCustomersPage apacp = new ActiveProjectsAndCustomersPage();
		EditCustomerInformationPage ecip = new EditCustomerInformationPage();
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickLoginButton();
		patp.clickProjectsAndCutomersButton();
		apacp.clickOnExistingCustomer(clickCustName);
		ecip.clearCustomerName();
		ecip.enterCustomerName(cn);
		ecip.clickOnSaveChangesButton();
		String actRes = apacp.fetchSucessMessege();
		ExcelLibrary.writeData("TC_105", 1, 5, actRes);
		apacp.clickLogout();
		String status = ValidationLibrary.verifySucessMsg(expRes, actRes);
		ExcelLibrary.writeData("TC_105", 1, 6, status);
		
		
	}
}

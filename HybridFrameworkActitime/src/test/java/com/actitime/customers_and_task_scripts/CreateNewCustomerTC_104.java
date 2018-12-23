package com.actitime.customers_and_task_scripts;

import org.testng.annotations.Test;

import com.actitime.common_library.ExcelLibrary;
import com.actitime.common_library.SuperTestScript;
import com.actitime.common_library.ValidationLibrary;
import com.actitime.pages.ActiveProjectsAndCustomersPage;
import com.actitime.pages.AddNewCustomerPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndTasksPage;

public class CreateNewCustomerTC_104 extends SuperTestScript
{	@Test
	public  void testCreateNewCustomerTC_104()
	{
	
	String un = ExcelLibrary.readData("TC_104", 1, 0);
	String pw = ExcelLibrary.readData("TC_104", 1, 1);
	String cn = ExcelLibrary.readData("TC_104", 1, 2);
	String expres = ExcelLibrary.readData("TC_104", 1, 3);
	LoginPage lp = new LoginPage();
	ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
	ActiveProjectsAndCustomersPage apacp = new ActiveProjectsAndCustomersPage();
	AddNewCustomerPage ancp = new AddNewCustomerPage();
	lp.enterUserName(un);
	lp.enterPassword(pw);
	lp.clickLoginButton();
	patp.moveCursorToReportsButtonAndClick();
	apacp.clickAddNewCustomerButton();
	ancp.enterCustomerName(cn);
	ancp.clickCreateCustomerButton();
	String actRes = apacp.fetchSucessMessege();
	ExcelLibrary.writeData("TC_104", 1, 4,actRes);
	apacp.clickLogout();
	String status = ValidationLibrary.verifySucessMsg(expres, actRes);
	ExcelLibrary.writeData("TC_104", 1, 5, status);
	
	
	}
}

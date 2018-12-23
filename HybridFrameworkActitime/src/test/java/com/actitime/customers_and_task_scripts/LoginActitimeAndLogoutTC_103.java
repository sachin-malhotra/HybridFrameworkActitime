package com.actitime.customers_and_task_scripts;

import org.testng.annotations.Test;

import com.actitime.common_library.ExcelLibrary;
import com.actitime.common_library.SuperTestScript;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndTasksPage;

public class LoginActitimeAndLogoutTC_103 extends SuperTestScript
{
	@Test(invocationCount = 10)
	public void testLoginActitimeAndLogoutTC_103()
	{
		String un = ExcelLibrary.readData("TC_103", 1, 0);
		String pw = ExcelLibrary.readData("TC_103", 1, 1);
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		lp.enterUserName(un);
		lp.enterPassword(pw);
		lp.clickLoginButton();
		patp.clickLogout();
	}
}

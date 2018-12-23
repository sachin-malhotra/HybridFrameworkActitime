package com.actitime.reports_scripts;

import org.testng.annotations.Test;

import com.actitime.common_library.ExcelLibrary;
import com.actitime.common_library.SuperTestScript;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndTasksPage;
import com.actitime.pages.StaffOutputReportPage;

public class HandleCalenderWindowTC_109 extends SuperTestScript
{
	@Test
	public void testHandleCalenderWindowTC_109()
	{
		String un = ExcelLibrary.readData("TC_109", 1, 0);
		String pwd = ExcelLibrary.readData("TC_109", 1, 1);
		
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		StaffOutputReportPage sorp = new StaffOutputReportPage();
		
		lp.enterUserName(un);
		lp.enterPassword(pwd);
		lp.clickLoginButton();
		patp.clickOnReportsButton();
		sorp.clickOnFromCalenderIcon();
		sorp.clickOnDateFromCalenderWindow();
	
		sorp.clickLogout();
	}
}

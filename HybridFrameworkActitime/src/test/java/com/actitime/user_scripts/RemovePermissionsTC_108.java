package com.actitime.user_scripts;

import org.testng.annotations.Test;

import com.actitime.common_library.ExcelLibrary;
import com.actitime.common_library.SuperTestScript;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndTasksPage;
import com.actitime.pages.UserListPage;

public class RemovePermissionsTC_108 extends SuperTestScript
{
	@Test
	public void testRemovePermissionsTC_108()
	{
		String un = ExcelLibrary.readData("TC_108", 1, 0);
		String pwd = ExcelLibrary.readData("TC_108", 1, 1);
		
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		UserListPage ulp = new UserListPage();
		lp.enterUserName(un);
		lp.enterPassword(pwd);
		lp.clickLoginButton();
		patp.clickOnUsersLink();
		try 
		{
			ulp.clickOnAllCheckBoxesToUncheck();
		} 
		catch (InterruptedException e) 
		{
			
		}
		ulp.clickLogout();

	}
}

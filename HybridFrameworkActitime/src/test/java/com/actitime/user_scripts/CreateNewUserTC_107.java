package com.actitime.user_scripts;

import org.testng.annotations.Test;

import com.actitime.common_library.ExcelLibrary;
import com.actitime.common_library.SuperTestScript;
import com.actitime.common_library.ValidationLibrary;
import com.actitime.pages.AddNewUserPage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndTasksPage;
import com.actitime.pages.UserListPage;

public class CreateNewUserTC_107 extends SuperTestScript
{
	@Test
	public void testAddNewUserTC_107()
	{
		String un = ExcelLibrary.readData("TC_107", 1, 0);
		String pwd = ExcelLibrary.readData("TC_107", 1, 1);
		String newUsersName = ExcelLibrary.readData("TC_107", 1, 2);
		String newUsersPwd = ExcelLibrary.readData("TC_107", 1, 3);
		String reTypePwd = ExcelLibrary.readData("TC_107", 1, 4);
		String firstName = ExcelLibrary.readData("TC_107", 1, 5);
		String lastName = ExcelLibrary.readData("TC_107", 1, 6);
		String midInit = ExcelLibrary.readData("TC_107", 1, 7);
		String email = ExcelLibrary.readData("TC_107", 1, 8);
		String phone = ExcelLibrary.readData("TC_107", 1, 9);
		String fax = ExcelLibrary.readData("TC_107", 1, 10);
		String mobile = ExcelLibrary.readData("TC_107", 1, 11);
		String othersCont = ExcelLibrary.readData("TC_107", 1, 12);
		String expMsg = ExcelLibrary.readData("TC_107", 1, 12);

		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		UserListPage ulp = new UserListPage();
		AddNewUserPage anup = new AddNewUserPage();
		
		lp.enterUserName(un);
		lp.enterPassword(pwd);
		lp.clickLoginButton();
		patp.clickOnUsersLink();
		ulp.clickAddNewUserButton();
		anup.enterUsername(newUsersName);
		anup.enterPassword(newUsersPwd);
		anup.reEnterPassword(reTypePwd);
		anup.enterFirstName(firstName);
		anup.enterLastName(lastName);
		anup.enterMiddleInitial(midInit);
		anup.enterEmailAddress(email);
		anup.enterPhone(phone);
		anup.enterFax(fax);
		anup.enterMobile(mobile);
		anup.enterOtherContact(othersCont);
		anup.clickOnEnableOvertimeTrackingRadioButton();
		anup.clickOnAllCheckBoxes();
		anup.checkCheckBoxIsClickedOrNot();
		anup.clickCreateUserButton();
		String actMsg = ulp.fetchSucessMessege();
		ExcelLibrary.writeData("TC_107", 1, 13,actMsg);
		ulp.clickLogout();
		String status = ValidationLibrary.verifySucessMsg(expMsg, actMsg);
		ExcelLibrary.writeData("TC_107", 1, 14,status);

	}
}

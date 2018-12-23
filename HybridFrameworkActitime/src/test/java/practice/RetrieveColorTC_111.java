package practice;

import org.testng.annotations.Test;

import com.actitime.common_library.ExcelLibrary;
import com.actitime.common_library.SuperTestScript;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndTasksPage;

public class RetrieveColorTC_111 extends SuperTestScript
{
	@Test
	public void testRetrieveColourTC_111()
	{
		String un = ExcelLibrary.readData("TC_111", 1, 0);
		String pwd = ExcelLibrary.readData("TC_111", 1, 1);
		LoginPage lp = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		lp.enterUserName(un);
		lp.enterPassword(pwd);
		lp.submitCredentialsWithPasswordTextField();
		String color = patp.retrieveShowTasksButtonColor();
		System.out.println(color);
	}
}

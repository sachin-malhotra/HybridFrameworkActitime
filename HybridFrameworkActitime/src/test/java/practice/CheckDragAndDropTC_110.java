package practice;

import org.testng.annotations.Test;

import com.actitime.common_library.ExcelLibrary;
import com.actitime.common_library.SuperTestScript;
import com.actitime.pages.LoginPage;
import com.actitime.pages.ProjectsAndTasksPage;

public class CheckDragAndDropTC_110 extends SuperTestScript
{
	@Test
	public void testCheckDragAndDropTC_110()
	{
		String un = ExcelLibrary.readData("TC_110", 1, 0);
		String pwd = ExcelLibrary.readData("TC_110", 1, 1);
		LoginPage lp  = new LoginPage();
		ProjectsAndTasksPage patp = new ProjectsAndTasksPage();
		lp.enterUserName(un);
		lp.enterPassword(pwd);
		lp.clickLoginButton();
		patp.clickOnDeadlinesNaButton();
		patp.dragCustomerLinkAndDropToDeadlinePopupText();
		patp.clearDeadLinePopupText();
		patp.clickLogout();
	}
}

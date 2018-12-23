package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest 
{
	 WebDriver driver;
	 @Test(invocationCount = 2)
	 @Parameters("browser")
	 public void parameterizedTest(String browser)
	 {
		 if(browser.equals("firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
		 else if(browser.equals("chrome"))
		 {
			 driver = new ChromeDriver();
		 }
		 else if(browser.equals("ie"))
		 {
			 driver = new InternetExplorerDriver();
		 }
		 else if(browser.equals("edge"))
		 {
			 driver = new EdgeDriver();
		 }
		 driver.get("http://sunnyscomputer/login.do");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.quit();
	 } 
}
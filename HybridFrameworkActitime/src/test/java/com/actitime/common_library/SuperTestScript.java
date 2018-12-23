package com.actitime.common_library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(CustomListener.class)
public abstract class SuperTestScript 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void preConfig()
	{
		String browserType="FF";
		if(browserType.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/thirdPartyExe/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("GC"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/thirdPartyExe/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserType.equalsIgnoreCase("HUD"))
		{
			driver = new HtmlUnitDriver();
		}
		else if(browserType.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./src/test/resources/thirdPartyExe/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(browserType.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "./src/test/resources/thirdPartyExe/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		else if (browserType.equalsIgnoreCase("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "./src/test/resources/thirdPartyExe/operadriver.exe");
			driver = new OperaDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		driver.get("http://sunnyscomputer/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void postConfig()
	{
		driver.close();
	}
	
}

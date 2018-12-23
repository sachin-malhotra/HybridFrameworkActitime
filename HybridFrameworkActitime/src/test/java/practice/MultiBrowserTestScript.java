package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTestScript 
{

	public WebDriver driver;

  @Parameters("browser")

  @BeforeClass

  public void beforeTest(String browser) 
  {
	  if(browser.equalsIgnoreCase("firefox")) 
	  {
		  
		  driver = new FirefoxDriver();
	  }
	  else if(browser.equalsIgnoreCase("GC"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	  else if (browser.equalsIgnoreCase("ie")) 
	  {
	    driver = new InternetExplorerDriver();
	  } 
	  	driver.get("http://sunnyscomputer/login.do");
	  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

  @Test 
  public void testMultibrowsers() throws InterruptedException
  {

    driver.findElement(By.name("username")).sendKeys("admin");

    driver.findElement(By.name("pwd")).sendKeys("manager");

    driver.findElement(By.xpath("//input[@type='submit']")).click();

	}  

  @AfterClass public void afterTest() {

		driver.quit();

	}

}
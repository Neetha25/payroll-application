package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass
{
	public WebDriver driver;
  
	
	@BeforeSuite
   public void urlup()
  
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chrome\\chromedriver.exe"); 
	  driver=new ChromeDriver();   // create an object for WebDriver
	    
	    driver.get("https://www.qabible.in/payrollapp/site/login");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);

  }
  
@AfterSuite
public void exit()
{
	//driver.quit();
}

}
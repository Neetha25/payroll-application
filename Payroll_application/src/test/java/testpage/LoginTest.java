package testpage;

import org.testng.annotations.Test;

import pageobject.CompanyPage;
import pageobject.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass
{
  LoginPage l;//common initialization of object 
  CompanyPage c;
  
	@Test
  public void Login() throws InterruptedException
	
	{ 
		l=new LoginPage(driver);//instantiation
	    l.test();// goes to login page
	    
	    c=new CompanyPage(driver);
	    c.sample();
  }
}

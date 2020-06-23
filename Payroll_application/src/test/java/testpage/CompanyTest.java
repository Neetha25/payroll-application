package testpage;

import org.testng.annotations.Test;

import pageobject.CompanyPage;
import utilities.BaseClass;

public class CompanyTest extends BaseClass 
{

	CompanyPage c;
 
	@Test
  public void com()
  {
  c=new CompanyPage(driver);
  c.sample();
  }
}

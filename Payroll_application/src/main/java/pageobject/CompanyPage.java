package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage

{
	WebDriver driver;
	/*@CacheLookup
	@FindBy(xpath="//a[text()=\"Company\"]")
	WebElement company;*/
	@CacheLookup
	@FindBy(name="Company[company_name]")
	WebElement companyname;
	@CacheLookup
	@FindBy(name="Company[company_email]")
	WebElement companyemail;
	@CacheLookup
	@FindBy(name="Company[company_address]")
	WebElement companyaddress;
	@CacheLookup
	@FindBy(name="Company[started_at]")
	WebElement date;
	//@CacheLookup
	//@FindBy(xpath="//span[@class=\"cbx-icon\"]")
	//WebElement status;
	@CacheLookup
	@FindBy(xpath=("//button[@type=\"submit\"]"))
	WebElement save;
	
public void sample()
{
	WebElement company =driver.findElement(By.xpath("//a[text()=\"Company\"]"));
	company.click();
	//WebElement companyname =driver.findElement(By.name("Company[company_name]"));
	companyname.clear();
	companyname.sendKeys("JKCompany");
	//WebElement companyemail =driver.findElement(By.name("Company[company_email]"));
	companyemail.clear();
	companyemail.sendKeys("JKCompany@gamil.com");
	//WebElement companyaddress =driver.findElement(By.name("Company[company_address]"));
	companyaddress.clear();
	companyaddress.sendKeys("JKCompany@gamil.com");
	//WebElement date =driver.findElement(By.name("Company[started_at]")); 
    date.clear();
	date.sendKeys("22-05-2020");
	
	//WebElement status =driver.findElement(By.xpath("//span[@class=\"cbx-icon\"]"));
	//status.clear();
	//WebElement save =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	save.submit();
	
	
	}

public CompanyPage(WebDriver driver)//constructor
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
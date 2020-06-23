package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

WebDriver driver;
@CacheLookup
@FindBy(name="LoginForm[username]")
WebElement user;
@CacheLookup
@FindBy(name="LoginForm[password]")
WebElement password;
@CacheLookup
@FindBy(name="login-button")
WebElement sub;

public void test() throws InterruptedException
{
	//WebElement user=driver.findElement(By.name("LoginForm[username]"));
	user.sendKeys("carol");
	Thread.sleep(3000);
	//WebElement password =driver.findElement(By.name("LoginForm[password]"));
	password.sendKeys("1q2w3e4r");
	Thread.sleep(3000);
	//WebElement sub=driver.findElement(By.name("login-button"));
	sub.submit();
	
}
//pagefactory
public LoginPage(WebDriver driver)//constructor
{
	this.driver=driver;
	PageFactory.initElements(driver, this); // statement comp for Pagefactory
}

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="email")
	WebElement usernameField;

	@FindBy(name="password")
	WebElement passwordField;

	@FindBy(xpath="//div[@class='ui fluid large teal submit button']")
	WebElement loginButton;
	
	public void setUsername(String uesrname)
	{
		usernameField.sendKeys(uesrname);
	}
	
	public void setPassword(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	

	
}

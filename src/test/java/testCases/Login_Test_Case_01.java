package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObjects.LoginPage;

public class Login_Test_Case_01 extends BaseClass
{
	@Test
	public void login_page_test() throws Exception
	{
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setUsername(username);
		logger.info("Username entered");
		captureScreen(driver,"login_page_test");
		
		loginpage.setPassword(password);
		logger.info("Password entered");
		
		loginpage.clickOnLoginButton();
		logger.info("Clicked on the login button");
	}
}

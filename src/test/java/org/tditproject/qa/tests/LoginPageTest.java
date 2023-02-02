package org.tditproject.qa.tests;

import org.tditproject.qa.pages.HomePage;
import org.tditproject.qa.pages.LoginPage;
import org.tditproject.qa.testbase.TestBase;
import org.tditproject.qa.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{

		
	@Test
	public void verify_LoginPage_Tittle() {
		String actual =lp.getLoginPageTittle();
		Assert.assertEquals(actual, Constants.LOGIN_PAGE_TITTLE);
		
	}
	
	@Test
	public void verify_LoginPage_Header() {
		String actual =lp.getLoginPageHeader();
		Assert.assertEquals(actual, Constants.LOGIN_PAGE_HEADER);
		
	}
	
	@Test
	public void verify_Incorrect_Login() {
		lp.doLogin("admin", "admin");
 		boolean actual=lp.isAlertPresent();
		Assert.assertEquals(actual, true);
		
		String alertmsg = lp.getAlertMessage();
		Assert.assertEquals(alertmsg, Constants.INCORRECT_LOGIN_MESSAGE);
		
	}
	
	@Test
	public void verify_Correct_Login() {
		HomePage hp =lp.doLogin("sump1", "techfin@12");
		String actualmsg = hp.getWelcomeMessage();
	 	Assert.assertEquals(actualmsg, Constants.HOME_PAGE_CHECK);
	 	
	}
	
	@Test
	public void verify_Blank_Inputs() {
		LoginPage lp = new LoginPage (driver);
		lp.doLogin("", "");

		String actual =lp.getValidationMessage();
		Assert.assertEquals(actual, Constants.VALIDATION_MESSAGE);
	}
	

}

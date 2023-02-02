package org.tditproject.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tditproject.qa.utils.ElementUtils;

public class LoginPage extends Page{
		
	By username =  By.name("username");
	By password = By.name("password");
	By loginButton = By.name("login");
	By header = By.tagName("h1");
	By pageTittle = By.tagName("h2");
		
	
	WebDriver driver;
	ElementUtils elementUtils;
	
	
	public LoginPage(WebDriver driver){
		super(driver);
		this.driver=driver;
//		elementUtils = new ElementUtils(driver);
	}
	
	public HomePage doLogin(String user, String pass) {
		elementUtils.enterText(username, user);
		elementUtils.enterText(password, pass);
		elementUtils.click(loginButton);
		
//	 	driver.findElement(username).sendKeys(user);
//		driver.findElement(password).sendKeys(pass);
//		driver.findElement(loginButton).click();
		return new HomePage(driver);

	}
	
	public String getLoginPageHeader() {
//		return driver.findElement(header).getText();
		return elementUtils.getText(header);
	}
	
	public String getLoginPageTittle() {
		return driver.findElement(pageTittle).getText();
	}
	
	
	public boolean isAlertPresent() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
			}
		catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public String getAlertMessage() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
	
	public String getAlertMsg() {
		Alert alert = driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;
	}
	
	public String getValidationMessage() {
		return driver.findElement(username).getAttribute("validationMessage");
	}
	
}

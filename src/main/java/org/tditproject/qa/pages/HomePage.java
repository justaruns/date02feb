package org.tditproject.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tditproject.qa.utils.ElementUtils;

public class HomePage {
	
	By viewTrade = By.xpath("//a[text()='View Trade']");
	By buyTrade = By.xpath("//a[text()='Buy Trade']");
	By sellTrade = By.xpath("//a[text()='Sell Trade']");
	By addAccount = By.xpath("//a[text()='Add Account'");
	By updateAccount = By.xpath("//a[text()='Update Account']");
	By deleteAccount = By.xpath("//a[text()='Delete Account']");
	By updateSecurity = By.xpath("//a[text()='Update security']");
	By deleteSecurity = By.xpath("//a[text()='Delete security']");
	By logout = By.xpath("//a[text()='Logout']");
	By headerTitle = By.tagName("h2");
	By sidebarHeaders = By.xpath("//div[@class='sidenav']/center/h3");
	By sidebarLinks = By.xpath("//div[@class='sidenav']/a");
	
	
	WebDriver driver;
	ElementUtils elementUtils;
	
	public HomePage(WebDriver driver){
//		super(driver);
		this.driver=driver;
		elementUtils = new ElementUtils(driver);
	}
	
	public String getWelcomeMessage() {
		return elementUtils.waitForPresenceOfElementAndGetText(logout, 5);
////		boolean isPresent = elementUtils.waitForPresenceOfElement(logout, 5);
////		if(isPresent) {
////			return elementUtils.getText(logout);
////		}
////		else {
////			return"";
////		}
//		
////		WebDriverWait wait = new WebDriverWait(driver, 5);
////		try {
////		wait.until(ExpectedConditions.presenceOfElementLocated(logout));
////		return driver.findElement(logout).getText();
////		}
////		catch(Exception e) {
////			e.printStackTrace();
////			return "";
////			
////		}
	}
	public String getHomePageTitle() {
		return elementUtils.waitForPresenceOfElementAndGetText(headerTitle, 5);
////		WebDriverWait wait = new WebDriverWait(driver, 5);
////		try {
////		wait.until(ExpectedConditions.presenceOfElementLocated(headerTitle));
////		return driver.findElement(headerTitle).getText();
////		}
////		catch(Exception e) {
////			e.printStackTrace();
////			return "";
////		
////		}
	}
	
	public List<String> getSideBarHeaders() {
		return elementUtils.getAllElementsTexts(sidebarHeaders);
//		List<WebElement> list = driver.findElements(sidebarHeaders);
//		List <String> headerList = new ArrayList<String>();
//		for(WebElement e:list) {
//			headerList.add(e.getText());
//		}
//		return headerList;
		
	}
	
	public List<String> getSideBarHeaderLinks() {
		return elementUtils.getAllElementsTexts(sidebarLinks);
//		List<WebElement> list = driver.findElements(sidebarLinks);
//		List <String> sideLinksList = new ArrayList<String>();
//		for(WebElement e:list) {
//			sideLinksList.add(e.getText());
//		}
//		return sideLinksList;
	}
		
	public void isDisplayed() {
		System.out.println("no");
		System.out.println("no");
		
	
		
	}
}

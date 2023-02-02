package org.tditproject.qa.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
	WebDriver driver;

	
	public ElementUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterText(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	
	}
	
	public String getText(By locator) {
		String text =driver.findElement(locator).getText();
		return text;
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public List<WebElement> getAllElementsLocatedBy(By locator){
		List<WebElement> list = driver.findElements(locator);
		return list;
		
	}
	public boolean waitForAlert(int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public List<String> getAllElementsTexts (By locator){
		List<WebElement> list = this.getAllElementsLocatedBy(locator);
		List <String> textList = new ArrayList<String>();
		for(WebElement e:list) {
			textList.add(this.getText(e));
		}
		return textList;
		
	}
	
	public boolean waitForPresenceOfElement(By locator, int time) {
		boolean flag=false;
		WebDriverWait wait = new WebDriverWait(driver, time);
		try {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		flag=true;
		return flag;
		}
		catch(Exception e) {
			e.printStackTrace();
			return flag;
		}
		
	}
	
	public String waitForPresenceOfElementAndGetText(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		try {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return this.getText(locator);
		}
		catch(Exception e) {
			e.printStackTrace();
			return "";
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

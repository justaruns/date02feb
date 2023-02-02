package org.tditproject.qa.testbase;


import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.tditproject.qa.driverfactory.Driverfactory;
import org.tditproject.qa.pages.LoginPage;
import org.tditproject.qa.utils.PropConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {
	protected WebDriver driver;
	protected LoginPage lp;
	Driverfactory df;
	PropConfig propConfig;
	Properties prop;
	 
	@BeforeMethod
	public void beforeMathod() {
		propConfig =PropConfig.getInstance();
		try {
			prop = propConfig.load_prop("QA");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		df= new Driverfactory();
		driver = df.init_driver(prop.getProperty("browser"));
		
		driver.get(prop.getProperty("app_url"));
		lp = new LoginPage (driver);
		
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}

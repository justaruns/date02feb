package org.tditproject.qa.tests;

import java.util.List;

import org.tditproject.qa.pages.HomePage;
import org.tditproject.qa.testbase.TestBase;
import org.tditproject.qa.utils.Constants;
import org.tditproject.qa.utils.util;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends TestBase{

	
	@Test
	public void verify_Sidebar_Headers() {
		HomePage hp =lp.doLogin("sump1", "techfin@12");
		List <String> actualList = hp.getSideBarHeaders();
		
//		Assert.assertEquals(actualList, Constants.EXPECTED_SIDE_BAR_HEADER_HOME_PAGE); //this is for only getting the numbers of elements
		List <String> expectedList = Constants.EXPECTED_SIDE_BAR_HEADER_HOME_PAGE;
		SoftAssert softAssert = util.compareList(actualList, expectedList);
		softAssert.assertAll();
		
	}
	
	@Test
	public void verify_Sidebar_Header_Links() {
		HomePage hp =lp.doLogin("sump1", "techfin@12");
		List <String> actualList = hp.getSideBarHeaderLinks();
		
		List <String> expectedList = Constants.EXPECTED_SIDE_BAR_HEADER_LINKS_HOME_PAGE;
		SoftAssert softAssert = util.compareList(actualList, expectedList);
		softAssert.assertAll();
		
	}
	
	
	
}

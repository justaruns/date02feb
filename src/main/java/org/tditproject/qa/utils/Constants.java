package org.tditproject.qa.utils;

import java.util.Arrays;
import java.util.List;

public class Constants {
	
	public static final String LOGIN_PAGE_HEADER="TDIT Solutions";
	public static final String LOGIN_PAGE_TITTLE="User Login";
	public static final String VALIDATION_MESSAGE="Please fill out this field.";
	public static final String INCORRECT_LOGIN_MESSAGE ="No such User exists. Invalid Credentials";
	public static final String HOME_PAGE_CHECK="Logout";	
	public static final String HOME_PAGE_HEADER_TITLE="TDIT Solutions";
	public static final List <String>  EXPECTED_SIDE_BAR_HEADER_HOME_PAGE = Arrays.asList(new String[] {"Trade","Account","Security"});
	public static final List <String>  EXPECTED_SIDE_BAR_HEADER_LINKS_HOME_PAGE = Arrays.asList(new String[] {"View Trade","Buy Trade","Sell Trade","Add Account","Update Account","Delete Account","Add Security","Update security","Delete security"});
	
}

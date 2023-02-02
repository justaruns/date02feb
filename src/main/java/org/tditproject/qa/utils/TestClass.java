package org.tditproject.qa.utils;

import java.io.IOException;
import java.util.Properties;

public class TestClass {
	public static void main(String[] args) throws IOException {
	
	PropConfig propConfig = PropConfig.getInstance();
	Properties prop = propConfig.load_prop("QA");
	System.out.println(prop.get("app_url"));
	System.out.println(prop.get("username"));
	
	
	}
}
 
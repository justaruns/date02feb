package org.tditproject.qa.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropConfig {
	private static PropConfig propConfig;
	Properties prop;
	
	
	private PropConfig() {
		
	}

	public static PropConfig getInstance() {
		if(propConfig==null) {
			propConfig = new PropConfig();
			return propConfig;
		}   
		else {
			return propConfig;
		}
	}
	
	public static Properties load_prop(String env) throws IOException {
		String filePath ="";
		if(env.equals("QA")) {
		
		System.out.println(System.getProperty("user.dir"));
		String basePath = System.getProperty("user.dir");
		filePath = basePath+"\\src\\main\\resources\\config\\qa_config.properties";
		//C:\Users\HP\eclipse-workspace\TDITProject\src\main\resources\config\qa_config.properties
		}
				
		else if(env.equals("UAT")) {
		System.out.println(System.getProperty("user.dir"));
		String basePath = System.getProperty("user.dir");
		filePath = basePath+"\\src\\main\\resources\\config\\uat_config.properties";
		}
		
		FileReader file = new FileReader(new File(filePath));
		Properties prop = new Properties();
		prop.load(file);
		return prop;
	
	}
}


 





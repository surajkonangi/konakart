package com.atmecs.atmecswebsite.constants;

import java.io.File;

public class ConstantPaths {

	public final static String USER_HOME = System.getProperty("user.dir") + File.separator;


	public final static String LOCATORS_FILE1 = USER_HOME + "resources" + File.separator+"locators" + File.separator + "homepagelocators.properties";
	
	public final static String LOCATORS_FILE2 = USER_HOME + "resources" + File.separator+"locators" + File.separator + "footerlocators.properties";
	
	public final static String LOCATORS_FILE3 = USER_HOME + "resources" + File.separator+"locators" + File.separator + "homemenulocators.properties";
	
	public final static String LOCATORS_FILE4 = USER_HOME + "resources" + File.separator+"locators" + File.separator + "blogelementslocators.properties";
	

	public final static String CONFIG_FILE = USER_HOME + "resources" + File.separator+"config"+File.separator+ "config.properties";
	
	public final static String TESTDATA_FILE = USER_HOME + "resources" + File.separator+ "testdata" + File.separator+ "test.xlsx";

	public final static String LOG4J_FILE = USER_HOME + "resources" + File.separator + "log4j" + File.separator+ "log4j.properties";
	
	public final static String CHROME_FILE = USER_HOME + "lib" + File.separator+ "chromedriver.exe";

	public final static String FIREFOX_FILE = USER_HOME + "lib" + File.separator+ "geckodriver.exe";

	public final static String IE_FILE = USER_HOME + "lib" + File.separator+ "IEDriverServer.exe";

}

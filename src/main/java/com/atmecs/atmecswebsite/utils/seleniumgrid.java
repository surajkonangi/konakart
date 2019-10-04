package com.atmecs.atmecswebsite.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class seleniumgrid {

	WebDriver driver;
	String baseURL, nodeURL;

	@Test
	public void setUp() throws MalformedURLException {
		baseURL = "https://www.atmecs.com";
		nodeURL = "http://55.55.54.73:4444/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(nodeURL), capability);
		driver.get(baseURL);
	}

//	@AfterTest
//	public void afterTest() {
//		driver.quit();
//	}
//
//	@Test
//	public void sampleTest() {
//		driver.get(baseURL);
//
//		if (driver.getPageSource().contains("MOBILE TESTING")) {
//			Assert.assertTrue(true, "mobile Testing Link Found");
//		} else {
//			Assert.assertTrue(false, "Failed: Link not found");
//		}

	}



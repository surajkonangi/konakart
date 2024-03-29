package com.atmecs.atmecswebsite.testbase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import com.atmecs.atmecswebsite.constants.ConstantPaths;
import com.atmecs.atmecswebsite.constants.LogReports;
import com.atmecs.atmecswebsite.utils.Readproperties;

public class TestBase {

	public static WebDriver driver;
	LogReports log = new LogReports();
	String url;

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void invokeBrowser() throws IOException {

		String base = Readproperties.readConfig("Browser");
		url = Readproperties.readConfig("Url");
//to load chrome browser run it
		if (base.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ConstantPaths.CHROME_FILE);
			driver = new ChromeDriver();
			log.info("Chrome browser started...");

		}
//to load firefox browser and run it
		else if (base.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ConstantPaths.FIREFOX_FILE);
			driver = new FirefoxDriver();
			log.info("Firefox browser started...");

		}
//to load ie browser and run it
		else if (base.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ConstantPaths.IE_FILE);
			DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
			ieCaps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "");
			driver = new InternetExplorerDriver(ieCaps);
			log.info("IE browser started...");
		}
//to open the given url and maximize the window
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log.info("Application is open...");
	}

	/*
	 * @AfterSuite public void closeBrowser() { driver.quit(); }
	 */
}

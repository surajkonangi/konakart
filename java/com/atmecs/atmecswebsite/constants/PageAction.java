package com.atmecs.atmecswebsite.constants;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageAction {

	static LogReports log = new LogReports();

	// Actions action=new Actions(driver);
	static WebDriver driver;

	public  void selectDropdown(String xpath, String visibleText) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select noOfpeople = new Select(element);
		noOfpeople.selectByVisibleText(visibleText);

	}

	public void clickOnElement(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public void sendKeys(WebDriver driver, String xpath, String value) {

		WebElement a = driver.findElement(By.xpath(xpath));
		@SuppressWarnings("unused")
		Actions action = new Actions(driver);
		// .sendKeys(value);
		a.sendKeys(value);
		a.sendKeys(Keys.ENTER);
		// action.sendKeys(Keys.ENTER).build().perform();
	}

	public void clickEnter(WebDriver driver) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();

	}

	public void clickTab(WebDriver driver) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();

	}

	public static void getText(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).getText();

	}

	public static void sendKeys1(WebDriver driver, String xpath, String value) {
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}

	public static void scroll(WebDriver driver) {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,500)");
	}
	
	public static void mouseon(WebDriver driver,String xpath) {
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(By.xpath(xpath));
		action.moveToElement(element).perform();
		
	}

	public static void ClickElement(WebDriver driver, final String xpath) {
		@SuppressWarnings("deprecation")
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).pollingEvery(1, TimeUnit.SECONDS)
				.withTimeout(30, TimeUnit.SECONDS).ignoring(ElementNotInteractableException.class);
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				driver.findElement(By.xpath(xpath)).click();
				return true;
			}
		});
	}

	public  boolean clickElement(WebDriver driver, String locator, String locatorValue) {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		boolean isClicked = true;

		try {
			switch (locator) {
			case "CLASSNAME":
				wait.until(ExpectedConditions.elementToBeClickable(By.className(locatorValue)));
				driver.findElement(By.className(locatorValue)).click();
				break;
			case "CSSSELECTOR":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.cssSelector(locatorValue)).click();
				break;
			case "ID":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.id(locatorValue)).click();
				break;
			case "LINKTEXT":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.linkText(locatorValue)).click();
				break;
			case "NAME":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.name(locatorValue)).click();
				break;
			case "PARTIALLINKTEXT":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.partialLinkText(locatorValue)).click();
				break;
			case "TAGNAME":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.tagName(locatorValue)).click();
				break;
			case "XPATH":
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
				driver.findElement(By.xpath(locatorValue)).click();
				break;
			default:
				break;
			}
		} catch (IllegalArgumentException illegalArgumentException) {
			isClicked = false;
			log.info("Locator type doesn't exist" + illegalArgumentException.getCause());
		} catch (NullPointerException nullPointerException) {
			isClicked = false;
			log.info("Locator type doesn't exist " + nullPointerException.getCause());
		} catch (Exception e) {
			isClicked = false;
		}

		return isClicked;

	}
}

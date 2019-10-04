package com.atmecs.atmecswebsite.validation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.atmecs.atmecswebsite.constants.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.utils.Readproperties;

public class ProductValidation extends TestBase {

	static Readproperties read = new Readproperties();
	static LogReports log = new LogReports();
	
	public static void correctproductvalidate() throws IOException {
		String actualproductname;
		String expectedproductname="Matrox G400 32MB";
		
		log.info("validating correctproductname...");
		actualproductname=driver.findElement(By.xpath(read.readPropertiesFile("productpage.validatecorrectproduct.txt"))).getText();
		Assert.assertEquals(actualproductname,expectedproductname);
		log.info("successfully validated...");
	}
	
	public static void wrongproductvalidate() throws IOException {
		String actualwrongpraduct;
		String expectedwrongproduct="There are no available products.";
		
		log.info("validating wrongproduct...");
		actualwrongpraduct=driver.findElement(By.xpath(read.readPropertiesFile("productpage.validatewrongproduct.txt"))).getText();
		Assert.assertEquals(actualwrongpraduct,expectedwrongproduct);
		log.info("successfully validated...");
	}
}
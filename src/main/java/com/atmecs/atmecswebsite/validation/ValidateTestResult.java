package com.atmecs.atmecswebsite.validation;

import org.testng.Assert;

import com.atmecs.atmecswebsite.constants.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.utils.Readproperties;

public class ValidateTestResult extends TestBase {
	static LogReports log = new LogReports();
	Readproperties read = new Readproperties();

	public static  boolean validateData(String actual,String expected, String message) {
		try {
			/*
			 * 
			 * print actual and expected value
			 * 
			*/
			Assert.assertEquals(actual, expected);
			
			return true;
		} catch (AssertionError assertionError) {
			
			return false;
		}
	}
}

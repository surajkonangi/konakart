package com.atmecs.atmecswebsite.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecswebsite.constants.ConstantPaths;

public class Readproperties {

	public String readPropertiesFile(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ConstantPaths.LOCATORS_FILE1);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}
	
	
	public String readPropertiesFilefooter(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ConstantPaths.LOCATORS_FILE2);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}
	
	public String readPropertiesFilehomemenu(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ConstantPaths.LOCATORS_FILE3);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}
	
	public String readPropertiesFileblogelements(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ConstantPaths.LOCATORS_FILE4);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}
	public static String readConfig(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(ConstantPaths.CONFIG_FILE);
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}
	
	
}
package com.atmecs.atmecswebsite.validation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.atmecs.atmecswebsite.constants.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.utils.Readproperties;

public class PagesValidation extends TestBase{
	
	static Readproperties read = new Readproperties();
	static LogReports log = new LogReports();
	
	public static void explorevalidate()throws IOException {
		String actualexplorebreadcrum;
		String expectedexplorebreadcrum="Home › Services";
				
		actualexplorebreadcrum=driver.findElement(By.xpath(read.readPropertiesFile("explorepage.pagevalidate.txt"))).getText();
		Assert.assertEquals(actualexplorebreadcrum,expectedexplorebreadcrum);
		log.info("explorebreadcrumb validated...");
						
	}

	public static void aimipagevalidate() throws IOException {
		String actualcorrectpageaimi;
		String actualbreadcrumb;
		String expectedcorrectpageaimi="Artificial Intelligence / Machine Learning";
		String expectedbreadcrumb="Home › Services › Digital Life › Artificial Intelligence / Machine Learning";
		
		actualcorrectpageaimi=driver.findElement(By.xpath(read.readPropertiesFile("moreinfopage.correctpageaimi.txt"))).getText();
		Assert.assertEquals(actualcorrectpageaimi,expectedcorrectpageaimi);
		log.info("correctpageaimi validated...");
		actualbreadcrumb=driver.findElement(By.xpath(read.readPropertiesFile("moreinfopage.bredcrumbaimi.txt"))).getText();
		Assert.assertEquals(actualbreadcrumb,expectedbreadcrumb);
		log.info("breadcrumb validated...");
		
		}
	public static void ArgumentedValidation() throws IOException {
		String actualpageargumentedreality;
		String actualbreadcrumb;
		String expectedpageargumentedreality="Augmented Reality / Virtual Reality";
		String expectedbreadcrumb="Home › Services › Digital Life › Augmented Reality / Virtual Reality";
		
		actualpageargumentedreality=driver.findElement(By.xpath(read.readPropertiesFile("moreinfopage.argumentedrealitypage.txt"))).getText();
		Assert.assertEquals(actualpageargumentedreality,expectedpageargumentedreality);
		log.info("argumentedpage validated...");
		actualbreadcrumb=driver.findElement(By.xpath(read.readPropertiesFile("moreinfopage.breadcrumbargumentedreality.txt"))).getText();
		Assert.assertEquals(actualbreadcrumb,expectedbreadcrumb);
		log.info("argumentedbreadcrumb validated...");
		
		}
	public static void internetofthingsvalidation() throws IOException {
		String actualinterofthingspage;
		String actualbreadcrumb;
		String expectedinternetofthingspage="Internet of Things";
		String expectedbreadcrumber="Home › Services › Digital Life › Internet of Things";
		
		actualinterofthingspage=driver.findElement(By.xpath(read.readPropertiesFile("moreinfo.internetofthingspage.txt"))).getText();
		Assert.assertEquals(actualinterofthingspage,expectedinternetofthingspage);
		log.info("internetofthings page validated...");
		actualbreadcrumb=driver.findElement(By.xpath(read.readPropertiesFile("moreinfo.internetofthingsbreadcrumb.txt"))).getText();
		Assert.assertEquals(actualbreadcrumb,expectedbreadcrumber);
		log.info("internetofthings breadcrumb validated...");
		
		}
	public static void chatbotsvalidation() throws IOException {
		String actualchatbotspage;
		String actualchatbotsbreadcrumb;
		String expectedchatbotspage="Robotic Process Automation & ChatBOTs";
		String expectedchatbotsbreadcrumb="Home › Services › Digital Life › Robotic Process Automation & ChatBOTs";
		
		actualchatbotspage=driver.findElement(By.xpath(read.readPropertiesFile("moreinfo.chatbotspage.txt"))).getText();
		Assert.assertEquals(actualchatbotspage,expectedchatbotspage);
		log.info("chatbotspage validated...");
		actualchatbotsbreadcrumb=driver.findElement(By.xpath(read.readPropertiesFile("moreinfo.chatbotxbreadcrumber.txt"))).getText();
		Assert.assertEquals(actualchatbotsbreadcrumb,expectedchatbotsbreadcrumb);
		log.info("chatbot'sbreadcrumb validated...");
		
	}
	public static void blockchainvalidation() throws IOException {
		String actualblockchainpage;
		String actualblockchainbreadcrumb;
		String expectedblockchainpage="Blockchain";
		String expectedblockchainbreadcrumb="Home › Services › Digital Life › Blockchain";
		
		actualblockchainpage=driver.findElement(By.xpath(read.readPropertiesFile("moreinfo.blockchainpage.txt"))).getText();
		Assert.assertEquals(actualblockchainpage,expectedblockchainpage);
		log.info("blockchainpage validated...");
		actualblockchainbreadcrumb=driver.findElement(By.xpath(read.readPropertiesFile("moreinfo.blockchainbreadcrumber.txt"))).getText();
		Assert.assertEquals(actualblockchainbreadcrumb,expectedblockchainbreadcrumb);
		log.info("blockchainbreadcrumb validated...");
	}
}

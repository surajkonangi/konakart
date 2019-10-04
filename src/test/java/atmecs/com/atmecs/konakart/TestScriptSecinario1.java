package atmecs.com.atmecs.konakart;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.constants.PageAction;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.utils.Readproperties;
import com.atmecs.atmecswebsite.utils.TestDataProvider;
import com.atmecs.atmecswebsite.validation.ProductValidation;

public class TestScriptSecinario1 extends TestBase {
	@Test(dataProvider = "destination", dataProviderClass = TestDataProvider.class)
	public void productvalidation (String[] values) throws IOException, InterruptedException {
    	Readproperties read = new Readproperties();
    	PageAction page = new PageAction();
         
    
    	  page.selectDropdown(driver,read.readPropertiesFile("homepage.selectdropdown.button"), values[2]);
		  page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.searchbar.txt"));
		  PageAction.sendKeys1(driver,read.readPropertiesFile("homepage.searchbar.txt"), values[0]);
		  page.clickElement(driver, "XPATH",read.readPropertiesFile("homepage.searchbutton.button"));
		  ProductValidation.correctproductvalidate();
		  page.clickElement(driver,"XPATH", read.readPropertiesFile("homepage.logoimg.picture"));
		  page.clickElement(driver, "XPATH",read.readPropertiesFile("homepage.searchbar.txt"));
		  PageAction.sendKeys1(driver,read.readPropertiesFile("homepage.searchbar.txt"), values[1]);
		  page.clickElement(driver, "XPATH",read.readPropertiesFile("homepage.searchbutton.button"));
		  ProductValidation.wrongproductvalidate();
		 
		  
    	
	}
	
}

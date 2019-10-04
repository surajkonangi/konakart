package atmecs.com.atmecs.konakart;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.constants.PageAction;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.utils.Readproperties;

public class TeasScriptScinario2 extends TestBase {

	@Test
	public void HeroImgValidation() throws IOException {
		
		Readproperties read = new Readproperties();
    	PageAction page = new PageAction();
    	
    	page.clickElement(driver, "XPATH", read.readPropertiesFile("homepage.heroimg.img"));
		
	}
}
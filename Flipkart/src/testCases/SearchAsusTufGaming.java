package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.Functions_Common;
import pageObjects.Search_Page_Objects;

public class SearchAsusTufGaming extends Functions_Common{
	//log4j object
	static Logger logger=Logger.getLogger(SearchAsusTufGaming.class);
	@Test
	public void search() throws InterruptedException {
		//log4j
		logger.info("Searching AsusLaptop");
		
		PageFactory.initElements(driver1, Search_Page_Objects.class);
		
		Thread.sleep(5000);
		Search_Page_Objects.searcH.sendKeys(AddProperties.getProperty("SearchFunction"));
		Search_Page_Objects.clicksearchButton.click();
		
		logger.info("Searched AsusLaptop");
		logger.info("End of SearchAsusTufGaming");


	}
	
	
	
	
	

}

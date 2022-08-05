package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.Functions_Common;
import pageObjects.Login_Page_Objects;

public class Login_Test_Cases extends Functions_Common{
//log4j object
static	Logger logger1=Logger.getLogger(Login_Test_Cases.class);

	
	@Test
	public void LoginFlipKart() throws InterruptedException {
		//log4j
		logger1.info("Logging FlipKart Page ");
		
		PageFactory.initElements(driver1,Login_Page_Objects.class);
		Thread.sleep(5);
		//Login_Page_Objects.escape.click();
		Login_Page_Objects.usernamE.sendKeys(AddProperties.getProperty("usernamae1"));
		Login_Page_Objects.passworD.sendKeys(AddProperties.getProperty("password1"));
		Login_Page_Objects.submiT.click();
		
		logger1.info("Logged FlipKart Page ");

	}
	
	
	
	
	
	
	
	
	
}

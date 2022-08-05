package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page_Objects{
	
	
	@FindBy (xpath = "//*[@class='_2KpZ6l _2doB4z']")
	public static WebElement escapH;
	
	@FindBy(xpath = "//form[@autocomplete='on']//div[@class='IiD88i _351hSN']//input[@type='text']")
	public static	WebElement usernamE;
	
	@FindBy(xpath ="//form[@autocomplete='on']//div[@class='IiD88i _351hSN']//input[@type='password']")
	public static	WebElement passworD;
	
	@FindBy(xpath = "//form[@autocomplete='on']//div[@class='_1D1L_j']//*[@type='submit']")
	public static	WebElement submiT;
	
	
	
	

}

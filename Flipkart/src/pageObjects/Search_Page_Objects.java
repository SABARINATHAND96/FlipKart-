package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Page_Objects {
	
	
	@FindBy(xpath="//*[@type='text']")
	public static WebElement searcH;
	
	@FindBy(xpath = "//*[@type='submit']")
	public static WebElement clicksearchButton;
	
	
	
	
	

}

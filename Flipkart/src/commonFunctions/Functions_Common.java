package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Functions_Common {
	
public static Properties AddProperties=null;
public static WebDriver driver1=null;

	//log4j object
	static Logger logger=Logger.getLogger(Functions_Common.class);

	
public Properties  LoadingConfigurationFile() throws IOException {
		
		FileInputStream filestream=new FileInputStream("ConfigurationFile.properties");
		
		AddProperties=new Properties();
		AddProperties.load(filestream);
		
		return AddProperties;
		
	}
	
	
	
	@BeforeSuite
	public void LaunchBrowser() throws IOException, InterruptedException {
		//log4j config
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Flipkart Test Begin");

		logger.info("Loading the property File");
		
		//call method LoadingConfigurationFile
		LoadingConfigurationFile();
	
		String browser2=AddProperties.getProperty("browser");
		String url2=AddProperties.getProperty("url");
		String driverLocation2=AddProperties.getProperty("Location");
		
		if (browser2.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", driverLocation2);
			driver1=new FirefoxDriver();
			logger.info("Launched FireFox");

		}
		else if(browser2.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation2);
			 driver1=new ChromeDriver();
				logger.info("Launched Chrome");

		}
		
		driver1.manage().window().maximize();
		driver1.get(url2);
		logger.info("Navigated to Application");
		//driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	
	
	
	@AfterSuite
	public void tearDown() {
		
		logger.info("Execution Done Closing The Browser");
		driver1.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

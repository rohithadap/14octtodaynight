package pomWithPagefactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest {
	
	// Browser setup
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMIT\\Desktop\\Selenium all jar files\\chromedriver_win32 (104)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void FacebookLoginPageTest() {
		loginPage lp = new loginPage(driver);
		
		lp.verifyfacebookloginpageLogo();
		lp.verifyfacebookloginpageTagline();
		lp.verifyfacebookloginpageforgotpasswordlink();
		lp.verifyfacebookloginpageCreateNewAccount();
		lp.setfacebookloginpageUsername();
		lp.setfacebookloginpagePassword();
		lp.clickfacebookloginpageloginbtn();
		lp.verifyFacebookLoginPageFooterLinkSize();
		
	}
	
	
}

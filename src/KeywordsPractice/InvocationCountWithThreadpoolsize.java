package KeywordsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountWithThreadpoolsize {
	
	@Test(invocationCount = 5, threadPoolSize = 5 )
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AMIT\\Desktop\\Selenium all jar files\\chromedriver_win32(104)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	    driver.quit();
	    
	}
 
}

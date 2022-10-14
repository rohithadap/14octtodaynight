package parameterisationAndCrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class AllBrowser {
	WebDriver driver ;
	
	@org.testng.annotations.Parameters("browser")
	@Test(priority = 1)
	public void crossbrowsertesting(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AMIT\\Desktop\\Selenium all jar files\\chromedriver_win32 (105)\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\AMIT\\Desktop\\Selenium all jar files\\chromedriver_win32(104)\\chromedriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.out.println("Wrong browser selected");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Test(priority = 2)
	public void verifycurrentURL() {
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");
		
	}
	
	@Test(priority = 3)
	public void verifypagetitle() {
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
		
	}
	
	@Test(priority = 4)
	public void usernamefield() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("rohithadap");
	}
	
	@Test(priority = 5)
	public void passwordfield() {
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("rohithadap");
	}
	
	@Test(priority = 6)
	public void clickloginbtn() {
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
		Assert.assertTrue(loginbtn.isDisplayed());
		loginbtn.click();
	}
	
	
	
	
	
	
	

}

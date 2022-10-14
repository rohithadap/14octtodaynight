package KeywordsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnabledKeywordPractice {
	
	@BeforeClass
	public void browseropen() {
		System.out.println("Browser open");
	}
	@AfterClass
	public void browserclose() {
		System.out.println("Browser closed");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Logged in to the application");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logged out from application");
	}
	@Test(priority = 1)
	public void homepagetest() {
		System.out.println("Home page checked");	
	}
	@Test(priority = 2, invocationCount = 5, enabled = false)
	public void notificationtest() {
		System.out.println("notification checked");
	}
	@Test(priority = 3, enabled = false)
	public void settingspagetest() {
		System.out.println("Settings checked");
	}

}

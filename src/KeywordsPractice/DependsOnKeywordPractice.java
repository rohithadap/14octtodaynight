package KeywordsPractice;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnKeywordPractice {
	
	@Test(priority = 1)
	public void URLopen() {
		System.out.println("URL open successfully");
		//Assert.fail();
	}
	
	@Test(priority = 2, dependsOnMethods = "URLopen")
	public void login() {
		System.out.println("logged in");
		Assert.fail();
	}
	
	@Test(priority = 3, dependsOnMethods = {"URLopen","login"})
	public void logout() {
		System.out.println("logged out");
	}
	
}

package IntroductionTestng;

import org.testng.annotations.Test;

public class Introduction {

	// TestNG will give preference to the alphabetical order
	@Test(priority = 1)
	public void openURL() {

		System.out.println("URL is opend");
	}

	@Test(priority = 2)
	public void USERandPass() {

		System.out.println("Username and password enterd ");
	}

	@Test(priority = 3)
	public void login() {

		System.out.println("Logged in to the website");
	}

	@Test(priority = 4)
	public void logout() {

		System.out.println("LOgged out from the website");
	}

}

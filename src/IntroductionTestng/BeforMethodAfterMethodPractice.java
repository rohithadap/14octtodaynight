package IntroductionTestng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforMethodAfterMethodPractice {
	
		
		@BeforeMethod
		public void login() {
			System.out.println("logged in to the website");
			Reporter.log("log in successful");
			
		}
		@AfterMethod
		public void logout() {
			System.out.println("logged out from website");
			Reporter.log("log out successful");
		}
		
		@Test(priority = 1)
		public void checkstories() {
			System.out.println("stories checked");
			Reporter.log("Stories viewed");
		}
		
		@Test(priority = 2)
		public void notificationpage() {
			System.out.println("notification checked");
			Reporter.log("Notification checked");
		}
		
		@Test(priority = 3)
		public void profileview() {
			
			System.out.println("profile checked");
			Reporter.log("profile viewed");
		}
		
	
}

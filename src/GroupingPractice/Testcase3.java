package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase3 {
	
	@BeforeClass(alwaysRun = true)
	public void openbrowser() {
		System.out.println("Browser is opened");
	}
	@AfterClass(alwaysRun = true)
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
	@Test(groups = "Smoke")
	public void m7() {
		System.out.println("this is method m7");
	}
	@Test(groups = "Functional")
	public void m8() {
		System.out.println("this is method m8");
	}
	@Test(groups = {"Functional","Regression"})
	public void m9() {
		System.out.println("this is method m9");
	}

}

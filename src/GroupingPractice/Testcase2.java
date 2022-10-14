package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase2 {
	
	@BeforeClass(alwaysRun = true)
	public void openbrowser() {
		System.out.println("Browser is opened");
	}
	@AfterClass(alwaysRun = true)
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
	@Test(groups = "Smoke")
	public void m1() {
		System.out.println("this is method m4");
	}
	@Test(groups = "Functional")
	public void m2() {
		System.out.println("this is method m5");
	}
	@Test(groups = {"Functional","Regression"})
	public void m3() {
		System.out.println("this is method m6");
	}


}

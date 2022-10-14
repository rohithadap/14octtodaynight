package GroupingPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@BeforeTest(alwaysRun = true)
	public void openDB() {
		System.out.println("DB is opend");
	}
	@AfterTest(alwaysRun = true)
	public void closeDB() {
		System.out.println("DB is closed");
	}
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
		System.out.println("this is method m1");
	}
	@Test(groups = "Functional")
	public void m2() {
		System.out.println("this is method m2");
	}
	@Test(groups = {"Functional","Regression"})
	public void m3() {
		System.out.println("this is method m3");
	}

}

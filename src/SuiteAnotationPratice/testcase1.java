package SuiteAnotationPratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase1 {
	
	@BeforeSuite
	public void emailconfiguration() {
		System.out.println("Email is configured");
	}
	@AfterSuite
	public void emailsent() {
		System.out.println("Email sent after completion");
	}
	@BeforeTest
	public void openDB() {
		System.out.println("DB is opend");
	}
	@AfterTest
	public void closeDB() {
		System.out.println("DB is closed");
	}
	@BeforeClass
	public void openbrowser() {
		System.out.println("Browser is opened");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
	@Test
	public void m1() {
		System.out.println("this is method m1");
	}
	@Test
	public void m2() {
		System.out.println("this is method m2");
	}
	@Test
	public void m3() {
		System.out.println("this is method m3");
	}
		
		
		
	
}

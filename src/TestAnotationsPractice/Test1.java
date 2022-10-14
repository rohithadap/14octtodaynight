package TestAnotationsPractice;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeTest
	public void DBopen() {
		System.out.println("Database opend");
	}
	
	@AfterTest
	public void DBclose() {
		System.out.println("Database closed");
	}
	@BeforeClass
	public void openbrowser() {
		System.out.println("Browser opened");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("Browser closed");
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

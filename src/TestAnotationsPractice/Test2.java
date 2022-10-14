package TestAnotationsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeClass
	public void openbrowser() {
		System.out.println("Browser opened");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("Browser closed");
	}
	@Test
	public void m4() {
		System.out.println("this is method m4");
	}
	@Test
	public void m5() {
		System.out.println("this is method m5");
	}
	@Test
	public void m6() {
		System.out.println("this is method m6");
	}

}

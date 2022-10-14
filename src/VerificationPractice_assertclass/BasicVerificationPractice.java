package VerificationPractice_assertclass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicVerificationPractice {
	
	//1. assertEquals()==> if actual and expected result matches
//	@Test
//	public void test1() {
//		String actual="Rohit";
//		String expected="Rohit";
//		Assert.assertEquals(actual, expected);
//	}
	
	//2. assertNotEquals()==> if actual and expected result not matches
//	@Test
//	public void test1() {
//		String actual="Rohit";
//		String expected="Amit";
//		Assert.assertNotEquals(actual, expected);
//	}
	
	//3. asertNull()==> TC will pass if field is empty
	
//	@Test
//	public void test1() {
//		String Products=null;
//		Assert.assertNull(Products);
//	}
	
	//4. asertNull()==> TC will pass if field is not empty
	
//	@Test
//	public void test1() {
//		String Products="1545";
//		Assert.assertNotNull(Products);
//	}
	// 5. Assert fail()==> To purposefully failing the TC
	@Test
	public void test1() {
		String Products="1545";
		Assert.fail();
	}
	
	
	
	
	
	
}

package VerificationPractice_assertclass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerificationSoftAssert {
	
	@Test
	public void test1() {
		SoftAssert soft = new SoftAssert();
		
		String str1="rohit";
		soft.assertEquals(str1,"rohit");
		System.out.println(str1);
		
		String str="Rohit";
		soft.assertEquals(str, "Amit");
		System.out.println(str
				);
		
		soft.assertAll();
//	}
	
//	@Test
//	public void test1() {
//		
//		String s="rohit";
//		Assert.assertEquals(s, "rohit");
//		System.out.println(s);
//		
//		String s1="rohit";
//		Assert.assertEquals(s1, "rdohit");
//		System.out.println(s1);
//	}

}
}
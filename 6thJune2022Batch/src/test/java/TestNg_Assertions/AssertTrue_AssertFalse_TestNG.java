package TestNg_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue_AssertFalse_TestNG {
	
	@Test
	public void verifyAssertTrue() {
		
		boolean expected=true;
		
		Assert.assertTrue(expected);
	}
	
	@Test
	public void verifyAssertTrue_Negative() {
		
		boolean expected=false;
		
		Assert.assertTrue(expected," value is not true");
	}
	
	@Test
	public void verifyAssertFalse() {
		
		boolean expected=false;
		
		Assert.assertFalse(expected);
	}
	
	@Test
	public void verifyAssertFlase_Negative() {
		
		boolean expected=true;
		
		Assert.assertFalse(expected," value is not false ");
	}

}

package com.Saranyaproject;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_asset_concept {
	@Test
	
	private void softAssert() {
		
		
		
		String actual ="Dad";
		String expected ="Mom";
	
		
		SoftAssert d = new SoftAssert();
		d.assertEquals(actual,expected);
		System.out.println("verification");
		
		
		
	}

}

package com.base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertConcept {

	@Test
	public void hardassert() {

		String actual = "Saranya";
		String expected = "Saranya";
		Assert.assertEquals(actual, expected);
		System.out.println("Validation");
	}

}

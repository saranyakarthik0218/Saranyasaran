package com.TESTNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SimpleAnnotations_1 {

	@BeforeSuite
	private void propertSetting() {
	
	System.out.println("propertySetting");
	
}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("BrowserLaunch");
	}
	
	@BeforeClass
	private void urlLaunch() {
		System.out.println("urlLaunch");
	}
	
	
	
	
	
	
}

package com.listner;

import org.testng.annotations.BeforeSuite;

import com.Saranyaproject.Baseclass_Java;
import com.aventstack.extentreports.ExtentTest;

public class Extent_Report_Test {

	
	
	@BeforeSuite 
	public static ExtentTest extentrepot;
	
	public void extentreportstartsup() {
	
	Baseclass base = new Baseclass_Java();
	
	base.extentreoprtstart(null);
}
@AfterSuite
public static
public void

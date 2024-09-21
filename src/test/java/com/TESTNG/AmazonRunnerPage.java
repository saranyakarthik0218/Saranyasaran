package com.TESTNG;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ProjectTestNg.LoginPageAmazon;
import com.listner.ExtendReport_Test;
import com.listner.ITestListnerClass;
public class AmazonRunnerPage {
	
	@Listeners(ITestListnerClass.class) 
	public class AmazonRunnerClass extends BaseClass {
		@BeforeTest
		public static void browser() {
			browserLaunch("chrome");
		}
		
		@Test
		public static void loginPageValidTesting() {
			
			ExtendReport_Test.extenttest = extentReports.createTest("Login Test"+" :"+
			Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Valid email and valid password");
			LoginPageAmazon log= new LoginPageAmazon (driver);
			Assert.assertTrue(log.validDataLogin(ExtendReport_Test.extenttest));
		}
		@Test
		public static void loginPageInvalidTesting() {
			ExtendReport_Test.extenttest = extentReports.createTest("Login Test"+" :"+
					Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Invalid email and valid password");
			LoginPageAmazon log= new LoginPageAmazon (driver);
			Assert.assertTrue(log.inValidDataLogin(ExtendReport_Test.extenttest));
		}
		@Test
		public static void loginPageInvalidPassword() {
			
		
		ExtendReport_Test.extenttest = extentReports.createTest("Login Test"+" :"+
			Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Invalid email and valid password");
			LoginPageAmazon log= new LoginPageAmazon (driver);
			Assert.assertTrue(log.inValidpasswordLogin(ExtendReport_Test.extenttest));
		}
		@Test
		public static void loginPageEmptyEmail() {
			ExtendReport_Test.extenttest = extentReports.createTest("Login Test"+" :"+
				Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Invalid email and valid password");
				LoginPageAmazon log= new LoginPageAmazon (driver);
				Assert.assertTrue(log.emptyLogin(ExtendReport_Test.extenttest));
			}
	}
	@Test
	public static void loginPageEmptypassword() {
				
		ExtendReport_Test.extenttest = extentReports.createTest("Login Test"+" :"+
			Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Invalid email and valid password");
			LoginPageAmazon log= new LoginPageAmazon (driver);
			Assert.assertTrue(log.emptypasswordLogin(ExtendReport_Test.extenttest));
		}
	@AfterTest
	public void terminate() {
	browserTabClose();
	}
	
@BeforeSuite
 public static void extentReportStart() {
	extentReportStart("C:\\Users\\user\\eclipse-workspace\\SepPremIPT\\Reports");
}
	
	@AfterSuite
	public static void extentReportEnd() throws IOException {
		extentReportTearDown("C:\\Users\\user\\eclipse-workspace\\SepPremIPT\\Reports\\index.html");
	}
	
}

}

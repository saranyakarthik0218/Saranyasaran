package com.ProjectTesting;


	import static org.testng.Assert.assertEquals;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.SepPremIPT.BaseClass;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;

	public class LoginPageAmazon extends BaseClass{
		public static WebDriver driver;
		
		@FindBy(id="nav-link-accountList")
		private WebElementsigninbtn;
		
		@FindBy(xpath="//input[@type='email']")
		private WebElemententeremail;
		
		@FindBy(id="continue")
		private WebElementcontinuebtn;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElemententerpassword;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElementpasssigninbtn;
		
		@FindBy(xpath="//div[contains(text(),'Enter a valid email address')]")
		private WebElementemailerror;
		
		@FindBy(xpath="//span[contains(text(),'Your password')]")
		private WebElementpasswrderror;
		
		@FindBy(xpath="//div[contains(text(),' Enter your email')]")
		private WebElementemptyemailerror;
		
		@FindBy(xpath="//div[contains(text(),' Enter your password')]")
		private WebElementemptypasswrderror;
		
		public LoginPageAmazon(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}
		
		public booleanvalidDataLogin(ExtentTestextenttest) {
			try {
				urlLaunch("https://www.amazon.in/");
				clickOption(driver, signinbtn);
				input(driver, enteremail, "yogiramsaran@gmail.com");
				clickOption(driver, continuebtn);
				input(driver, enterpassword, "yogiramsaran@gmail.amazon");
				clickOption(driver, passsigninbtn);
				//String title= driver.titleAndUrl(driver,"url");
				String title=driver.getTitle();
				assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\");");
				extenttest.log(Status.PASS,"Loginsuccessfull");
				
			} catch (Exception e) {
				extenttest.log(Status.FAIL,"Login not successfull"+ e.getMessage());
				return false;
			}
			return true;
		}
		
		public booleaninValidDataLogin(ExtentTestextenttest) {
			try {
				urlLaunch("https://www.amazon.in/");
				clickOption(driver, signinbtn);
				input(driver, enteremail, "rubraj21@gmail");
				clickOption(driver, continuebtn);
				String erroremail=emailerror.getText();
				System.out.println(erroremail);
				assertEquals(erroremail, "Enter a valid email address or phone number");
				extenttest.log(Status.PASS,"Loginsuccessfull");
			} catch (Exception e) {
				extenttest.log(Status.FAIL,"Login not successfull"+ e.getMessage());
				return false;
			}return true;
			}
		
		public booleaninValidpasswordLogin(ExtentTestextenttest) {
			try {
				urlLaunch("https://www.amazon.in/");
				clickOption(driver, signinbtn);
				input(driver, enteremail, "yogiramsaran@gmail.com");
				clickOption(driver, continuebtn);
				input(driver, enterpassword, "yogiram@amazon");
				clickOption(driver, passsigninbtn);
				String passworderror=passwrderror.getText();
				System.out.println(passworderror);
				assertEquals(passworderror, "Your password is incorrect ");
				extenttest.log(Status.PASS,"Loginsuccessfull");
			} catch (Exception e) {
				extenttest.log(Status.FAIL,"Login not successfull"+ e.getMessage());
				return false;
			}
			return true;
			}
		
		public booleanemptyLogin(ExtentTestextenttest) {
			try {
				urlLaunch("https://www.amazon.in/");
				clickOption(driver, signinbtn);
				input(driver, enteremail, " ");
				clickOption(driver, continuebtn);
				String emailemptymsg=emptyemailerror.getText();
				System.out.println(emailemptymsg);
				assertEquals(emailemptymsg, "Your password is incorrect ");
			} catch (Exception e) {
				extenttest.log(Status.FAIL,"Login not successfull"+ e.getMessage());
				return false;
			}return true;
			}
		
		public booleanemptypasswordLogin(ExtentTestextenttest) {
			try {
				urlLaunch("https://www.amazon.in/");
				clickOption(driver, signinbtn);
				input(driver, enteremail, "yogiram@gmail.com ");
				clickOption(driver, continuebtn);
				input(driver, enterpassword, " ");
				clickOption(driver, passsigninbtn);
				String passworderrormsg=emptypasswrderror.getText();
				assertEquals(passworderrormsg, "Your password is incorrect ");
			} catch (Exception e) {
				extenttest.log(Status.FAIL,"Login not successfull"+ e.getMessage());
				return false;
			}
			return true;
			}
		

	}






	
	
	
	
}



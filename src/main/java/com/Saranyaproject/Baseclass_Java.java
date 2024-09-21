package com.Saranyaproject;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Baseclass_Java {
	
	public static WebDriver driver;
	public static ExtentReports extentreports;
	public static File file;
	
	protected static void browser (String browsername) { 
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (browsername.equalsIgnoreCase("chrome")) {
			
			driver=new ChromeDriver();
			
		}else if(browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			
		}else {
			System.out.println("Invalid browser name");
		}
	
	
		driver.manage().window().maximize();
		
	}
		
	
	//get
		
		protected static void UrlLaunch(String url) {
		
		driver.get(url);
		}
		//  click
		protected static void clickElement(WebElement element) {
			
			element.click();
		}
		
		// sendKeys	
			
			protected static void clickElement(WebElement element, String value) {
				
				element.sendKeys(value);
			}
		// Quit
				protected static void browserterminate() {
					driver.quit();
				}
			
		//Implicitwait
				protected static void implicitwait(WebDriver driver, WebElement element) {
					try {
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						element.click();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
				// Get Text
				
			
			protected static void gettext( WebDriver driver,WebElement element) {
				String text=element.getText();
				System.out.println(text);
				
			}	
			//actions
				
				protected static void click(WebElement element) {
					Actions sk =new Actions(driver);
					sk.contextClick().build().perform();
				}
				
			
				
				//Navigate
				protected static void navigateelement(String navigateelement, String navigateurl) {
				if(navigateelement.equals("to")){
					driver.navigate().to(navigateurl);
				}else if (navigateelement.equalsIgnoreCase("forward"))	{
					driver.navigate().forward();
					
				}else if (navigateelement.equalsIgnoreCase("refresh")){
					
					driver.navigate().refresh();
				}
				else if (navigateelement.equals("Back")) {
					driver.navigate().back();
				}			
			
			public static void extentReportStart(String location) {
				extentReports = new ExtentReports();
				file=new File(location);
				ExtentSparkReporter SparkReporter=new ExtentSparkReporter(file);
				extentReports.attachReporter(SparkReporter);
				extentReports.setSystemInfo("OS", System.getProperty("os,name"));
				extentRepoets.setSystemInfo("Java Version", System.getProperty("Java.version")
						
				
			}
		
			public static void extentReportTearDown(String location)throws IOExcetption{
				extentReports.flush();
				file=new File(location);
				Desktop.getDesktop().browse((file).toURI());
					
			}
			
			
			
			public String takeScreenshot() throws IOException {
				TakeScreenshot screenshot=(TakeScfreenshot)driver;
				String timeStamp=new SimpleDataformat("yyyyMMdd_HHmmss").format(new Data());
				File scrfile=screenshot.getScreenshotAs(OutputType.FILE);
				File destfile=new File(Screenshort\\.png"+" _" + timeStamp +".png");
			    FileUtils.copyFile(scrfile,destfile);
				return destfile.getAbsolutePath();
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
				
				
				
				
				
}

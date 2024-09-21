package com.listner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class_TESTNG {

	
	
	protected static WebDriver browserLaunch(String browserName) {
		try {
		if (browserName.equalsIgnoreCase("chrome")) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		// options.addArguments("headless");
		driver= new ChromeDriver(options);
		}else if (browserName.equalsIgnoreCase("edge")){
		driver= new EdgeDriver();
		}else {
		System.out.println("INVALID BROWSER NAME");
				
		}
	
		} catch (Exception e) {
		e.printStackTrace();
		}
		return driver;
		}
		//URL LAUNCH 				
	protected static void urlLaunch(String url) {
		try {
		driver.get(url);
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		protected static void inputValues(WebDriver driver , WebElement element ,String value) {
			try {
			element.sendKeys(value);
			} catch (Exception e) {
				e.printStackTrace();

			}
			// TODO Auto-generated catch block
		}
		protected static void navigateTo(WebDriver driver , String navigateUrl) {
			try {
			driver.navigate().to(navigateUrl);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(
					
	protected static void navigateAllRounderMethods(WebDriver driver , String navigateMethod,String navigateUrl) {
	try {
    if (navigateMethod.equalsIgnoreCase("back")) {
	driver.navigate().back();
	}
	else if (navigateMethod.equalsIgnoreCase("forward")) {
	driver.navigate().forward();
	}
	else if (navigateMethod.equalsIgnoreCase("refresh")) {
	driver.navigate().refresh();
	}
	else if (navigateMethod.equalsIgnoreCase("to")) {
	driver.navigate().to(navigateUrl);
	}else {
	System.out.println("INVALID ENTRY! PLEASE CHECK THE ENTRY IN NAVIGATE ALL
	catch (Exception e) {
	e.printStackTrace();
									
	//simpleAlert	
	protected static void simpleAlert() {
		try {
		Alert alert = driver.switchTo().alert();
		String text =alert.getText();
		System.out.println("Simple Alert Text "+ text);
		alert.accept();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}								
									
	//promt alert
	protected static void promptAlert(String text_to_be_typed, String Element_Id) {
		try {
		driver.findElement(By.id("prompt")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text_to_be_typed);
		alert.accept();
		String name= driver.findElement(By.id(Element_Id)).getText();
		System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
								
		}
	}
	//isDisplayed_Enabled_Selected_AllRounderMethod
	protected static void isDisplayed_Enabled_Selected_AllRounderMethod(WebDriver driver, WebElement element, String
			requisiteFunction ) {
			try {
			if (requisiteFunction.equalsIgnoreCase("displayed")) {
			if (element.isDisplayed()) {
			System.out.println("Element is Displayed");
			}else {
			System.out.println("Element is not Displayed");
			}
			}
			else if (requisiteFunction.equalsIgnoreCase("enabled")) {
			if (element.isEnabled()) {
			System.out.println("Element is Enabled");
			}else {
			System.out.println("Element is not Enabled");
			}
			}
			else if (requisiteFunction.equalsIgnoreCase("selected")) {
			if (element.isSelected()) {
			System.out.println("Element is Selected");
			}else {
			System.out.println("Element is not Selected");
			}
			}
			else {
			System.out.println("INVALID ENTRY! PLEASE CHECK THE requisiteFunction ENTRY IN isDisplayed_Enabled_Selected_AllRounderMethod");
			}
			} catch (Exception e) {
				e.printStackTrace();
	
			}	
	}
	// single dropdown
	protected static void singleDropdown(WebDriver driver,WebElement element, String option , String value ) {
		try {
		Select s= new Select(element);
		if (option.equalsIgnoreCase("value")) {
		s.selectByValue(value);
		}else if (option.equalsIgnoreCase("text")) {
		s.selectByVisibleText(value);
		}else if (option.equalsIgnoreCase("index")) {
		s.selectByIndex(Integer.parseInt(value));
		}
		} catch (NumberFormatException e) {
			e.printStackTrace();

		}
		}
	//click
	protected static void clickElement(WebDriver driver, WebElement element) {
		try {
		element.click();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	//implicitwait
	protected static void implicitWait(WebDriver driver , int time) {
		try {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	//expicitwait
	protected static void explicitWaitDisplayed(WebDriver driver , WebElement element , int time) {
		try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	// keyboard robot
	protected static void keyboardRobotPress(WebDriver driver, WebElement element , String keyboardFunction) throws
	AWTException {
	try {
	Robot robot = new Robot();
	if (keyboardFunction.equalsIgnoreCase("down")) {
	robot.keyPress(KeyEvent.VK_DOWN);
	}
	else if (keyboardFunction.equalsIgnoreCase("enter")) {
	robot.keyPress(KeyEvent.VK_ENTER);
	}
	else if (keyboardFunction.equalsIgnoreCase("tab")) {
	robot.keyPress(KeyEvent.VK_TAB);
	}
	else {
	System.out.println("INVALID ENTRY! CHECK keyboardFunction IN THE keyboardRobotPress METHOD");
	}
	} catch (AWTException e) {
	e.printStackTrace();
	}
	}
	//Full page screenshot 
	protected static void takeFullScreenshot(WebDriver driver, String fileName, String format ) {
		try {
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File sourcefile = ts.getScreenshotAs(OutputType.FILE);
			File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\" + fileName + "." + format);
			//the below line will copy the sourcefile to target file
			sourcefile.renameTo(targetfile);

		}catch (WebDriverException e) {
			
			e.printStackTrace();
		}
	}
	//get title
	protected static void getTitle (WebDriver driver) {
		try {
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		} catch (Exception e) {
		e.printStackTrace();

		}
	}
	//get current url
	protected static void getCurrentUrl (WebDriver driver) {
		try {
		String currentUrl=driver.getCurrentUrl();
		System.out.println("The Current URL is "+currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//get text
	protected static void getText(WebDriver driver, WebElement element) {
	
		try {
			String text=element.getText();
			System.out.println(text);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	//terminate browser
	protected static void browserTerminate(WebDriver driver) {
		try {
		driver.quit();
		} catch (Exception e) {
		e.printStackTrace();
		}	
	}		
	//quit browser
	protected static void quitBrowser(WebDriver driver) {
		try {
		driver.close();
		} catch (Exception e) {
			e.printStackTrace();
	
		}
	}
	
	}




									
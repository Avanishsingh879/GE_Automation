package com.test.stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.automation.AutomationLibrary.ui.BrowserLibrary;
import com.automation.AutomationLibrary.ui.ElementLibrary;
import com.automation.AutomationLibrary.ui.PageLibrary;
import com.automation.AutomationLibrary.ui.WebdriverService;
import com.automation.AutomationLibrary.ui.config.IdentifyBy;
import com.automation.AutomationLibrary.ui.config.UIElement;
import com.genpact.util.EnvironmentConfig;
import com.test.runner.BaseRunner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VtigerLogin_TestScript extends BaseRunner{
	
	// This is Step definition file

	/*-------------------------------------------Start of Login Elements-----------------------------------------------*/
	
	private UIElement LogoutButton = new UIElement("LogoutButton", IdentifyBy.XPATH, "//*[@id=\"O365_MainLink_MePhoto\"]/div/div/div/div[2]/img");
	private UIElement vitger_Uname = new UIElement("Vitger_Uname", IdentifyBy.XPATH, "//input[@name='user_name']");
	private UIElement vitger_pwd = new UIElement("vitger_Pwd", IdentifyBy.XPATH, "//input[@name='user_password']");
	private UIElement vitger_sign = new UIElement("vitger_Sign", IdentifyBy.XPATH, "//input[@name='Login']");
	
	/*-------------------------------------------End of Login Elements-------------------------------------------------*/
	
	public static String title = null;
	
	/*-------------------------------------------Start of other important declarations---------------------------------*/
	private BrowserLibrary browserLibrary = getBrowserLibrary();
	private PageLibrary pageLibrary = getPageLibrary();
	private ElementLibrary elementLibrary = getElementLibrary();
	private WebdriverService WebdriverServiceLibrary = getWebDriverService(); 
	WebDriver driver=getWebDriverService().getWebDriver();
	
	/*-------------------------------------------End of other important declarations-----------------------------------*/
	
	private final static Logger log = Logger.getLogger(VtigerLogin_TestScript.class.getName());
	
	@Given("^I navigate to application Open URL$")
	public void i_navigate_to_application_Open_URL() throws IOException, InterruptedException
	{
		
		Thread.sleep(5000);
		FileInputStream fis=new FileInputStream("config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		driver.get(prop.getProperty("Url"));
		Thread.sleep(6000);
		byte[] screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot1, "image/png");
	}
	
	/*
	 * Function: 		loginPage
	 * Description:		To verify title of the login page	
	*/
		@Then("^User Enter Username and Password by click on Login Button$")
		public void User_Enter_Username_and_Password_by_click_on_Login_Button() throws Throwable {
				
	    Thread.sleep(3000);
	    elementLibrary.enterText(vitger_Uname, "admin");
	    Thread.sleep(2000);
		elementLibrary.hilightElement(vitger_Uname);
		Thread.sleep(2000);
		elementLibrary.enterText(vitger_pwd, "admin");
		Thread.sleep(2000);
		//elementLibrary.click(vitger_sign);
		WebElement vTigerSign=driver.findElement(By.xpath("//input[@name='Login']"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
    	executor1.executeScript("arguments[0].click();", vTigerSign);
		Thread.sleep(8000);
		elementLibrary.hilightElement(vitger_Uname);
		Thread.sleep(2000);
		System.out.println("Login Sucessfully");	    
				
		    	
			
		}
		@Then("User is in VtigerCRM Home Page")
		public void user_is_in_VtigerCRM_Home_Page() throws InterruptedException {
			
		Thread.sleep(2000);
		String actualTitle=driver.getTitle();
		String ExptedTitle="admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM";
			
		if(actualTitle.equalsIgnoreCase(ExptedTitle)) {
			System.out.println("Title Matched");
			System.out.println("Page Title Is:" + driver.getTitle());
		}
		
		else {
			
			System.out.println("Title not Matched");
		}
		Thread.sleep(2000);
		} 
		
		
	
		@Then("Login Sucessfully")
		public void login_Sucessfully() throws InterruptedException {
			
		Thread.sleep(2000);	
		System.out.println("Display Home Page");
		    
			
			
		}
}

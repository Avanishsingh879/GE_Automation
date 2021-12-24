package com.test.stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
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
	public UIElement logoutimg = new UIElement("logoutimg", IdentifyBy.XPATH, "//*[@id=\"meControlLinks\"]/div[3]");

	
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
	}
	
	/*
	 * Function: 		loginPage
	 * Description:		To verify title of the login page	
	*/
		@Then("^User Enter Username and Password by click on Login Button$")
		public void User_Enter_Username_and_Password_by_click_on_Login_Button() throws Throwable {
				
			    Thread.sleep(5000);
				
		    	
			
		}
	
	
	
}

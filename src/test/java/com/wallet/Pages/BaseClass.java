package com.wallet.Pages;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.wallet.utility.BrowserFactory;
import com.wallet.utility.ConfigDataProvider;


public class BaseClass {
	public static WebDriver driver;
	public static ConfigDataProvider config;

	
	@BeforeSuite
	public void SetupSuite() throws Exception
	{
		Reporter.log("Settings are getting started", true);		
		config=new ConfigDataProvider();
		Reporter.log("Settings completed", true);
		
	}
	

	@AfterClass
	public void teardown()
	{
		Reporter.log("Application shutting down", true);
		BrowserFactory.quitBrowser(driver);
		Reporter.log("Application closed", true);
		
	}
	
	
	

	
}

package com.wallet.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver(option);
			
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			
		}
		else 
		{
			System.out.println("We don't support this Browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.get(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
		
	}

}

package com.wallet.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;


import com.wallet.Pages.BaseClass;
import com.wallet.Pages.Facebook_Login_Page;
import com.wallet.utility.BrowserFactory;

public class Facebook_Login_TestCase extends BaseClass {
	public static Facebook_Login_Page facebook_login_page;
	
	@Test(priority=1)
	public void LoginFacebook()
	{
		Reporter.log("Facebook Login Test Case Started", true);
		driver=BrowserFactory.startApplication(driver, config.getBrowser(), config.getURL());
		facebook_login_page=PageFactory.initElements(driver, Facebook_Login_Page.class);
		facebook_login_page.LogintoFacebook(config.getUserName(), config.getPassWord());
		Reporter.log("Facebook Login Test Case completed", true);
		
		System.out.println("Hello World");
	}

}

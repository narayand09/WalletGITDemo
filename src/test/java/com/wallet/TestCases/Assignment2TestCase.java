package com.wallet.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.wallet.Pages.Assignment2;
import com.wallet.Pages.BaseClass;

import com.wallet.utility.BrowserFactory;

public class Assignment2TestCase extends BaseClass {
	public static Assignment2 assignment2;

	@Test(priority=2)
	public void Assignment2TestCase()
	{
		Reporter.log("Assignment 2 Test Case Started", true);
		driver=BrowserFactory.startApplication(driver, config.getBrowser(), config.getURL2());
		assignment2=PageFactory.initElements(driver, Assignment2.class);
		assignment2.loginWalletHub(config.getWalletUserName(), config.getWalletPassWord());
		driver.navigate().to(config.getURL2());
		assignment2.postRating();
		assignment2.writeReview(config.getReviewText());
		assignment2.loginWalletHub2(config.getWalletUserName(), config.getWalletPassWord());
		Reporter.log("Assignment 2 Test Case completed", true);
	}
}

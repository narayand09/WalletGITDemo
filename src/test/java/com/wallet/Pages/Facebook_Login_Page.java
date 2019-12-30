package com.wallet.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wallet.utility.BrowserFactory;

public class Facebook_Login_Page extends BaseClass{
	
	WebDriver driver;
	
	public Facebook_Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(id="email") WebElement uname;
	@FindBy(id="pass") WebElement pass;
	@FindBy(id="u_0_a") WebElement loginbtn;
	
	
	public void LogintoFacebook(String username, String password) 
	{
		
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginbtn.click();
		
	}

}

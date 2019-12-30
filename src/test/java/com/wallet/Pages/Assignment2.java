package com.wallet.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {
	
WebDriver driver;
	
	public Assignment2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//span[text()='Login']") WebElement LoginLink;
	@FindBy(name="em") WebElement emailaddress;
	@FindBy(name="pw") WebElement pass;
	@FindBy(xpath="//span[contains(text(),'Login')]") WebElement loginbtn;
	@FindBy(xpath="//*[text()='Your Rating']/following::*[@class='rvs-star-svg'][1]") WebElement FirstStar;
	@FindBy(xpath="//*[text()='Your Rating']/following::*[@class='rvs-star-svg'][5]") WebElement FifththStar;
	@FindBy(xpath="//*[@class='dropdown-placeholder'][text()='Select...']") WebElement InsuranceType;
	@FindBy(xpath="//*[@class='dropdown-placeholder'][text()='Select...']/following::li[@class='dropdown-item'][text()='Health Insurance']") WebElement ItemHealth;
	@FindBy(xpath="//*[@class='textarea wrev-user-input validate']") WebElement ReviewTxt;
	@FindBy(xpath="//*[text()='Submit']") WebElement submitbtn;
	@FindBy(xpath="//a[text()='Login']") WebElement LoginLink1;
	@FindBy(name="em") WebElement emailaddress1;
	@FindBy(name="pw1") WebElement pass1;
	@FindBy(xpath="//button[@type='button']") WebElement loginbtn1;
	

public void loginWalletHub(String Username, String Passwd)
{
	LoginLink.click();
	emailaddress.sendKeys(Username);
	pass.sendKeys(Passwd);
	loginbtn.click();
}

public void loginWalletHub2(String Username, String Passwd)
{
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement	element = wait.until(ExpectedConditions.elementToBeClickable(LoginLink1));
	LoginLink1.click();
	emailaddress1.sendKeys(Username);
	pass1.sendKeys(Passwd);
	loginbtn1.click();
}

public void writeReview(String ReviewText)
{
	
	InsuranceType.click();
	ItemHealth.click();
	ReviewTxt.sendKeys(ReviewText);
	submitbtn.click();
}

public void postRating()
{
	
	((JavascriptExecutor)driver).executeScript("scroll(0,800)");
	Actions action=new Actions(driver);
	action.moveToElement(FirstStar).build().perform();
	action.moveToElement(FifththStar).click().build().perform();
	
}

}

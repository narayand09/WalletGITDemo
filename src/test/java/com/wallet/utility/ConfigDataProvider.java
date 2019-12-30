package com.wallet.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties prop;
	public ConfigDataProvider()
	{
		File src=new File("./Config/Config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unable to load the File");
		}
		
		
		
	}
	
	public String getURL()
	{
		return prop.getProperty("url");
	}
	public String getURL2()
	{
		return prop.getProperty("url2");
	}
	
	public String getBrowser()
	{
		return prop.getProperty("Browser");
	}
	
	public String getDataFromConfig(String KeyToSearch)
	{
		return prop.getProperty(KeyToSearch);
	}
	
	public String getUserName()
	{
		return prop.getProperty("username");
	}
	
	public String getPassWord()
	{
		return prop.getProperty("password");
	}
	
	
	public String getWalletUserName()
	{
		return prop.getProperty("WalletUserName");
	}
	
	public String getWalletPassWord()
	{
		return prop.getProperty("WalletPassword");
	}

	public String getReviewText()
	{
		return prop.getProperty("ReviewText");
	}
}

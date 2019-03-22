package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="//*[@id=\"username\"]")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="/html/body/div[1]/section/div/section/div/div/div[2]/div[3]/form[1]/div[3]/button")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	
	
	public void setUserName(String username)
	{
		txtUserName.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
	
}










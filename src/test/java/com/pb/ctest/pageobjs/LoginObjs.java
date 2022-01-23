package com.pb.ctest.pageobjs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pb.ctest.helper.TestBase;

public class LoginObjs 
{
	@FindBy(xpath="//a[@href='/user/login']")
	public WebElement loginLnk;
	
	public LoginObjs(TestBase base)
	{
	    PageFactory.initElements(base.getDriver(), this);
	}
	
	public void clickLoginLnk()
	{
		loginLnk.click();
	}
}

package com.pb.ctest.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pb.ctest.helper.TestBase;
import com.pb.ctest.pageobjs.LoginObjs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSD 
{
	TestBase base;
	WebDriver driver;
	LoginObjs loginObj;
	
	public LoginSD(TestBase base)
	{
		this.base = base;
		this.driver = base.getDriver();
		loginObj = new LoginObjs(base);
	}

	@When("I click on Login link")
	public void i_click_on_shop_now_btn() 
	{
		loginObj.clickLoginLnk();
	}
}

package com.pb.ctest.steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.service.ExtentTestManager;
import com.pb.ctest.helper.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks
{
	WebDriver driver;
	TestBase base;
	
	public Hooks(TestBase base)
	{
		this.base = base;
	}
	
	public String getBase64Screenshot()
	{
		return ((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
	
	@Before
	public void bf()
	{
		base.setDriver();
	}
	
    	
	@After
	public void af(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());
		}
		base.getDriver().quit();
	}
	
}

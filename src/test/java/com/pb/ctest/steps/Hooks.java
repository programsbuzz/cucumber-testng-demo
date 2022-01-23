package com.pb.ctest.steps;

import org.openqa.selenium.WebDriver;

import com.pb.ctest.helper.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{
	WebDriver driver;
	TestBase base;
	
	public Hooks(TestBase base)
	{
		this.base = base;
	}
	
	@Before
	public void bf()
	{
		base.setDriver();
	}
	
	@After
	public void af()
	{
		base.getDriver().quit();
	}
	
}

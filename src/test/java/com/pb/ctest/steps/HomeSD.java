package com.pb.ctest.steps;

import org.openqa.selenium.WebDriver;

import com.pb.ctest.helper.TestBase;
import com.pb.ctest.pageobjs.HomeObjs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSD 
{
	private TestBase base;
	HomeObjs homeObj;
	WebDriver driver;
	
	public HomeSD(TestBase base)
	{
		this.base = base;
		this.driver = base.getDriver();
		homeObj = new HomeObjs(base);
	}
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable 
	{
		driver.get("https://www.programsbuzz.com/");
	}
}

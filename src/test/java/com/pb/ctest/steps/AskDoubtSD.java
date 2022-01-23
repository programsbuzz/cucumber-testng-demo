package com.pb.ctest.steps;

import org.openqa.selenium.WebDriver;

import com.pb.ctest.helper.TestBase;
import com.pb.ctest.pageobjs.AskDoubtObjs;
import com.pb.ctest.pageobjs.LoginObjs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AskDoubtSD 
{
	TestBase base;
	WebDriver driver;
	AskDoubtObjs askDoubtObj;
	
	public AskDoubtSD(TestBase base)
	{
		this.base = base;
		this.driver = base.getDriver();
		askDoubtObj = new AskDoubtObjs(base);
	}

	@When("I click on Ask Doubt Link")
	public void i_click_on_ask_doubt_link() 
	{
		askDoubtObj.clickOnAskDoubtLnk();
	}

}

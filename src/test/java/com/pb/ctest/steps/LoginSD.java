package com.pb.ctest.steps;

import org.openqa.selenium.By;

import com.pb.ctest.helper.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSD extends TestBase
{
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable 
	{
	    driver.get("http://www.automationpractice.com");
	}

	@And("^I follow \"([^\"]*)\" link$")
	public void i_follow_something_link(String strArg1) throws Throwable 
	{
	    driver.findElement(By.linkText("Sign in")).click();
	}

	@When("^I fill in username with \"([^\"]*)\"$")
	public void i_fill_in_username_with_something(String strArg1) throws Throwable 
	{
	    driver.findElement(By.cssSelector("input[id='email']")).sendKeys("goswami.tarun77@gmail.com");
	}

	@And("^I fill in password with \"([^\"]*)\"$")
	public void i_fill_in_password_with_something(String strArg1) throws Throwable 
	{
	    driver.findElement(By.cssSelector("input[id='passwd']")).sendKeys("123456");
	}

	@And("^I click on Sign in button$")
	public void i_click_on_sign_in_button() throws Throwable 
	{
	    driver.findElement(By.cssSelector("button[id='SubmitLogin']")).click();
	}

}

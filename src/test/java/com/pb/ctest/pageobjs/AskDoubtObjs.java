package com.pb.ctest.pageobjs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pb.ctest.helper.TestBase;

public class AskDoubtObjs 
{
	@FindBy(css="a[href='/ask-doubt']")
	public WebElement askDoubtLnk;
	
	public AskDoubtObjs(TestBase base)
	{
	    PageFactory.initElements(base.getDriver(), this);
	}
	
	public void clickOnAskDoubtLnk()
	{
		askDoubtLnk.click();
	}
}

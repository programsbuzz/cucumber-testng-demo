package com.pb.ctest.pageobjs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pb.ctest.helper.TestBase;

public class HomeObjs 
{	
	@FindBy(xpath="(//div[@class='slider-contain']//a)[3]")
	public WebElement shopNowBtn;
	
	
	public HomeObjs(TestBase base)
	{
	    PageFactory.initElements(base.getDriver(), this);
	}
	
	public void clickShopNowBtn()
	{
		shopNowBtn.click();
	}

}

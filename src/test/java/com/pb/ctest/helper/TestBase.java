package com.pb.ctest.helper;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase 
{
	public static WebDriver driver=null;

	public void setUpDriver()
	{
		System.setProperty("webdriver.chrome.driver",Constants.MAC_CHROME_DRIVER);
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
       
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    public void closeDriver()
    {
        driver.quit();
    }

}

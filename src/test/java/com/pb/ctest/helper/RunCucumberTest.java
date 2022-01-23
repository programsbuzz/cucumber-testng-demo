package com.pb.ctest.helper;

import org.testng.annotations.Listeners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
        tags = (Constants.TAGS),
        glue = {Constants.GLUE}, 
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {Constants.FEATURES})

//@Listeners({ExtentITestListenerClassAdapter.class})
public class RunCucumberTest extends AbstractTestNGCucumberTests 
{	

}

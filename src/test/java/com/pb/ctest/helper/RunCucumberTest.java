package com.pb.ctest.helper;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
        tags = ("@SmokeTest"),
//        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        glue = {Constants.GLUE}, 
        features = {Constants.FEATURES})

public class RunCucumberTest extends AbstractTestNGCucumberTests 
{	

}

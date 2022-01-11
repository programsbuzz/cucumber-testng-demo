package com.pb.ctest.helper;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
        tags = (Constants.TAGS),
        glue = {Constants.GLUE}, 
        features = {Constants.FEATURES})

public class RunCucumberTest extends AbstractTestNGCucumberTests 
{	

}

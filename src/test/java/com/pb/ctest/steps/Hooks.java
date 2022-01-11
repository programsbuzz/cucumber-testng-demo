package com.pb.ctest.steps;

import com.pb.ctest.helper.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{
	TestBase tb = new TestBase();
	
    @Before
    public void before() 
    {
        tb.setUpDriver();		
    }	

    @After
    public void after()
    {
        tb.closeDriver();
    }
}

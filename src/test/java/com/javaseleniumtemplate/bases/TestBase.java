package com.javaseleniumtemplate.bases;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.utils.DriverFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestBase {
    @BeforeSuite
    public void beforeSuite(){
        new GlobalParameters();
    }

    @BeforeMethod
    public void beforeTest(Method method){
        DriverFactory.createInstance();
        DriverFactory.INSTANCE.manage().window().maximize();
        DriverFactory.INSTANCE.navigate().to(GlobalParameters.URL_DEFAULT);
    }

    @AfterMethod
    public void afterTest(ITestResult result){
        DriverFactory.quitInstace();
    }

    @AfterSuite
    public void afterSuite(){
    }
}

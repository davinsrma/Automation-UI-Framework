package com.demoQATest;

import com.aventstack.extentreports.Status;
import com.sample.demoQAPageFactory.DemoAlertFrameWindowPage;
import com.sample.util.baseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DemoQAalertFrameWindowTest  extends baseClass {

    DemoAlertFrameWindowPage demoAlertFrameWindowPage;

    @Test
    public void alertFrameWindowComponentsTest(Method method){
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

        demoAlertFrameWindowPage= PageFactory.initElements(baseClass.driver, DemoAlertFrameWindowPage.class);

        demoAlertFrameWindowPage.clickAlertFrameWindowButton();

    }

}

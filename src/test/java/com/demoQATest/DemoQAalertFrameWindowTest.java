package com.demoQATest;

import com.aventstack.extentreports.Status;
import com.sample.demoQAPageFactory.DemoAlertFrameWindowPage;
import com.sample.util.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DemoQAalertFrameWindowTest  extends BaseClass {

    DemoAlertFrameWindowPage demoAlertFrameWindowPage;

//    @Test
    public void alertFrameWindowComponentsTest(Method method) throws InterruptedException {
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

        demoAlertFrameWindowPage= PageFactory.initElements(BaseClass.driver, DemoAlertFrameWindowPage.class);

        demoAlertFrameWindowPage.clickAlertFrameWindowButton();

        demoAlertFrameWindowPage.clickBrowserWindow();
        demoAlertFrameWindowPage.clickNewTabButton();
        demoAlertFrameWindowPage.clickNewWindowButton();
        demoAlertFrameWindowPage.clickNewWindowMessageButton();
    }

//    @Test
    public void alertClicksAndValidation(Method method) throws InterruptedException {
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

        demoAlertFrameWindowPage= PageFactory.initElements(BaseClass.driver, DemoAlertFrameWindowPage.class);

        demoAlertFrameWindowPage.clickAlertFrameWindowButton();
        demoAlertFrameWindowPage.clickAlertButton();

        demoAlertFrameWindowPage.clickButton1AndAcceptAlert();
        demoAlertFrameWindowPage.clickButton2AndWaitForAlertToApper();
        demoAlertFrameWindowPage.clickButton3AndSelectOK();
        demoAlertFrameWindowPage.clickButton4AndSendValue("Hello");
    }

    @Test
    public void switching_Frames_And_Fetching_Frame_Value(Method method) throws InterruptedException {
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

        demoAlertFrameWindowPage= PageFactory.initElements(BaseClass.driver, DemoAlertFrameWindowPage.class);

        demoAlertFrameWindowPage.clickAlertFrameWindowButton();
        demoAlertFrameWindowPage.clickOnFrame();
        demoAlertFrameWindowPage.fetchFrameContent1();
        Thread.sleep(2000);
        demoAlertFrameWindowPage.fetchFrameContent2();
        Thread.sleep(2000);
    }

}

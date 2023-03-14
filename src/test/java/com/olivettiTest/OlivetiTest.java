package com.olivettiTest;

import com.aventstack.extentreports.Status;
import com.sample.olivettiPlusPageFactory.OlivetiHomePage;
import com.sample.util.testBed;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class OlivetiTest extends testBed {

    @Test
    public void clickVideo(Method method) throws InterruptedException {

        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

        OlivetiHomePage hp= PageFactory.initElements(testBed.driver,OlivetiHomePage.class);
        hp.click2ndVideo();
        Thread.sleep(3000);
    }
}

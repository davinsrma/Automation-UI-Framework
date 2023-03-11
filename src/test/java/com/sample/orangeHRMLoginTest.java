package com.sample;

import com.aventstack.extentreports.Status;
import com.sample.util.custUtil;
import com.sample.util.propertyUtil;
import com.sample.util.testBed;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class orangeHRMLoginTest extends testBed {

    @Test
    public void login(Method method) throws InterruptedException {
        String email = propertyUtil.getProperty(getEnvFilePath(), "uname");
        String pwd = propertyUtil.getProperty(getEnvFilePath(), "pwd");
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());
        custUtil util=new custUtil();
        objLogin.Login(email, pwd);
        objHome.clickLogout();
        Thread.sleep(3000);
    }
}

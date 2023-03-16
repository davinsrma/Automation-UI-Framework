package com.demoQATest;

import com.aventstack.extentreports.Status;
import com.sample.demoQAPageFactory.QADemoElementPage;
import com.sample.util.testBed;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class QADemoElementTest extends testBed {
    QADemoElementPage qaHomePage;
    FileInputStream fis;
    Properties properties;



//    @Test
    public void fillTextBoxFullAndValidate(Method method) throws InterruptedException, IOException, AWTException {
        qaHomePage= PageFactory.initElements(testBed.driver, QADemoElementPage.class);

        fis=new FileInputStream("./src/test/resources/data.properties");
        properties=new Properties();
        properties.load(fis);
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

        qaHomePage.clickTextBox();
        qaHomePage.fillTextBox(properties.getProperty("userName"),properties.getProperty("email"),properties.getProperty("currentAdd"),properties.getProperty("permanentAdd"));
        Reporter.log("Text Box Filled with given details");
        qaHomePage.clickSubmit();
        Assert.assertEquals(qaHomePage.getUsername(),"Name:"+properties.getProperty("userName"));
        Assert.assertEquals(qaHomePage.getEmail(),"Email:"+properties.getProperty("email"));
    }

//    @Test
    public void clickCheckBoxThenExcelAndValidate(Method method){
        qaHomePage= PageFactory.initElements(testBed.driver, QADemoElementPage.class);
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

        qaHomePage.clickCheckboxButton();
        qaHomePage.clickDropdownHome();
        qaHomePage.clickDropdownDownload();
        qaHomePage.clickExcelFile();
        Assert.assertEquals(qaHomePage.getExcelClickValue(),"excelFile");
        Reporter.log("ClickCheckBox and Select Excel Validation Completed");
    }

//    @Test
    public void clickRadioButtonAndImpressiveButtonAndValidate(Method method){
        qaHomePage= PageFactory.initElements(testBed.driver, QADemoElementPage.class);
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

        qaHomePage.clickRadioButton();
        qaHomePage.clickImpressiveRadioButton();

        Assert.assertEquals(qaHomePage.fetchImpressiveButtonText(),"Impressive");
    }
//    @Test
    public void clickWebTableAndFillRegistrationFormAndSubmit(Method method) throws IOException, InterruptedException {
        qaHomePage= PageFactory.initElements(testBed.driver, QADemoElementPage.class);

        fis=new FileInputStream("./src/test/resources/data.properties");
        properties=new Properties();
        properties.load(fis);
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

        qaHomePage.clickWebTableButton();
        qaHomePage.clickAddButton();
        qaHomePage.fillRegistrationForm(properties.getProperty("firstName"),properties.getProperty("lastName"),
                properties.getProperty("email"),properties.getProperty("age"),properties.getProperty("salary"),properties.getProperty("department"));
        qaHomePage.submitRegistrationForm();
        Thread.sleep(10000);

    }

//    @Test
    public void singleDoubleRightClickAndValidation(Method method) throws InterruptedException {
        qaHomePage= PageFactory.initElements(testBed.driver, QADemoElementPage.class);
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

        qaHomePage.clickOnButtons();
        qaHomePage.doubleClickOnDoubleClickMeButton();
        Assert.assertEquals(qaHomePage.doubleClickValidation(),"You have done a double click");
        qaHomePage.rightClickMe();
        Assert.assertEquals(qaHomePage.setRightClickValidation(),"You have done a right click");
        qaHomePage.singleClick();
        Assert.assertEquals(qaHomePage.sigleClickValidation(),"You have done a dynamic click");
    }
    @Test
    public void clickUploadAndDownloadThenDownloadAndUploadAFile(Method method) throws InterruptedException, AWTException {
        qaHomePage= PageFactory.initElements(testBed.driver, QADemoElementPage.class);
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

        qaHomePage.clickUploadAndDownloadButton();
        qaHomePage.setClickToDownload();
        qaHomePage.setClickToUpload();

    }

}

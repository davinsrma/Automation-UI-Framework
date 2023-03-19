package com.demoQATest;

import com.aventstack.extentreports.Status;
import com.sample.demoQAPageFactory.DemoQAFormsPage;
import com.sample.util.custUtil;
import com.sample.util.excelUtil;
import com.sample.util.testBed;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Method;

public class DemoQAFormsPageTest extends testBed {
    DemoQAFormsPage demoQAFormsPage;




    @Test(dataProvider = "dataForApplicationForm")
    public void Application(Method method,String firstname,String lastname, String email,String gender, String mobile, String dob,String subject, String hobbies, String currentAdd,String state,String city) throws AWTException, InterruptedException {
        demoQAFormsPage= PageFactory.initElements(testBed.driver,DemoQAFormsPage.class);
        test = extent.createTest(method.getName());
        test.log(Status.INFO, "The thread ID for method: " + method.getName() + "browser: " + TestBedBrowser + " is " + Thread.currentThread().getId());

//        Actions actions = new Actions(driver);
//        actions.keyDown(Keys.CONTROL).sendKeys("-").keyUp(Keys.CONTROL).build().perform();
//        actions.keyDown(Keys.CONTROL).sendKeys("-").keyUp(Keys.CONTROL).build().perform();
//        actions.keyDown(Keys.CONTROL).sendKeys("-").keyUp(Keys.CONTROL).build().perform();
//        actions.keyDown(Keys.CONTROL).sendKeys("-").keyUp(Keys.CONTROL).build().perform();


        demoQAFormsPage.clickFormsButton();
        Reporter.log("Forms Button Clicked");
        demoQAFormsPage.clickPracticeFormButton();
        Reporter.log("Practice Form Button Clicked");

        demoQAFormsPage.enterFirstName(firstname);
        demoQAFormsPage.enterLastName(lastname);
        demoQAFormsPage.enterEmail(email);

        if(gender.equalsIgnoreCase("male")){
            demoQAFormsPage.clickMaleRadioButton();
        }else if(gender.equalsIgnoreCase("female")){
            demoQAFormsPage.clickFemailRadioButton();
        }else if(gender.equalsIgnoreCase("others")){
            demoQAFormsPage.clickOtherRadioButton();
        }
        demoQAFormsPage.setMobileNumber(mobile);
//        Format in not taking correctly. Need to verify again
//        demoQAFormsPage.setDob(dob);

//        demoQAFormsPage.setSubjectsTextBox(subject);

        if(hobbies.equalsIgnoreCase("sports")){
            demoQAFormsPage.setClickSportsCheckBox();
        }else if(hobbies.equalsIgnoreCase("reading")){
            demoQAFormsPage.setReadingCheckBox();
        }else if(hobbies.equalsIgnoreCase("music")){
            demoQAFormsPage.setMusicCheckBox();
        }else{
            Reporter.log("Some of the Hobbies parameters are incorrect");
        }
        demoQAFormsPage.setCurrentAddressBox(currentAdd);

//        demoQAFormsPage.selectState(state);
//        demoQAFormsPage.selectCity(city);
//        demoQAFormsPage.setSubmit();

    }

    @DataProvider(name = "dataForApplicationForm")
    public Object[][] dataForApplicationForm() throws IOException {
        Object[][] data2=excelUtil.ReadDataFromExcelFile("./src/test/resources/userDataInformation.xlsx","data2");
        return data2;
    }


}

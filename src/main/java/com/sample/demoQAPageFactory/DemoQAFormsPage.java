package com.sample.demoQAPageFactory;

import com.sample.util.custUtil;
import com.sample.util.baseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class DemoQAFormsPage extends baseClass{
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    custUtil custUtil= new custUtil();


    @FindBy(xpath = "//div[@class='home-body']//div[2]//div[1]//div[1]")
    WebElement formsButton;
    @FindBy(xpath = "//span[normalize-space()='Practice Form']")
    WebElement practiceFormsButton;

    public void clickFormsButton(){
        wait.until(ExpectedConditions.visibilityOf(formsButton));
        wait.until(ExpectedConditions.elementToBeClickable(formsButton));
        try{
            custUtil.scrollToElement(driver,formsButton);
        }catch (Exception e){
            e.printStackTrace();
        }
        formsButton.click();
    }
    public void clickPracticeFormButton(){
        wait.until(ExpectedConditions.visibilityOf(practiceFormsButton));
        wait.until(ExpectedConditions.elementToBeClickable(practiceFormsButton));
        practiceFormsButton.click();
    }

    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement Email;

    public void enterFirstName(String firstname){
        wait.until(ExpectedConditions.visibilityOf(firstName));
        wait.until(ExpectedConditions.elementToBeClickable(firstName));
        firstName.clear();
        firstName.sendKeys(firstname);
    }
    public void enterLastName(String lastname){
        wait.until(ExpectedConditions.visibilityOf(lastName));
        wait.until(ExpectedConditions.elementToBeClickable(lastName));
        lastName.clear();
        lastName.sendKeys(lastname);
    }
    public void enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOf(Email));
        wait.until(ExpectedConditions.elementToBeClickable(Email));
        Email.clear();
        Email.sendKeys(email);
    }

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    WebElement maleRadioButton;
    @FindBy(xpath = "//label[@for='gender-radio-2']")
    WebElement femaleRadioButton;
    @FindBy(xpath = "//label[@for='gender-radio-3']")
    WebElement otherRadioButton;

    public void clickMaleRadioButton(){
        wait.until(ExpectedConditions.visibilityOf(maleRadioButton));
        wait.until(ExpectedConditions.elementToBeClickable(maleRadioButton));
        maleRadioButton.click();
    }
    public void clickFemailRadioButton(){
        wait.until(ExpectedConditions.visibilityOf(femaleRadioButton));
        wait.until(ExpectedConditions.elementToBeClickable(femaleRadioButton));
        femaleRadioButton.click();
    }
    public void clickOtherRadioButton(){
        wait.until(ExpectedConditions.visibilityOf(otherRadioButton));
        wait.until(ExpectedConditions.elementToBeClickable(otherRadioButton));
        otherRadioButton.click();
    }

    @FindBy(id = "userNumber")
    WebElement mobileNumber;
    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    WebElement dob1;
    @FindBy(id = "subjectsContainer")
    WebElement subjectsTextBox;
    public void setMobileNumber(String number){
        wait.until(ExpectedConditions.visibilityOf(mobileNumber));
        wait.until(ExpectedConditions.elementToBeClickable(mobileNumber));
        mobileNumber.clear();
        mobileNumber.sendKeys(number);
    }
    public void setDob(String dob){
        wait.until(ExpectedConditions.visibilityOf(dob1));
        wait.until(ExpectedConditions.elementToBeClickable(dob1));
        dob1.clear();
        dob1.sendKeys(dob);

    }

    public void setSubjectsTextBox(String subject1) throws AWTException, InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(subjectsTextBox));
        wait.until(ExpectedConditions.elementToBeClickable(subjectsTextBox));
        try {
            custUtil.scrollToElement(driver,subjectsTextBox);
        }catch (Exception e){
            e.printStackTrace();
        }
        subjectsTextBox.click();

        subjectsTextBox.sendKeys(subject1);

    }

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    WebElement sportsCheckBox;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    WebElement readingCheckBox;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    WebElement musicCheckBox;

    public void setClickSportsCheckBox(){
        wait.until(ExpectedConditions.visibilityOf(sportsCheckBox));
        wait.until(ExpectedConditions.elementToBeClickable(sportsCheckBox));
        custUtil.scrollToElement(driver,sportsCheckBox);

        sportsCheckBox.click();
    }
    public void setReadingCheckBox(){
        wait.until(ExpectedConditions.visibilityOf(readingCheckBox));
        wait.until(ExpectedConditions.elementToBeClickable(readingCheckBox));

            custUtil.scrollToElement(driver,readingCheckBox);

        readingCheckBox.click();
    }
    public void setMusicCheckBox(){
        wait.until(ExpectedConditions.visibilityOf(musicCheckBox));
        wait.until(ExpectedConditions.elementToBeClickable(musicCheckBox));

        custUtil.scrollToElement(driver,musicCheckBox);

        musicCheckBox.click();
    }




    @FindBy(id = "currentAddress")
    WebElement currentAddressBox;
    public void setCurrentAddressBox(String address){
        wait.until(ExpectedConditions.visibilityOf(currentAddressBox));
        wait.until(ExpectedConditions.elementToBeClickable(currentAddressBox));

            custUtil.scrollToElement(driver,currentAddressBox);

            currentAddressBox.sendKeys(address);
    }
    @FindBy(id = "state")
    WebElement stateDropDown;
    @FindBy(xpath = "//*[@id=\"stateCity-wrapper\"]/div[3]")
    WebElement cityDropDown;

    public void selectState(String state1){
        wait.until(ExpectedConditions.visibilityOf(stateDropDown));
        wait.until(ExpectedConditions.elementToBeClickable(stateDropDown));
        try{
            custUtil.scrollToElement(driver,stateDropDown);
//            custUtil.pageScrollDown(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
        stateDropDown.click();
        Select select=new Select(stateDropDown);
        select.selectByVisibleText(state1);
    }
    public void selectCity(String city){
        wait.until(ExpectedConditions.visibilityOf(cityDropDown));
        wait.until(ExpectedConditions.elementToBeClickable(cityDropDown));
        try{
            custUtil.scrollToElement(driver,cityDropDown);
        }catch (Exception e){
            e.printStackTrace();
        }
        cityDropDown.click();
//        dropdown=new Select(cityDropDown);
//        dropdown.selectByVisibleText(city);
    }

    @FindBy(id = "submit")
    WebElement submit;

    public void setSubmit(){
        wait.until(ExpectedConditions.visibilityOf(submit));
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        try {

            custUtil.pageScrollDown(driver);
//            custUtil.scrollToElement(driver,submit);
        }catch (Exception e){
            e.printStackTrace();
        }
        ((JavascriptExecutor) baseClass.driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        submit.click();
    }
}

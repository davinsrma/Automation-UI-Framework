package com.sample.demoQAPageFactory;

import com.sample.util.custUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.sample.util.testBed.driver;

public class DemoQAFormsPage {
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    com.sample.util.custUtil custUtil=new custUtil();
    Actions actions=new Actions(driver);

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]")
    WebElement formsButton;
    @FindBy(xpath = "//span[normalize-space()='Practice Form']")
    WebElement practiceFormsButton;

    public void clickFormsButton(){
        wait.until(ExpectedConditions.visibilityOf(formsButton));
        wait.until(ExpectedConditions.elementToBeClickable(formsButton));
        custUtil.scrollToElement(driver,formsButton);
        formsButton.click();
    }
    public void clickPracticeFormButton(){
        wait.until(ExpectedConditions.visibilityOf(practiceFormsButton));
        wait.until(ExpectedConditions.elementToBeClickable(practiceFormsButton));
        custUtil.scrollToElement(driver,practiceFormsButton);
        practiceFormsButton.click();
    }

    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement email;
    @FindBy(xpath = "//label[@for='gender-radio-1']")
    WebElement maleRadioButton;
    @FindBy(xpath = "//label[@for='gender-radio-2']")
    WebElement femaleRadioButton;
    @FindBy(xpath = "//label[@for='gender-radio-3']")
    WebElement otherRadioButton;
    @FindBy(id = "userNumber")
    WebElement mobileNumber;
    @FindBy(id = "subjectsContainer")
    WebElement subjectsTextBox;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    WebElement sportsCheckBox;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    WebElement readingCheckBox;
    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    WebElement musicCheckBox;
    @FindBy(id = "currentAddress")
    WebElement currentAddressBox;
    @FindBy(xpath = "//div[@id='state']//div[@class=' css-1hwfws3']")
    WebElement stateDropDown;
    @FindBy(xpath = "//div[@id='city']//div[contains(@class,'css-1hwfws3')]")
    WebElement cityDropDown;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement submit;

}

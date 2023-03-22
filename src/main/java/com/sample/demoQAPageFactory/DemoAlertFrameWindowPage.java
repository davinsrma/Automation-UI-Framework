package com.sample.demoQAPageFactory;

import com.sample.util.baseClass;
import com.sample.util.custUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoAlertFrameWindowPage extends baseClass {
    custUtil custUtil=new custUtil();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

    @FindBy(xpath = "//div[3]//div[1]//div[2]//*[name()='svg']")
    WebElement alertFrameWindowButton;

    @FindBy(xpath = "//button[@id='tabButton']")
    WebElement newTabButton;

    @FindBy(xpath = "//button[@id='windowButton']")
    WebElement newWindowButton;

    @FindBy(xpath = "//button[@id='messageWindowButton']")
    WebElement newWindowMessageButton;

    public void clickAlertFrameWindowButton(){

            wait.until(ExpectedConditions.visibilityOf(alertFrameWindowButton));
            wait.until(ExpectedConditions.elementToBeClickable(alertFrameWindowButton));

            custUtil.scrollToElement(driver, alertFrameWindowButton);
            alertFrameWindowButton.click();

    }


}

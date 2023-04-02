package com.sample.demoQAPageFactory;

import com.sample.util.BaseClass;
import com.sample.util.CustUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class DemoAlertFrameWindowPage extends BaseClass {
    WebDriverWait wait=new WebDriverWait(BaseClass.driver, Duration.ofSeconds(TIMEOUT));

    @FindBy(xpath = "//div[3]//div[1]//div[2]//*[name()='svg']")
    WebElement alertFrameWindowButton;

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-0']")
    WebElement browserWindow;

    @FindBy(xpath = "//button[@id='tabButton']")
    WebElement newTabButton;

    @FindBy(xpath = "//button[@id='windowButton']")
    WebElement newWindowButton;

    @FindBy(xpath = "//button[@id='messageWindowButton']")
    WebElement newWindowMessageButton;

    public void clickAlertFrameWindowButton(){

            wait.until(ExpectedConditions.visibilityOf(alertFrameWindowButton));
            wait.until(ExpectedConditions.elementToBeClickable(alertFrameWindowButton));

            CustUtil.scrollToElement(driver, alertFrameWindowButton);
            CustUtil.highlightElement(driver,alertFrameWindowButton);
            alertFrameWindowButton.click();
    }
    public void clickBrowserWindow(){
        wait.until(ExpectedConditions.visibilityOf(browserWindow));
        wait.until(ExpectedConditions.elementToBeClickable(browserWindow));
        CustUtil.scrollToElement(driver, browserWindow);
        CustUtil.highlightElement(driver,browserWindow);
        browserWindow.click();
    }

    public void clickNewTabButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(newTabButton));
        wait.until(ExpectedConditions.elementToBeClickable(newTabButton));
        CustUtil.scrollToElement(driver, newTabButton);

        String originalTab= driver.getWindowHandle();
        CustUtil.highlightElement(driver,newTabButton);
        newTabButton.click();
        Set<String> tabs = driver.getWindowHandles();
        // Loop through handles to find new tab
        for(String tab : tabs) {
            if (!tab.equals(originalTab)) {
                // Switch to the new tab
                driver.switchTo().window(tab);

                driver.close();
                driver.switchTo().window(originalTab);
            }
        }
    }
    public void clickNewWindowButton(){
        wait.until(ExpectedConditions.visibilityOf(newWindowButton));
        wait.until(ExpectedConditions.elementToBeClickable(newWindowButton));
        String originalTab= driver.getWindowHandle();

        CustUtil.scrollToElement(driver, newWindowButton);
        CustUtil.highlightElement(driver,newWindowButton);
        newWindowButton.click();
        Set<String> tabs = driver.getWindowHandles();
        // Loop through handles to find new tab
        for(String tab : tabs) {
            if (!tab.equals(originalTab)) {
                // Switch to the new tab
                driver.switchTo().window(tab);

                driver.close();
                driver.switchTo().window(originalTab);

            }
        }
    }
    public void clickNewWindowMessageButton(){

        wait.until(ExpectedConditions.visibilityOf(newWindowMessageButton));
        wait.until(ExpectedConditions.elementToBeClickable(newWindowMessageButton));
        CustUtil.scrollToElement(driver, newWindowMessageButton);
        String originalTab= driver.getWindowHandle();
        CustUtil.highlightElement(driver,newWindowMessageButton);
        newWindowMessageButton.click();
        Set<String> tabs = driver.getWindowHandles();
        for(String tab : tabs) {
            if (!tab.equals(originalTab)) {
                // Switch to the new tab
                driver.switchTo().window(tab);
                driver.close();
                driver.switchTo().window(originalTab);
            }
        }
    }

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-1']")
    WebElement alertButton;

    @FindBy(id = "alertButton")
    WebElement clickButton1;
    @FindBy(id="timerAlertButton")
    WebElement clickButton2;
    @FindBy(id = "confirmButton")
    WebElement clickButton3;
    @FindBy(id = "promtButton")
    WebElement clickButton4;

    public void clickAlertButton(){
        wait.until(ExpectedConditions.visibilityOf(alertButton));
        wait.until(ExpectedConditions.elementToBeClickable(alertButton));
        CustUtil.scrollToElement(driver, alertButton);
        CustUtil.highlightElement(driver,alertButton);
        alertButton.click();
    }
    public void clickButton1AndAcceptAlert(){
        wait.until(ExpectedConditions.visibilityOf(clickButton1));
        wait.until(ExpectedConditions.elementToBeClickable(clickButton1));
        CustUtil.scrollToElement(driver, clickButton1);
        CustUtil.highlightElement(driver,clickButton1);
        clickButton1.click();
        CustUtil.acceptAlert();
    }
    public void clickButton2AndWaitForAlertToApper() throws InterruptedException {
        CustUtil.scrollToElement(driver, clickButton2);
        CustUtil.highlightElement(driver,clickButton2);
        clickButton2.click();
        Thread.sleep(6000);
        CustUtil.acceptAlert();
    }
    public void clickButton3AndSelectOK(){
        CustUtil.scrollToElement(driver, clickButton3);
        CustUtil.highlightElement(driver,clickButton3);
        clickButton3.click();
        CustUtil.acceptAlert();
    }
    public void clickButton4AndSendValue(String value) throws InterruptedException {
        CustUtil.scrollToElement(driver, clickButton4);
        CustUtil.highlightElement(driver,clickButton4);
        clickButton4.click();
        CustUtil.sendValueToAlert(value);
        CustUtil.acceptAlert();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//span[text()='Frames']")
    WebElement framesButton;

    public void clickOnFrame(){
        wait.until(ExpectedConditions.visibilityOf(framesButton));
        wait.until(ExpectedConditions.elementToBeClickable(framesButton));
        CustUtil.scrollToElement(driver, framesButton);
        framesButton.click();
    }
    @FindBy(id="frame1")
    WebElement frame1;
    @FindBy(xpath = "//h1[@id='sampleHeading']")
    WebElement frame1Value;

    public String fetchFrameContent1(){
        wait.until(ExpectedConditions.visibilityOf(frame1));
        CustUtil.switchFrame(frame1);
        String text=frame1Value.getText();
        return text;
    }
    @FindBy(id = "frame2")
    WebElement frame2;

    public String fetchFrameContent2(){
        wait.until(ExpectedConditions.visibilityOf(frame2));
        CustUtil.switchFrame(frame2);
        String text=frame1Value.getText();
        return text;
    }

}
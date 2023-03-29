package com.sample.demoQAPageFactory;

import com.sample.util.baseClass;
import com.sample.util.custUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class DemoAlertFrameWindowPage extends baseClass {
    custUtil custUtil=new custUtil();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

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

            custUtil.scrollToElement(driver, alertFrameWindowButton);
            custUtil.highlightElement(alertFrameWindowButton);
            alertFrameWindowButton.click();
    }
    public void clickBrowserWindow(){
        wait.until(ExpectedConditions.visibilityOf(browserWindow));
        wait.until(ExpectedConditions.elementToBeClickable(browserWindow));
        custUtil.scrollToElement(driver, browserWindow);
        custUtil.highlightElement(browserWindow);
        browserWindow.click();
    }

    public void clickNewTabButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(newTabButton));
        wait.until(ExpectedConditions.elementToBeClickable(newTabButton));
        custUtil.scrollToElement(driver, newTabButton);

        String originalTab= driver.getWindowHandle();
        custUtil.highlightElement(newTabButton);
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

        custUtil.scrollToElement(driver, newWindowButton);
        custUtil.highlightElement(newWindowButton);
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
        custUtil.scrollToElement(driver, newWindowMessageButton);
        String originalTab= driver.getWindowHandle();
        custUtil.highlightElement(newWindowMessageButton);
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
}
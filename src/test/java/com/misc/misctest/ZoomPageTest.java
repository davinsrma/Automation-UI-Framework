package com.misc.misctest;

import com.sample.util.custUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ZoomPageTest {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, AWTException {
        custUtil custUtil=new custUtil();
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_MINUS);
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("document.body.style.zoom='50%'");

        driver.quit();
    }
}

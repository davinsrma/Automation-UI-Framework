package com.sample.olivettiPlusPageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OlivetiHomePage {


    @FindBy(xpath = "//h3[@class='post-title entry-title']//a[contains(text(),'2. Self Test Olivetti PR2 Plus')]")
    public WebElement secondVideo;

    public void click2ndVideo() throws InterruptedException {
        secondVideo.click();
    }
}

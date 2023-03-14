package com.olivettiTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiments {

    public static void main(String[] args) throws InterruptedException {


//        @FindBy(xpath = "//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']")
//        private WebElement elementsButton;
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/");
        Thread.sleep(3000);
        try{
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]")).click();
        }catch (Exception e){

        }
        driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']")).click();
    }

}

package com.misc.misctest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

// To get all the clickable //a tag from page
public class ListPractice {

    private static WebDriver driver;
    private static List<WebElement> elements;
    private static Properties properties;
    private static FileOutputStream fileOutputStream;


    public static void main(String[] args) throws IOException {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(options);

        // Navigate to the website you want to test
        driver.get("https://www.google.com");
        properties=new Properties();
        fileOutputStream=new FileOutputStream("./src/test/resources/listOutput.properties");

        elements=driver.findElements(By.xpath("//a | //button"));
        for(WebElement element :elements){
            try{
                if(element.isDisplayed()){
                    properties.store(fileOutputStream,element.getText());
                    System.out.println(element.getText());
                }
            }catch (Exception e){
            }
        }
        driver.quit();
    }
}

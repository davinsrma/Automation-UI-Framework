package adHocTesting;

import com.sample.util.CustUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.List;

//Incomplete codes
public class ClickEachElement {
    private static WebDriver driver;

    public static void main(String[] args) {

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(options);

        // Navigate to the website you want to test
        driver.get("https://www.google.com");


        List<WebElement> elementsToClick = driver.findElements(By.xpath("//button"));
        for(WebElement element : elementsToClick) {
//            CustUtil.highlightElement(driver, element);
            element.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.navigate().back();

        }
        driver.quit();


    }
}

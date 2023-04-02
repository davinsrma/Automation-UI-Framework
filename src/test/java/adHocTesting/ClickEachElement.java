package adHocTesting;

import com.sample.util.CustUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
import java.util.List;

public class ClickEachElement {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // Navigate to the webpage
        driver.get("https://www.google.com");

        // Find all clickable elements on the page
        List<WebElement> clickableElements = driver.findElements(By.xpath("//a | //button"));

        // Click on each clickable element
        for (int i = 0; i < clickableElements.size(); i++) {
            // Find the element again to handle stale element reference exceptions
            clickableElements = driver.findElements(By.xpath("//a | //button"));

            WebElement element = clickableElements.get(i);
            try{
                CustUtil.highlightElement(driver, element);
                element.click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                driver.navigate().back();

            }catch (Exception e){
                System.out.println("Some elements are not clickable :"+element.getText());
            }
        }
        driver.quit();
    }
}

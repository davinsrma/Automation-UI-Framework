package adHocTesting;

import com.sample.util.CustUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.List;
import java.util.Random;
public class MonkeyTesting {
    private static WebDriver driver;
    private static List<WebElement> elements;
    private static WebElement ele;
    public static void main(String[] args) throws InterruptedException {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(options);

        // Navigate to the website you want to test
        driver.get("https://www.google.com");
        Random random = new Random();
        int countNotClicked=0;
        int countClicked=0;
        int countElementNotClicked=1;

//       To get all the name of web element


        elements = driver.findElements(By.xpath("//a"));
        for(int j=0;j<= elements.size();j++){
            try{
            ele= elements.get(j);
            if(ele.isEnabled() && ele.isDisplayed()){
            System.out.println(ele.getText());
                }
            }catch (Exception e){
                System.out.println(ele.getText());
                System.out.println("Some Exception"+countElementNotClicked++);
            }
        }

        for (int i=0 ;i<= elements.size();i++) {
        // Get a list of all clickable elements on the page
            elements = driver.findElements(By.xpath("//a"));
        // Click a random clickable element
            if (!elements.isEmpty()) {
                WebElement element = elements.get(random.nextInt(elements.size()));

                try{
                    CustUtil.highlightElement(driver, element);
                    element.click();
                    countClicked++;
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.navigate().back();
                }catch (Exception e){
                   countNotClicked++;
                }
            }
            Thread.sleep(random.nextInt(1000));
        }
        System.out.println("Not clickable elements are : "+countNotClicked);
        System.out.println("Clicked Element count is : "+countClicked);
        driver.quit();
    }
}

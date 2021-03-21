import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SeleniumSetup {

    public static WebDriver driver;
    public static double email;  //neznam zosto so int mi pravese problem
    public static int password;
    public static WebDriverWait wait;


    public static void test() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-88.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        email = System.currentTimeMillis();
        password = new Random().nextInt(1000000000);


    }

    public static void waitFor(int secconds) {
        try {
            Thread.sleep(secconds * 1000);
        } catch (InterruptedException e) {
        }
    }

    public static void clickOn(String elementXpath) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementXpath))).click();

    }

    public static void selectText(String elementXpath, String visibleText) {
        new Select(driver.findElement(By.xpath(elementXpath))).selectByVisibleText(visibleText);
    }

    public static void typeIn(String elementXpath, String text) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementXpath))).sendKeys(text);
    }

    public static String getText(String elementXpath) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementXpath))).getText();
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }

    public static void toUrl(String url) {
        driver.get(url);
    }


    public static void end() {
        driver.quit();
    }


}





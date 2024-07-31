package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleChromeDriver {
    public static WebDriver driver;

    public static void ChromeDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        driver = new ChromeDriver(options);
        driver.get(url);
    }
    public static void quitBrowser(){
        driver.quit();
    }
}
package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeBrowser {

    public static ChromeDriver driver;
    public static final ChromeBrowser browser = new ChromeBrowser();

    private ChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized")

                .addArguments("--incognito");
        driver = new ChromeDriver(options);
    }

    public static void waitLoadPage() {
        ChromeBrowser.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

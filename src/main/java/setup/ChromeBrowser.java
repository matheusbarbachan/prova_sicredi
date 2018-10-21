package setup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {

    public static ChromeDriver driver;
    public static final ChromeBrowser browser = new ChromeBrowser();

    public ChromeBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized")
                .addArguments("--incognito");
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
    }

    public static ChromeDriver getDriver() {
        return driver;
    }
}

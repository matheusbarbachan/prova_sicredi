package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import setup.ChromeBrowser;
import java.time.Duration;
import java.util.NoSuchElementException;

import java.util.concurrent.TimeUnit;

public class BaseAppObject {

     protected FluentWait<WebDriver> wait =
            new FluentWait<>(ChromeBrowser.getDriver())
                    .withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(5))
                    .ignoring(NoSuchElementException.class);



     protected WebElement getElementBy(By by) {
         ChromeBrowser.waitLoadPage();
          WebElement webElement;

          webElement = wait.until(driver -> {
               WebElement element = driver.findElement(by);
               return element;
          });

          return webElement;
     }
}

package appobjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import setup.ChromeBrowser;

import java.util.concurrent.TimeUnit;

public class BaseAppObject {

    protected FluentWait<WebDriver> wait = new FluentWait<WebDriver>(ChromeBrowser.getDriver())
            .withTimeout(30, TimeUnit.SECONDS)
            .pollingEvery(5, TimeUnit.SECONDS)
            .ignoring(NoSuchElementException.class);

}
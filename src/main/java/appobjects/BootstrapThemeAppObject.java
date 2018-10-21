package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import setup.ChromeBrowser;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BootstrapThemeAppObject {

    private FluentWait<WebDriver> wait = new FluentWait<WebDriver>(ChromeBrowser.getDriver())
            .withTimeout(30, TimeUnit.SECONDS)
            .pollingEvery(5, TimeUnit.SECONDS)
            .ignoring(NoSuchElementException.class);

    public Select getSelectVersionSelect() {
        return new Select(ChromeBrowser.getDriver().findElement(By.id("switch-version-select")));
    }

    public WebElement getAddCustomerButton() {
        return ChromeBrowser.getDriver().findElement(By.cssSelector("a[href*='bootstrap_theme_v4/add']"));
    }

    public WebElement getSearchButton(){
        WebElement search = null;

        search = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.cssSelector("a > i[class*='search']"));
                return element;
            }
        });

        return search;
    }

    public WebElement getSearchTextField(){
        WebElement search = null;

        search = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.cssSelector("input[name='search']"));
                return element;
            }
        });

        return search;
    }

    public WebElement getSelectAllCheckBox(){
        WebElement check = null;

        check = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.cssSelector("table > thead > tr> td > div > input[type='checkbox'][class*='select-all-none']"));
                return element;
            }
        });

        return check;
    }

    public WebElement getDeleteButton() {
        WebElement delete = null;

        delete = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.cssSelector("a[class*='btn'][title='Delete']"));
                return element;
            }
        });

        return delete;
    }

    public WebElement getAlertDeletionLabel(){
        WebElement alert = null;

        alert = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.cssSelector("p[class*='alert-delete-multiple-one']"));
                return element;
            }
        });

        return alert;
    }

    public WebElement getConfirmDeleteButton(){
        return ChromeBrowser.getDriver().findElement(By.cssSelector("button[class*='delete-multiple-confirmation-button']"));
    }

    public WebElement getPushNotificationLabel() {
        WebElement push = null;

        push = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.cssSelector("span[data-growl='message'] > p"));
                return element;
            }
        });

        return push;
    }
}

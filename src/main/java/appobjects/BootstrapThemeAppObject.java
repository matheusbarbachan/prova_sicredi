package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import setup.ChromeBrowser;

public class BootstrapThemeAppObject extends BaseAppObject {

    public Select getSelectVersionSelect() {
        return new Select(ChromeBrowser.getDriver().findElement(By.id("switch-version-select")));
    }

    public WebElement getAddCustomerButton() {
        return ChromeBrowser.getDriver().findElement(By.cssSelector("a[href*='bootstrap_theme_v4/add']"));
    }

    public WebElement getSearchButton() {
        WebElement search;

        search = wait.until(driver -> {
            WebElement element = driver.findElement(By.cssSelector("a > i[class*='search']"));
            return element;
        });

        return search;
    }

    public WebElement getSearchTextField() {
        WebElement search;

        search = wait.until(driver -> {
            WebElement element = driver.findElement(By.cssSelector("input[name='search']"));
            return element;
        });

        return search;
    }

    public WebElement getSelectAllCheckBox() {
        WebElement check;

        check = wait.until(driver -> {
            WebElement element = driver.findElement(By.cssSelector("table > thead > tr> td > div > input[type='checkbox'][class*='select-all-none']"));
            return element;
        });

        return check;
    }

    public WebElement getDeleteButton() {
        WebElement delete;

        delete = wait.until(driver -> {
            WebElement element = driver.findElement(By.cssSelector("a[class*='btn'][title='Delete']"));
            return element;
        });

        return delete;
    }

    public WebElement getAlertDeletionLabel() {
        WebElement alert;

        alert = wait.until(driver -> {
            WebElement element = driver.findElement(By.cssSelector("p[class*='alert-delete-multiple-one']"));
            return element;
        });

        return alert;
    }

    public WebElement getConfirmDeleteButton() {
        return ChromeBrowser.getDriver().findElement(By.cssSelector("button[class*='delete-multiple-confirmation-button']"));
    }

    public WebElement getPushNotificationLabel() {
        WebElement push;

        push = wait.until(driver -> {
            WebElement element = driver.findElement(By.cssSelector("span[data-growl='message'] > p"));
            return element;
        });

        return push;
    }
}
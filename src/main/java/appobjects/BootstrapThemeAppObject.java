package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BootstrapThemeAppObject extends BaseAppObject {

    public Select getSelectVersionSelect() {
        return new Select(getElementBy(By.id("switch-version-select")));
    }

    public WebElement getAddCustomerButton() {
        return getElementBy(By.cssSelector("a[href*='bootstrap_theme_v4/add']"));
    }

    public WebElement getSearchButton() {
        return getElementBy(By.cssSelector("a[class*='search-button'] > i[class*='el-search']"));
    }

    public WebElement getSearchTextField() {
        return getElementBy(By.cssSelector("input[name='search']"));
    }

    public WebElement getSelectAllCheckBox() {
        return getElementBy(By.cssSelector("table > thead > tr> td > div > input[type='checkbox'][class*='select-all-none']"));
    }

    public WebElement getDeleteButton() {
       return getElementBy(By.cssSelector("a[class*='btn'][title='Delete']"));
    }

    public WebElement getAlertDeletionLabel() {
        return getElementBy(By.cssSelector("p[class*='alert-delete-multiple-one']"));
    }

    public WebElement getConfirmDeleteButton() {
        return getElementBy(By.cssSelector("button[class*='delete-multiple-confirmation-button']"));
    }

    public WebElement getPushNotificationLabel() {
        return getElementBy(By.cssSelector("span[data-growl='message'] > p"));
    }
}
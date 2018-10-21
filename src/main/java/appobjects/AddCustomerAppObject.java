package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import setup.ChromeBrowser;

public class AddCustomerAppObject extends BaseAppObject {

    public WebElement getNameTextField() {
        return ChromeBrowser.getDriver().findElement(By.id("field-customerName"));
    }

    public WebElement getLastNameTextField() {
        return ChromeBrowser.getDriver().findElement(By.id("field-contactLastName"));
    }

    public WebElement getContactFirstNameTextField() {
        return ChromeBrowser.getDriver().findElement(By.id("field-contactFirstName"));
    }

    public WebElement getPhoneTextField() {
        return ChromeBrowser.getDriver().findElement(By.id("field-phone"));
    }

    public WebElement getAddressLineOneTextField() {
        return ChromeBrowser.getDriver().findElement(By.id("field-addressLine1"));
    }

    public WebElement getAddressLineTwoTextField() {
        return ChromeBrowser.getDriver().findElement(By.id("field-addressLine2"));
    }

    public WebElement getCityTextField() {
        return ChromeBrowser.getDriver().findElement(By.id("field-city"));
    }

    public WebElement getStateTextField() {
        return ChromeBrowser.getDriver().findElement(By.id("field-state"));
    }

    public WebElement getPostalCodeTextField() {
        return ChromeBrowser.getDriver().findElement(By.id("field-postalCode"));
    }

    public WebElement getCountryTextField() {
        return ChromeBrowser.getDriver().findElement(By.id("field-country"));
    }

    public WebElement employeeSelectionDropdownButton() {
        return ChromeBrowser.getDriver().findElement(By.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']/a/span/.."));
    }

    public Select getFromEmployeerSelect() {
        return new Select(ChromeBrowser.getDriver().findElement(By.id("field-salesRepEmployeeNumber")));
    }

    public WebElement getCreditLimitTextField() {
        return ChromeBrowser.getDriver().findElement(By.id("field-creditLimit"));
    }

    public WebElement getSaveButton() {
        return ChromeBrowser.getDriver().findElement(By.id("form-button-save"));
    }

    public WebElement getSuccessMessageLabel() {
        WebElement success;

        success = wait.until(driver -> {
            WebElement element = driver.findElement(By.cssSelector("div[id='report-success'] > p"));
            return element;
        });

        return success;
    }

    public WebElement getSaveAndGoBackToLIstButton() {
        return ChromeBrowser.getDriver().findElement(By.cssSelector("button[id='save-and-go-back-button']"));
    }
}
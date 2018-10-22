package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerAppObject extends BaseAppObject {

    public WebElement getNameTextField() {
        return getElementBy(By.id("field-customerName"));
    }

    public WebElement getLastNameTextField() {
        return getElementBy(By.id("field-contactLastName"));
    }

    public WebElement getContactFirstNameTextField() {
        return getElementBy(By.id("field-contactFirstName"));
    }

    public WebElement getPhoneTextField() {
        return getElementBy(By.id("field-phone"));
    }

    public WebElement getAddressLineOneTextField() {
        return getElementBy(By.id("field-addressLine1"));
    }

    public WebElement getAddressLineTwoTextField() {
        return getElementBy(By.id("field-addressLine2"));
    }

    public WebElement getCityTextField() {
        return getElementBy(By.id("field-city"));
    }

    public WebElement getStateTextField() {
        return getElementBy(By.id("field-state"));
    }

    public WebElement getPostalCodeTextField() {
        return getElementBy(By.id("field-postalCode"));
    }

    public WebElement getCountryTextField() {
        return getElementBy(By.id("field-country"));
    }

    public WebElement employeeSelectionDropdownButton() {
        return getElementBy(By.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']/a/span/.."));
    }

    public Select getFromEmployeerSelect() {
        return new Select(getElementBy(By.id("field-salesRepEmployeeNumber")));
    }

    public WebElement getCreditLimitTextField() {
        return getElementBy(By.id("field-creditLimit"));
    }

    public WebElement getSaveButton() {
        return getElementBy(By.id("form-button-save"));
    }

    public WebElement getSuccessMessageLabel() {
       return getElementBy(By.cssSelector("div[id='report-success'] > p"));
    }

    public WebElement getSaveAndGoBackToLIstButton() {
        return getElementBy(By.cssSelector("button[id='save-and-go-back-button']"));
    }
}
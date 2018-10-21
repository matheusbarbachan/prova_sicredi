package tasks;

import appobjects.AddCustomerAppObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import setup.ChromeBrowser;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.lang.Thread.sleep;

public class AddCustomerTask {

    private AddCustomerAppObject addCustomer;

    public AddCustomerTask(){
        this.addCustomer = new AddCustomerAppObject();
    }

    public void AddCustomer (
            String name,
            String lastName,
            String contactFirstName,
            String phone,
            String addressLine1,
            String addressLine2,
            String city,
            String state,
            String postalCode,
            String country,
            String fromEmployeer,
            String creditLimit
            ){
        addCustomer.getNameTextField().sendKeys(name);
        addCustomer.getLastNameTextField().sendKeys(lastName);
        addCustomer.getContactFirstNameTextField().sendKeys(contactFirstName);
        addCustomer.getPhoneTextField().sendKeys(phone);
        addCustomer.getAddressLineOneTextField().sendKeys(addressLine1);
        addCustomer.getAddressLineTwoTextField().sendKeys(addressLine2);
        addCustomer.getCityTextField().sendKeys(city);
        addCustomer.getStateTextField().sendKeys(state);
        addCustomer.getPostalCodeTextField().sendKeys(postalCode);
        addCustomer.getCountryTextField().sendKeys(country);
        addCustomer.employeeSelectionDropdownButton().click();
        addCustomer.getFromEmployeerSelect().selectByVisibleText(fromEmployeer);
        addCustomer.getCreditLimitTextField().sendKeys(creditLimit);
        addCustomer.getSaveButton().click();
    }

    public boolean messageDisplayed() {
        return addCustomer.getSuccessMessageLabel().getText().contains("Your data has been successfully stored into the database. ");
    }

    public void saveAndGoBackToList() {
        addCustomer.getSaveAndGoBackToLIstButton().click();
    }
}

package tasks;

import appobjects.BootstrapThemeAppObject;
import org.openqa.selenium.Keys;

import static java.lang.Thread.sleep;

public class BootstrapThemeTask {

    private BootstrapThemeAppObject bootstrapThemeAppObject;

    public BootstrapThemeTask() {
        this.bootstrapThemeAppObject = new BootstrapThemeAppObject();
    }

    public void selectVersion(String version) {
        bootstrapThemeAppObject.getSelectVersionSelect().selectByVisibleText(version);
    }

    public void goToAddCustomerForm() {
        bootstrapThemeAppObject.getAddCustomerButton().click();

    }

    public void searchData(String searchTerm) {
        bootstrapThemeAppObject.getSearchButton().click();
        bootstrapThemeAppObject.getSearchTextField().sendKeys(searchTerm);
        bootstrapThemeAppObject.getSearchTextField().sendKeys(Keys.ENTER);
    }

    public void selectAllFromSearchResult() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bootstrapThemeAppObject.getSelectAllCheckBox().click();
    }

    public void deleteSelectedItem() {
        bootstrapThemeAppObject.getDeleteButton().click();
    }

    public boolean assertAlertDeletion() {
        return bootstrapThemeAppObject.getAlertDeletionLabel().getText().contains("Are you sure that you want to delete");
    }

    public void confirmDeletion() {
        bootstrapThemeAppObject.getConfirmDeleteButton().click();
    }

    public boolean assertDeletionSuccessMessage() {
        return bootstrapThemeAppObject.getPushNotificationLabel().getText().contains("Your data has been successfully deleted from the database.");
    }
}

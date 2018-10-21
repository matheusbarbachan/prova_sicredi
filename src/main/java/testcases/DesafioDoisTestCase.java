package testcases;

import org.junit.Assert;
import org.junit.Test;
import setup.Base;
import tasks.AddCustomerTask;
import tasks.BootstrapThemeTask;
import utils.CSVReader;

public class DesafioDoisTestCase extends Base {
    private BootstrapThemeTask bootstrap = new BootstrapThemeTask();
    private AddCustomerTask addCustomer = new AddCustomerTask();
    private CSVReader datapool = new CSVReader("src/main/java/datapool/Desafio1datapool.csv");

    @Test
    public void realizaDesafioDois() {
        while(datapool.hasNext()) {
            goToUrl("https://www.grocerycrud.com/demo/bootstrap_theme");

            bootstrap.selectVersion(datapool.valueOfCell("Version"));

            bootstrap.goToAddCustomerForm();

            addCustomer.AddCustomer(
                    datapool.valueOfCell("Name"),
                    datapool.valueOfCell("LastName"),
                    datapool.valueOfCell("ContactFirstName"),
                    datapool.valueOfCell("Phone"),
                    datapool.valueOfCell("AddressLine1"),
                    datapool.valueOfCell("AddressLine2"),
                    datapool.valueOfCell("City"),
                    datapool.valueOfCell("State"),
                    datapool.valueOfCell("PostalCode"),
                    datapool.valueOfCell("Country"),
                    datapool.valueOfCell("Employeer"),
                    datapool.valueOfCell("CreditLimit")
            );

            Assert.assertTrue(addCustomer.messageDisplayed());

            addCustomer.saveAndGoBackToList();
            bootstrap.searchData(datapool.valueOfCell("Name"));
            bootstrap.selectAllFromSearchResult();
            bootstrap.deleteSelectedItem();
            Assert.assertTrue(bootstrap.assertAlertDeletion());
            bootstrap.confirmDeletion();
            Assert.assertTrue(bootstrap.assertDeletionSuccessMessage());

            datapool.nextLine();
        }
    }
}

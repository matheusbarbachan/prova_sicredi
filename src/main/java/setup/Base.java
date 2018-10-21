package setup;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Base {

    @Before
    public void setUp() {
        ChromeBrowser.getDriver();

    }

    public void goToUrl(String url){
        ChromeBrowser.getDriver().get(url);
    }

    @After
    public void tearDown(){
        if(ChromeBrowser.getDriver() != null) {
            ChromeBrowser.getDriver().quit();
        }
    }
}
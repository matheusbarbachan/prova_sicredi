package setup;

import org.junit.After;

public class Base {

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
package flows;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.HomePage;
import utils.BrowserStart;
import utils.SeleniumOperations;

public class HomePageFlows {
    public static final Logger log = LoggerFactory.getLogger(HomePageFlows.class);

    SeleniumOperations op = new SeleniumOperations();


    public boolean accessSamplePage(WebDriver driver) throws Exception{

        log.info("-- Accessing Sample Page");
        if (!op.click(driver, HomePage.samplePageButton())){
            return false;
        }
        return true;
    }

}

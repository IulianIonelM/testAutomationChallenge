import ShopObjects.flows.HomePageFlows;
import ShopObjects.flows.SamplePageFlows;
import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.BrowserStart;
import utils.CloseAllConnections;

public class DemostrationShopSelleniumChallenge {

    WebDriver driver;

    public static final Logger log = LoggerFactory.getLogger(DemostrationShopSelleniumChallenge.class);



    @Test
    public void demoTest()throws Exception{
        BasicConfigurator.configure();

        log.info("<<< STARTING TEST : " + new Object().getClass().getName());
        HomePageFlows homePage = new HomePageFlows();
        SamplePageFlows samplePage = new SamplePageFlows();
        CloseAllConnections close = new CloseAllConnections();


        driver = BrowserStart.browserStart();
        boolean test = true;
        if (!homePage.accessSamplePage(driver)){
            log.error   ("TEST FAILED AT accessSamplePage ");
            test = false;
        };
        if (!samplePage.submitCommentTest(driver)){
            log.error("TEST FAILED AT submitCommentTest");
            test = false;
        }
        if(!close.closeBrowser(driver)){
            log.error("Browser Failed to close");
            test = false;

        }



        if (test){
            //print to report test passed
            log.info("TEST PASSED");
        } else {
            //print to report test FAILED
            log.info("TEST FAILED");
        }
    }
}







































































































































































































































































































































































































































































































































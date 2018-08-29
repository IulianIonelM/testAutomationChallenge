package utils;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CloseAllConnections {

    public static final Logger log = LoggerFactory.getLogger(CloseAllConnections.class);

    public boolean closeBrowser(WebDriver driver) throws Exception{
        try {
            driver.close();
            driver.quit();
        }catch (Exception e){

            log.error("Error returned at closing connections ", e);
            return false;
        }
        return true;
    }
}

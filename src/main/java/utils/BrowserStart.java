package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

public class BrowserStart {

    public static final Logger log = LoggerFactory.getLogger(BrowserStart.class);

    public static WebDriver browserStart (){
        WebDriver driver = null;
        try {
            log.info("--- Starting Browser ---");
            File file = new File ("");

            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()+"\\src\\main\\resources\\" + "chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();
            driver.navigate().to(Config.URL);
            driver.manage().window().maximize();



        }catch (Exception e){
            e.printStackTrace();
            log.error("Failed to launch browser", e);
        }

        return driver;
    }




}

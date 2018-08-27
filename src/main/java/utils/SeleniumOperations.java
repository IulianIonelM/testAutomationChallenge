package utils;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;

public class SeleniumOperations {
    public static final Logger log = LoggerFactory.getLogger(SeleniumOperations.class);


    public WebElement findElement (WebDriver driver, String xPath) throws Exception {
        WebElement el =null;
        int i = 0;
        do {
            Thread.sleep(100);
            el = driver.findElement(By.xpath(xPath));
            i++;
        }while (el !=null && i<15);

        if (el!=null){
            return el;
        } else {
            log.error("Element with the following xPath can not be found " + xPath);
            return null;
        }
    }
    public boolean click (WebDriver driver, String elementToBeClicked) throws Exception{

        WebElement el = findElement(driver, elementToBeClicked);
        try {
            el.click();
            return true;
        }catch (Exception e){
            log.error("Element with the xpath: " + elementToBeClicked +"      can not be clicked");
            e.printStackTrace();
            return false;
        }
    }
    public boolean sendToTextBox (WebDriver driver, String textBoxAddress, String textToSend) throws Exception{
        WebElement el = findElement(driver, textBoxAddress);
        try {
            el.clear();
            el.sendKeys(textToSend);
            return true;
        }catch (Exception e){
            log.error("Element with the xpath: " + textBoxAddress +"      returned error at receiving text");
            e.printStackTrace();
            return false;
        }


    }

}

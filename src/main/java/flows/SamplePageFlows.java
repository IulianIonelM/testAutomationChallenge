package flows;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.SamplePage;
import utils.Config;
import utils.SeleniumOperations;
import org.joda.time.LocalDate;


public class SamplePageFlows {
    public static final Logger log = LoggerFactory.getLogger(SamplePageFlows.class);

    SeleniumOperations op = new SeleniumOperations();

    private LocalDate currentLocalDate = LocalDate.now();
    private DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-mm");
    private LocalDateTime localDateTime = new LocalDateTime();

    public boolean submitCommentTest (WebDriver driver) throws Exception{

        log.info("-- submitComment");

        String date = localDateTime.toString();


        log.info("Fillign the comment section");
        if (!op.sendToTextBox(driver, SamplePage.commentTextBox(), "TEST COMMENT " + date)){
            return false;
        }
        log.info("Filling the name section");
        if (!op.sendToTextBox(driver, SamplePage.nameTextBox(), "tester987")){
            return false;
        }
        log.info("Filling The mail Section");
        if (!op.sendToTextBox(driver, SamplePage.emailTextBox(), "Wrong Mail")){
            return false;
        }
        log.info("Click post comment button");
        if (!op.click(driver, SamplePage.postCommentButton())){
            return false;
        }
        log.info("Checkign the correct error message is displayed");
        if (op.findElement(driver, SamplePage.errorMessageText())==null){
            return false;
        }
        log.info("Click back button");
        if(!op.click(driver, SamplePage.backButton())){
            return false;
        }
        log.info("Fillign the comment section");
        if (!op.sendToTextBox(driver, SamplePage.commentTextBox(), "TEST COMMENT " + date)){
            return false;
        }
        log.info("Filling the name section");
        if (!op.sendToTextBox(driver, SamplePage.nameTextBox(), "tester987")){
            return false;
        }
        log.info("Filling The mail Section");
        if (!op.sendToTextBox(driver, SamplePage.emailTextBox(), Config.EMAIL)){
            return false;
        }
        log.info("Click post comment button");
        if(!op.click(driver, SamplePage.postCommentButton())){
            return false;
        }
        log.info("Verifying the correct comment is accepted, and displayed.");
        if (op.findElement(driver, "//p[contains(text(), '" + date + "')]")==null){
            return false;
        }
        log.info("Verifying the correct name is displayed for the comment.");
        if (op.findElement(driver, "//p[contains(text(), '" + date + "')]/ancestor::div[contains(@id, 'comment')]//*[contains(text(),'TEster987')]")==null){
            return false;
        }

        return true;
    }
}

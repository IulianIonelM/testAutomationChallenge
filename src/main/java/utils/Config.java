package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Config {
    public static final Logger log = LoggerFactory.getLogger(BrowserStart.class);
    private static File file = new File ("");
    public static final String URL = "http://store.demoqa.com";
    public static final String EMAIL = "test@test.com";


}

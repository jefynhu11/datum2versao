package org.example.framework.supports;

import org.example.framework.webdrivers.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest extends DriverFactory {

    private static String url = "http://automationpractice.com/index.php";

    @BeforeAll
    public static void setUp(){
        driver = getBrowser(Drivers.CHROME);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().get(url);
    }

    @AfterAll
    public static void tearDown(){
        DriverManager.quit();
    }

}

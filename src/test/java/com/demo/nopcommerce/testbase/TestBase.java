package com.demo.nopcommerce.testbase;

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browserselector.BrowserSelector;
import com.demo.nopcommerce.loadproperty.LoadProperty;
import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Pradip
 */
public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();//object created
    LoadProperty loadProperty = new LoadProperty();

    // two object created comes from config.properties file
    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

    @BeforeMethod
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().setPosition(new Point(2000, 0));//display into second screen
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();


    }
}

package com.shoppingexpress.online.selenium;


import com.shoppingexpress.online.common.Constants;
import com.shoppingexpress.online.core.PropertyFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class TestBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestBase.class);

    private static TestBase instance;

    private WebDriver driver;
    private String browser;
    private String url;

    private TestBase() {
        PropertyFileReader propertyFileReader = new PropertyFileReader(Constants.CONFIG_FILE_NAME);
        browser = propertyFileReader.getProperty("browser");
        url = propertyFileReader.getProperty("url");
    }

    public static TestBase getInstance() {
        if (instance == null) {
            instance = new TestBase();
        }
        return instance;
    }

    public static WebDriver getDriver() {
        return getInstance().driver;
    }

    public String getBrowser() {
        return browser;
    }

    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void openBrowser() {
        String browserType = getBrowser();
        if (browserType.equalsIgnoreCase("Firefox")) {
            setDriver(new FirefoxDriver());
            LOGGER.info("Opening Firefox Browser");
        } else if (browserType.equalsIgnoreCase("Chrome")) {
            String chromeFilePath = System.getProperty("user.dir") + File.separator + "target" + File.separator + "chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeFilePath);
            Map<String, Object> chromePrefs = new HashMap<>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("safebrowsing.enabled", "true");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.setExperimentalOption("prefs", chromePrefs);
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            setDriver(new ChromeDriver());
            LOGGER.info("Opening Chrome Browser");
        } else if (browserType.equalsIgnoreCase("IE")) {
            LOGGER.info("Opening IE Browser");
        }
        getDriver().manage().window().maximize();
    }

    public void closeBrowser() {
        TestBase.getDriver().quit();
        driver = null;
    }

    public static WebDriverWait newWebDriverWait(int delaySeconds) {
        return new WebDriverWait(getDriver(), delaySeconds);
    }

    public void navigateToURL() {
        getDriver().get(url);
        LOGGER.info("Navigated to url " + url);
    }


}

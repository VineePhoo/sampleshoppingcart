package com.shoppingexpress.online.util;

import com.shoppingexpress.online.selenium.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;


public class Utilities {

    private static final Set<Integer> USED_UNIQUE_IDS = new HashSet<>();
    private static LinkedHashMap<String, String> COUNTRY_LIST = new LinkedHashMap<String, String>();
    private static LinkedHashMap<String, String> STATE_LIST = new LinkedHashMap<String, String>();

    public static WebElement waitForElementId(String id) {
        return waitForElementId(id, 20);
    }

    public static WebElement waitForElement(By locator, int timeout) {
        WebElement element = new WebDriverWait(TestBase.getDriver(), timeout).until(ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }

    public static WebElement waitForElementId(String id, int timeout) {
        return waitForElement(By.id(id), timeout);
    }

    public static WebElement waitForElementName(String elementName) {
        return waitForElementName(elementName, 20);
    }

    public static WebElement waitForElementName(String elementName, int timeout) {
        return waitForElement(By.name(elementName), timeout);
    }

    public static WebElement waitForClassName(String className) {
        return waitForClassName(className, 20);
    }

    public static WebElement waitForClassName(String className, int timeout) {
        return waitForElement(By.className(className), timeout);
    }

    public static String getNextUniqueString() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 999999);
        return USED_UNIQUE_IDS.add(randomNum) ? String.valueOf(randomNum) : getNextUniqueString();
    }

    public static LinkedHashMap<String, String> getContryList() {
        COUNTRY_LIST.put("United States", "21");
        return COUNTRY_LIST;

    }

    public static LinkedHashMap<String, String> getStateList() {
        STATE_LIST.put("California", "5");
        return STATE_LIST;

    }

}

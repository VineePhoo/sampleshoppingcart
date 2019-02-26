package com.shoppingexpress.online.core;

import com.shoppingexpress.online.selenium.TestBase;
import com.shoppingexpress.online.util.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedHashMap;
import java.util.List;

public class PropertyEditor {
    private static LinkedHashMap<String, WebElement> fieldMap = new LinkedHashMap<String, WebElement>();

    public LinkedHashMap<String, WebElement> getPropertyMap() {

        List<WebElement> list = TestBase.getDriver().findElements(By.className("account_creation"));
        List<WebElement> eleDiv = list.get(0).findElements(By.tagName("div"));
        List<WebElement> eleP = list.get(1).findElements(By.tagName("P"));
        fieldMap = setPropertyMap(fieldMap, eleDiv);
        fieldMap = setPropertyMap(fieldMap, eleP);

        return fieldMap;
    }

    /**
     * In this application, HTML tags are not defined properly. So this logic can not be implemented in a proper way
     *
     * @param fieldMap
     * @param list
     * @return
     */
    private LinkedHashMap<String, WebElement> setPropertyMap(LinkedHashMap<String, WebElement> fieldMap, List<WebElement> list) {
        for (WebElement element : list) {
            if (element.getAttribute("class").equalsIgnoreCase("required form-group") ||
                    element.getAttribute("class").equalsIgnoreCase("required password form-group") ||
                    element.getAttribute("class").equalsIgnoreCase("checkbox") ||
                    element.getAttribute("class").equalsIgnoreCase("form-group is_customer_param") ||
                    element.getAttribute("class").equalsIgnoreCase("required postcode form-group")) {
                WebElement label = element.findElement(By.tagName("label"));
                if (fieldMap.containsKey(label.getText().replace("*", "").trim())) {
                    fieldMap.put(label.getText().replace("*", "").trim() + "-" + Utilities.getNextUniqueString(), element.findElement(By.tagName("input")));
                } else {
                    fieldMap.put(label.getText().replace("*", "").trim(), element.findElement(By.tagName("input")));
                }

            } else if (element.getAttribute("class").equalsIgnoreCase("form-group")) {
                List<WebElement> dropDwons = element.findElements(By.tagName("select"));
                if (dropDwons.size() > 0) {
                    for (WebElement dropDwon : dropDwons) {
                        fieldMap.put(dropDwon.getAttribute("name").trim(), dropDwon);
                    }
                } else {
                    WebElement label = element.findElement(By.tagName("label"));
                    fieldMap.put(label.getText().replace("*", "").trim(), element.findElement(By.tagName("input")));
                }

            } else if (element.getAttribute("class").contains("textarea form-group")) {

                WebElement label = element.findElement(By.tagName("label"));
                fieldMap.put(label.getText().replace(".", ""), element.findElement(By.tagName("textarea")));
            } else if (element.getAttribute("class").equalsIgnoreCase("radio-inline")) {
                List<WebElement> radioBtns = element.findElements(By.tagName("label"));
                for (WebElement ele : radioBtns) {
                    fieldMap.put(ele.getText().replace(".", "").trim(), ele.findElement(By.tagName("input")));
                }
            } else if (element.getAttribute("class").equalsIgnoreCase("required id_state select form-group") ||
                    element.getAttribute("class").equalsIgnoreCase("required select form-group")) {
                WebElement label = element.findElement(By.tagName("label"));
                fieldMap.put(label.getText().replace("*", "").trim(), element.findElement(By.tagName("select")));
            }
        }

        return fieldMap;
    }

    public void setInputValues(String fieldName, String value) {
        if (fieldMap.size() == 0) {
            fieldMap = getPropertyMap();
        }
        WebElement element = fieldMap.get(fieldName);
        if (element.getAttribute("type").contains("checkbox") || element.getAttribute("type").contains("radio")) {
            fieldMap.get(fieldName).click();
        } else if (element.getAttribute("tagName").contains("INPUT") || (element.getAttribute("type").contains("text") || element.getAttribute("type").contains("password"))) {
            fieldMap.get(fieldName).sendKeys(value);
        } else if (element.getAttribute("tagName").contains("SELECT") || element.getAttribute("type").contains("select-one")) {
            Select date = new Select(fieldMap.get(fieldName));
            date.selectByValue(value);
        }

    }
}



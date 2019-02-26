package com.shoppingexpress.online;

import com.shoppingexpress.online.util.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class OrderConformationPopUp {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConformationPopUp.class);

    public ShoppingCartSummaryPage prceedOrder() {
        List<WebElement> list = Utilities.waitForClassName("button-container").findElements(By.tagName("a"));
        for (WebElement ele : list) {
         if(ele.getAttribute("title").equalsIgnoreCase("Proceed to checkout")){
             LOGGER.info("Click on "+ele.getText());
             ele.click();
             break;
         }
        }
        return new ShoppingCartSummaryPage();
    }
}

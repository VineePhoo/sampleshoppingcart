package com.shoppingexpress.online.payment;

import com.shoppingexpress.online.OrderConfirmationPage;
import com.shoppingexpress.online.selenium.TestBase;
import com.shoppingexpress.online.util.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaymentConfirmationPage {

    public OrderConfirmationPage submitOrder() {
        ((JavascriptExecutor) TestBase.getDriver()).executeScript("window.scrollBy(0,1000)", "");
        List<WebElement> list = Utilities.waitForElementId("cart_navigation").findElements(By.tagName("Button"));
        for (WebElement ele : list) {
            if (ele.getText().equalsIgnoreCase("I confirm my order")) {
                ele.click();
                break;
            }
        }
        return new OrderConfirmationPage();
    }
}

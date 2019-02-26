package com.shoppingexpress.online;

import com.shoppingexpress.online.authentication.AuthenticationPage;
import com.shoppingexpress.online.delivery.AddressPage;
import com.shoppingexpress.online.selenium.TestBase;
import com.shoppingexpress.online.util.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ShoppingCartSummaryPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShoppingCartSummaryPage.class);

    public AuthenticationPage clickProceedToAuthentication(){
        execute();
        return new AuthenticationPage();
    }

    public AddressPage clickProceedToAddressPage(){
        execute();
        return new AddressPage();
    }

    private void execute(){
        ((JavascriptExecutor) TestBase.getDriver()).executeScript("window.scrollBy(0,1000)", "");
        List<WebElement> list = Utilities.waitForClassName("cart_navigation").findElements(By.tagName("a"));
        for (WebElement ele : list) {
            if(ele.getAttribute("title").equalsIgnoreCase("Proceed to checkout")){
                LOGGER.info("Click on "+ele.getText());
                ele.click();
                break;
            }
        }
    }

}

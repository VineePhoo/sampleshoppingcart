package com.shoppingexpress.online.payment;

import com.shoppingexpress.online.selenium.TestBase;
import com.shoppingexpress.online.util.Utilities;
import org.openqa.selenium.JavascriptExecutor;

public class PaymentOptionPage {
    public PaymentConfirmationPage clickOnPayByBankOption(){
        ((JavascriptExecutor) TestBase.getDriver()).executeScript("window.scrollBy(0,1000)", "");
        Utilities.waitForClassName("bankwire").click();
        return new PaymentConfirmationPage();
    }
}

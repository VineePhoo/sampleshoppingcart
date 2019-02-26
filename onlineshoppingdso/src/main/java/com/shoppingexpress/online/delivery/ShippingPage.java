package com.shoppingexpress.online.delivery;

import com.shoppingexpress.online.payment.PaymentOptionPage;
import com.shoppingexpress.online.util.Utilities;

public class ShippingPage {

    public void acceptTermAndConditions() {
        Utilities.waitForElementId("cgv").click();
    }

    public PaymentOptionPage clickOnProceedToPayment() {
        Utilities.waitForElementName("processCarrier").click();
        return new PaymentOptionPage();
    }
}

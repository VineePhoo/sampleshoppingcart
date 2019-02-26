package com.shoppingexpress.stepdef;

import com.shoppingexpress.stepdef.common.SharedState;
import cucumber.api.java.en.When;

public class PaymentConfirmationStepDef {

    private SharedState sharedState;

    public PaymentConfirmationStepDef(SharedState sharedState) {
        this.sharedState = sharedState;
    }

    @When("^click on order confirmation button on the payment confirmation view$")
    public void sumbitOrder(){
        sharedState.orderConfirmationPage = sharedState.paymentConfirmationPage.submitOrder();
    }

}

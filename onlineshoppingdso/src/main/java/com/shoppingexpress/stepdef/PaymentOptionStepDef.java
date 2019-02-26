package com.shoppingexpress.stepdef;

import com.shoppingexpress.stepdef.common.SharedState;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class PaymentOptionStepDef implements En {

    private SharedState sharedState;
    public PaymentOptionStepDef(SharedState sharedState) {
        this.sharedState = sharedState;
    }

    @When("^select on Pay by bank wire option$")
    public void selectPaymentByBannk(){
     sharedState.paymentConfirmationPage = sharedState.paymentOptionPage.clickOnPayByBankOption();
    }
}

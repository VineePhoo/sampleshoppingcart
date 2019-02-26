package com.shoppingexpress.stepdef;

import com.shoppingexpress.stepdef.common.SharedState;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class ShippingStepDef implements En {
    private SharedState sharedState;

    public ShippingStepDef(SharedState sharedState) {
        this.sharedState = sharedState;
    }

    @When("^accept the terms and condition on shipping$")
    public void acceptTermConditions(){
        sharedState.shippingPage.acceptTermAndConditions();
    }

    @When("^click on proceed button on the shipping summary view$")
    public void clickOnProceedBtnToNavigateToPayment(){
        sharedState.paymentOptionPage = sharedState.shippingPage.clickOnProceedToPayment();
    }

}

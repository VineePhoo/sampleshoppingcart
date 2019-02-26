package com.shoppingexpress.stepdef;

import com.shoppingexpress.stepdef.common.SharedState;
import cucumber.api.java.en.Then;
import cucumber.api.java8.En;
import org.testng.Assert;

import java.util.List;

public class OrderConfirmationStepDef implements En {

    private SharedState sharedState;

    public OrderConfirmationStepDef(SharedState sharedState) {
        this.sharedState = sharedState;
    }

    @Then("^system should display \"([^\"]*)\" the confirmation message$")
    public void verifyOrderConfirmationMsg(String expectedMessage){
        List<String> actualMsgs = sharedState.orderConfirmationPage.getOrderConfirmationMsg();
        Assert.assertTrue(actualMsgs.contains(expectedMessage));
    }
}

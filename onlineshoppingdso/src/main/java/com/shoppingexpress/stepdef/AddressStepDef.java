package com.shoppingexpress.stepdef;

import com.shoppingexpress.online.delivery.AddressPage;
import com.shoppingexpress.stepdef.common.SharedState;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class AddressStepDef implements En {
    private SharedState sharedState;
    public AddressStepDef(SharedState sharedState){
        this.sharedState=sharedState;
    }

    @When("^click on proceed button on the address summary view$")
    public void clickOnProceedToShippingInfo(){
        if(sharedState.addressPage==null){
            sharedState.addressPage = new AddressPage();
        }
        sharedState.shippingPage = sharedState.addressPage.clickOnToNavigateShippinginfo();
    }

}

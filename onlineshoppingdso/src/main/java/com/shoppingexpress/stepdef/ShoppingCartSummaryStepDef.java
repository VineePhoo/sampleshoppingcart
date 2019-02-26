package com.shoppingexpress.stepdef;

import com.shoppingexpress.stepdef.common.SharedState;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class ShoppingCartSummaryStepDef implements En {
    private SharedState sharedState;

    public ShoppingCartSummaryStepDef(SharedState sharedState){
        this.sharedState=sharedState;
    }

    @When("click on proceed button to navigate to the view authentication details")
    public void ClickonProceedToAuthentication(){
        sharedState.authenticationPage = sharedState.shoppingCartSummaryPage.clickProceedToAuthentication();
    }

    @When("^click on proceed button to navigate to the adress summary details$")
    public void clickOnTonavigateToAdressSummaryPage(){
        sharedState.addressPage = sharedState.shoppingCartSummaryPage.clickProceedToAddressPage();
    }
}

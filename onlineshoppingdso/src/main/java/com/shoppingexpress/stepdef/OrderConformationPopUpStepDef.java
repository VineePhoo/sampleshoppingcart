package com.shoppingexpress.stepdef;

import com.shoppingexpress.stepdef.common.SharedState;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class OrderConformationPopUpStepDef implements En {

    private SharedState sharedState;
    public OrderConformationPopUpStepDef(SharedState sharedState){
        this.sharedState=sharedState;
    }

    @When("^click on proceed button to navigate to the view shopping cart summary$")
    public void proceedOrderToCheckOut(){
        sharedState.shoppingCartSummaryPage = sharedState.orderConformationPopUp.prceedOrder();
    }

}

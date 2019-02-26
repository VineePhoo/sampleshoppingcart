package com.shoppingexpress.stepdef;

import com.shoppingexpress.stepdef.common.SharedState;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class SelectItemStepDef implements En {

    private SharedState sharedState;
    public SelectItemStepDef(SharedState sharedState){
        this.sharedState =sharedState;
    }

    @When("^add selected item \"([^\"]*)\" to the cart$")
    public void enterInputSearchText(String itemNumber){
        sharedState.orderConformationPopUp = sharedState.viewSearchItemsPage.addToCartSelectedItem(itemNumber);
    }

}

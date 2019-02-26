package com.shoppingexpress.online.delivery;

import com.shoppingexpress.online.util.Utilities;

public class AddressPage {

    public ShippingPage clickOnToNavigateShippinginfo(){
        Utilities.waitForElementName("processAddress").click();
        return new ShippingPage();
    }

}

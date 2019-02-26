package com.shoppingexpress.online.authentication;


import com.shoppingexpress.online.core.PropertyEditor;
import com.shoppingexpress.online.delivery.AddressPage;
import com.shoppingexpress.online.util.Utilities;


public class UserCreationPage {

    public void inputFormDataValue(String fieldName, String value) {
        new PropertyEditor().setInputValues(fieldName, value);
    }

    public AddressPage clickonUserRegistrationBtn() {
        Utilities.waitForElementId("submitAccount").click();
        return new AddressPage();
    }

}

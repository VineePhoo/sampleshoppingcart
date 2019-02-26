package com.shoppingexpress.online.authentication;

import com.shoppingexpress.online.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.shoppingexpress.online.util.Utilities;

public class AuthenticationPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationPage.class);

    public void inputValidEmail(String emailId){
        Utilities.waitForElementId("email_create").sendKeys(emailId);
    }

    public UserCreationPage createUserAccount(){
        Utilities.waitForElementId("SubmitCreate").click();
        return new UserCreationPage();
    }

    public void enterExistingEmailIdAndPassword(String emailId,String password){
        Utilities.waitForElementId("email").sendKeys(emailId);
        Utilities.waitForElementId("passwd").sendKeys(password);
    }

    public HomePage clickonLoginBtn(){
        Utilities.waitForElementId("SubmitLogin").click();
        return new HomePage();
    }
}

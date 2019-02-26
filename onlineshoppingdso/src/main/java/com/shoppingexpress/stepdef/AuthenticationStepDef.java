package com.shoppingexpress.stepdef;

import com.shoppingexpress.stepdef.common.SharedState;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class AuthenticationStepDef implements En {
    private SharedState sharedState;

    public AuthenticationStepDef(SharedState sharedState){
        this.sharedState=sharedState;
    }

    @When("^enter email id \"([^\"]*)\" to create a new user account$")
    public void inputEmailId(String emailAddress){
        sharedState.authenticationPage.inputValidEmail(emailAddress);
    }

    @When("^click create account button to create a new user$")
    public void navigateToUserCreation(){
       sharedState.userCreationPage = sharedState.authenticationPage.createUserAccount();
    }

    @And("^user \"([^\"]*)\" log into shopping cart with password \"([^\"]*)\"$")
    public void enterUnamePasswod(String email,String password){
        sharedState.authenticationPage.enterExistingEmailIdAndPassword(email,password);
    }

    @When("^user click on sign in butn on the authentication page$")
    public void clickOnSignInOnAuthPage(){
        sharedState.homePage = sharedState.authenticationPage.clickonLoginBtn();
    }

}

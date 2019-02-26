package com.shoppingexpress.stepdef;

import com.shoppingexpress.online.HomePage;
import com.shoppingexpress.online.selenium.TestBase;
import com.shoppingexpress.stepdef.common.SharedState;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class HomeStepDef implements En {

    protected HomePage homePage;
    private SharedState sharedState;

    public HomeStepDef(SharedState sharedState){
        this.sharedState=sharedState;
    }

    @Given("^user navigate to the online shopping home page$")
    public void userSuccessfullynavigateToHome(){
        TestBase.getInstance().openBrowser();
        TestBase.getInstance().navigateToURL();
        homePage = new HomePage();
    }

    @When("^enter the item name \"([^\"]*)\" in to the search text field$")
    public void enterInputSearchText(String inputTxt){
        homePage.setInputElementText(inputTxt);
    }

    @And("^click on search button on home page$")
   public void navigateToSearchGrid(){
        sharedState.viewSearchItemsPage = homePage.clickOnSearchBtn();
   }

   @And("^user click on sign in button on the home page$")
    public void clickOnSignInBtn(){
        sharedState.authenticationPage = homePage.navigateToSignIn();
   }



}

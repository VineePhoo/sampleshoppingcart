package com.shoppingexpress.online;

import com.shoppingexpress.online.authentication.AuthenticationPage;
import com.shoppingexpress.online.search.ViewSearchItemsPage;
import com.shoppingexpress.online.selenium.TestBase;
import com.shoppingexpress.online.util.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    public HomePage setInputElementText(String itemName) {
        Utilities.waitForElementId("search_query_top").sendKeys(itemName);
        return new HomePage();
    }

    public ViewSearchItemsPage clickOnSearchBtn() {
        Utilities.waitForElementName("submit_search").click();
        return new ViewSearchItemsPage();
    }

    public AuthenticationPage navigateToSignIn(){
        List<WebElement> elements = TestBase.getDriver().findElements(By.className("login"));
        for (WebElement element :elements){
            if(element.getAttribute("Title").equalsIgnoreCase("Log in to your customer account")){
                element.click();
                break;
            }
        }
        return new AuthenticationPage();
    }

    private void isCheckedUserSignOut(){
        List<WebElement> elements = TestBase.getDriver().findElements(By.className("logout"));
        if(elements.size()==0){
            return;
        }
        for (WebElement element :elements){
            if(element.getAttribute("Title").equalsIgnoreCase("Log in to your customer account")){
                element.click();
                break;
            }
        }

    }
}
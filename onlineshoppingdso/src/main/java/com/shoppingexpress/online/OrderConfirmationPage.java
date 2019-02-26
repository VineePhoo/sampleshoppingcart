package com.shoppingexpress.online;

import com.shoppingexpress.online.selenium.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class OrderConfirmationPage {

    /**
     * No proper tags . So implemented in this way
     * @return
     */

    public List<String> getOrderConfirmationMsg(){
        List<WebElement> elements = TestBase.getDriver().findElement(By.id("center_column")).findElements(By.tagName("div"));
        List<String>  messages = new ArrayList<String>();
        String message = "Not Found";
        try{

           for(WebElement element : elements){
               List<WebElement> tags = element.findElements(By.tagName("Strong"));
               for(WebElement tag : tags){
                   messages.add(tag.getText());
               }
           }
        }catch (Exception e){
            Assert.fail("element was not found : " + e.getLocalizedMessage());
            return messages;
        }

        return messages;
    }
}

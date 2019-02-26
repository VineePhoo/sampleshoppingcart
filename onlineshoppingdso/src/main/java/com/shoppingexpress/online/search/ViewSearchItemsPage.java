package com.shoppingexpress.online.search;

import com.shoppingexpress.online.OrderConformationPopUp;
import com.shoppingexpress.online.selenium.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ViewSearchItemsPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(ViewSearchItemsPage.class);

    public OrderConformationPopUp addToCartSelectedItem(String itemIndex) {
        Actions builder = new Actions(TestBase.getDriver());
        List<WebElement> productList = TestBase.getDriver().findElements(By.className("ajax_block_product"));
        int index =0;
        outerloop:
        for(WebElement ele : productList){
            index++;
            LOGGER.info("Index value "+index + " And Item index "+itemIndex);
            if(index==Integer.parseInt(itemIndex)){
                ((JavascriptExecutor) TestBase.getDriver()).executeScript("arguments[0].scrollIntoView(true);", ele);
                 builder.moveToElement(ele).perform();
                 List<WebElement> addToCartBtn = ele.findElements(By.className("ajax_add_to_cart_button"));
                for (WebElement cartBtn : addToCartBtn) {
                    if (cartBtn.getText().equals("Add to cart")) {
                        cartBtn.click();
                        break outerloop;
                    }
                }

            }
        }
        return new OrderConformationPopUp();
    }
}
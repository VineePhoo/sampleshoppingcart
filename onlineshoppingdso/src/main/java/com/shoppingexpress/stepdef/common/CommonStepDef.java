package com.shoppingexpress.stepdef.common;

import com.shoppingexpress.online.selenium.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java8.En;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonStepDef implements En {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonStepDef.class);


    @After()
    public void tearDown(Scenario scenario) {
        try {
            TestBase.getInstance().closeBrowser();
        } catch (Exception e) {
            LOGGER.warn("Exception occurred when shutting down browser. " + e.getLocalizedMessage(), e);
        }
    }
}

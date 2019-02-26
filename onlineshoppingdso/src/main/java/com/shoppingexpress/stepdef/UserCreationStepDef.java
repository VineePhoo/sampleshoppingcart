package com.shoppingexpress.stepdef;

import com.shoppingexpress.online.core.RandomStringTransformer;
import com.shoppingexpress.online.util.Utilities;
import com.shoppingexpress.stepdef.common.SharedState;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import gherkin.formatter.model.DataTableRow;

import java.util.List;

public class UserCreationStepDef implements En {
    private SharedState sharedState;

    public UserCreationStepDef(SharedState sharedState) {
        this.sharedState = sharedState;
    }

    @When("^create a new user with following values$")
    public void createNewUser(DataTable dataTable) {
        dataTable = RandomStringTransformer.INSTANCE.transform(dataTable);
        List<DataTableRow> gherkinRows = dataTable.getGherkinRows();
        for (int i = 1; i < gherkinRows.size(); i++) {
            List<String> row = gherkinRows.get(i).getCells();
            if (row.get(0).equalsIgnoreCase("State")) {
                sharedState.userCreationPage.inputFormDataValue(row.get(0), Utilities.getStateList().get(row.get(1)));
            } else if (row.get(0).equalsIgnoreCase("Country")) {
                sharedState.userCreationPage.inputFormDataValue(row.get(0), Utilities.getContryList().get(row.get(1)));
            } else if (row.get(0).equalsIgnoreCase("Date of Birth")) {
                String[] dob = (row.get(1).split("-"));
                sharedState.userCreationPage.inputFormDataValue("days", dob[0]);
                sharedState.userCreationPage.inputFormDataValue("months", dob[1]);
                sharedState.userCreationPage.inputFormDataValue("years", dob[2]);
            } else if (row.get(0).equalsIgnoreCase("Title")) {
                sharedState.userCreationPage.inputFormDataValue(row.get(1), row.get(1));
            } else {
                sharedState.userCreationPage.inputFormDataValue(row.get(0), row.get(1));
            }

        }

    }

    @When("^click on the button register to create a new user$")
    public void clickOnRegisterBtn() {
        sharedState.addressPage = sharedState.userCreationPage.clickonUserRegistrationBtn();
    }

}

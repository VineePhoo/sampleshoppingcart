$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("create-order.feature");
formatter.feature({
  "line": 3,
  "name": "Order creation by a new user and exsiting user",
  "description": "",
  "id": "order-creation-by-a-new-user-and-exsiting-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@E2ERegression"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user navigate to the online shopping home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeStepDef.userSuccessfullynavigateToHome()"
});
formatter.result({
  "duration": 21933556035,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "create an order by an existing user",
  "description": "",
  "id": "order-creation-by-a-new-user-and-exsiting-user;create-an-order-by-an-existing-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user click on sign in button on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user \"abc2019fthj@gmail.com\" log into shopping cart with password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click on sign in butn on the authentication page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter the item name \"Dress\" in to the search text field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on search button on home page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "add selected item \"1\" to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on proceed button to navigate to the view shopping cart summary",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on proceed button to navigate to the adress summary details",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click on proceed button on the address summary view",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "accept the terms and condition on shipping",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click on proceed button on the shipping summary view",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select on Pay by bank wire option",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "click on order confirmation button on the payment confirmation view",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "system should display \"Your order on My Store is complete.\" the confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDef.clickOnSignInBtn()"
});
formatter.result({
  "duration": 12285812594,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc2019fthj@gmail.com",
      "offset": 6
    },
    {
      "val": "abc123",
      "offset": 67
    }
  ],
  "location": "AuthenticationStepDef.enterUnamePasswod(String,String)"
});
formatter.result({
  "duration": 1776467025,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationStepDef.clickOnSignInOnAuthPage()"
});
formatter.result({
  "duration": 5693434360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dress",
      "offset": 21
    }
  ],
  "location": "HomeStepDef.enterInputSearchText(String)"
});
formatter.result({
  "duration": 1734991222,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.navigateToSearchGrid()"
});
formatter.result({
  "duration": 3051764440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 19
    }
  ],
  "location": "SelectItemStepDef.enterInputSearchText(String)"
});
formatter.result({
  "duration": 2035301170,
  "status": "passed"
});
formatter.match({
  "location": "OrderConformationPopUpStepDef.proceedOrderToCheckOut()"
});
formatter.result({
  "duration": 17092999196,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSummaryStepDef.clickOnTonavigateToAdressSummaryPage()"
});
formatter.result({
  "duration": 32818214592,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDef.clickOnProceedToShippingInfo()"
});
formatter.result({
  "duration": 79506125783,
  "status": "passed"
});
formatter.match({
  "location": "ShippingStepDef.acceptTermConditions()"
});
formatter.result({
  "duration": 15751330769,
  "status": "passed"
});
formatter.match({
  "location": "ShippingStepDef.clickOnProceedBtnToNavigateToPayment()"
});
formatter.result({
  "duration": 36536488697,
  "status": "passed"
});
formatter.match({
  "location": "PaymentOptionStepDef.selectPaymentByBannk()"
});
formatter.result({
  "duration": 28217912110,
  "status": "passed"
});
formatter.match({
  "location": "PaymentConfirmationStepDef.sumbitOrder()"
});
formatter.result({
  "duration": 47520561703,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order on My Store is complete.",
      "offset": 23
    }
  ],
  "location": "OrderConfirmationStepDef.verifyOrderConfirmationMsg(String)"
});
formatter.result({
  "duration": 39799452632,
  "status": "passed"
});
formatter.after({
  "duration": 1524241823,
  "status": "passed"
});
});
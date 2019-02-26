package com.shoppingexpress.stepdef.common;

import com.shoppingexpress.online.HomePage;
import com.shoppingexpress.online.OrderConfirmationPage;
import com.shoppingexpress.online.OrderConformationPopUp;
import com.shoppingexpress.online.ShoppingCartSummaryPage;
import com.shoppingexpress.online.authentication.AuthenticationPage;
import com.shoppingexpress.online.authentication.UserCreationPage;
import com.shoppingexpress.online.delivery.AddressPage;
import com.shoppingexpress.online.delivery.ShippingPage;
import com.shoppingexpress.online.payment.PaymentConfirmationPage;
import com.shoppingexpress.online.payment.PaymentOptionPage;
import com.shoppingexpress.online.search.ViewSearchItemsPage;


public class SharedState {
    public HomePage homePage;
    public ViewSearchItemsPage viewSearchItemsPage;
    public OrderConformationPopUp orderConformationPopUp;
    public ShoppingCartSummaryPage shoppingCartSummaryPage;
    public UserCreationPage userCreationPage;
    public AuthenticationPage authenticationPage;
    public AddressPage addressPage;
    public ShippingPage shippingPage;
    public PaymentOptionPage paymentOptionPage;
    public PaymentConfirmationPage paymentConfirmationPage;
    public OrderConfirmationPage orderConfirmationPage;
}

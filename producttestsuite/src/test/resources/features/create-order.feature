@E2ERegression

Feature: Order creation by a new user and exsiting user

  Background:
    Given user navigate to the online shopping home page

  Scenario: create an order by a new user
    When enter the item name "Dress" in to the search text field
    And click on search button on home page
    And add selected item "1" to the cart
    And click on proceed button to navigate to the view shopping cart summary
    And click on proceed button to navigate to the view authentication details
    And enter email id "abc2019fthj@gmail.com" to create a new user account
    And click create account button to create a new user
    And create a new user with following values
      | <field>                                      | <value>         |
      | Title                                        | Mrs             |
      | First name                                   | FTest           |
      | Last name                                    | LTest           |
      | Password                                     | abc123          |
      | Date of Birth                                | 10-5-2018       |
      | Company                                      | Lseg            |
      | Address                                      | Colombo         |
      | Address (Line 2)                             | Colombo -2      |
      | City                                         | Colombo         |
      | State                                        | California      |
      | Zip/Postal Code                              | 00000            |
      | Country                                      | United States   |
      | Additional information                       | Testing purpose |
      | Home phone                                   | 7898799995      |
      | Mobile phone                                 | 7898799995      |
      | Receive special offers from our partners!    | YES             |
      | Sign up for our newsletter!                  | YES             |
    And click on the button register to create a new user
    And click on proceed button on the address summary view
    And accept the terms and condition on shipping
    And click on proceed button on the shipping summary view
    And select on Pay by bank wire option
    And click on order confirmation button on the payment confirmation view
    Then system should display "Your order on My Store is complete." the confirmation message

  Scenario: create an order by an existing user
    When user click on sign in button on the home page
    And user "abc2019fthj@gmail.com" log into shopping cart with password "abc123"
    And user click on sign in butn on the authentication page
    And enter the item name "Dress" in to the search text field
    And click on search button on home page
    And add selected item "1" to the cart
    And click on proceed button to navigate to the view shopping cart summary
    And click on proceed button to navigate to the adress summary details
    And click on proceed button on the address summary view
    And accept the terms and condition on shipping
    And click on proceed button on the shipping summary view
    And select on Pay by bank wire option
    And click on order confirmation button on the payment confirmation view
    Then system should display "Your order on My Store is complete." the confirmation message




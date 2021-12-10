@RegressionTest
Feature: HepsiBuradaTestCase

  Scenario: AddProductToBasketByLogin
    Given I am on the home page
    When I click on the login page button
    When I enter the "hhakangul@outlook.com" email address
    When I click on the sign in button
    When I enter the "y37$36h8k#h" password
    When I click on the login
    Then Wait for the home page to load and checkout login
    When I search for the "telefon" product
    Then I should see the products
    When I click on the product
    Then I changed the window tab
    And I check to product page
    When I click on the other seller
    When I click on the add product to basket first seller
    And I click to do not want a repair pack
    And I click to close popup
    And I click on the add product to basket different second seller
    And I click to do not want a repair pack
    And I click to close popup
    And I click to my basket
    Then I should see the product added to the basket from different sellers





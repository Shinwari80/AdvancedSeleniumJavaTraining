Feature: Checkout Products

  Scenario: User is able tho checkout products the shopping cart


    Given user enters valid username in the email field
    And user enters valid password in the password field
    And user clicks on the login button

    Given user clicks on Show All Notebooks and Laptops link
    And user clicks on HDCompter product
    And user enters the quantity of the product
    When user clicks on add to Cart button for Macbook product
    And user clicks on Shopping Cart link
    Then Macbook product is added to the shopping cart

    #And User clicks on Checkout button
    #Then the User clicks on the continue button

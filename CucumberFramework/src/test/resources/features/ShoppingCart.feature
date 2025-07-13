Feature: Add Products to Shopping Cart

    Scenario: User is able tho add products into the shopping cart

      Given user enters valid username in the email field
      When user enters valid password in the password field
      Then user clicks on the login button
      #When user hoverOver to Laptops&NoteBooks link
      When user clicks the Laptops&NoteBooks link
      And the user clicks on the Show All Notebooks and Laptops link
      #When user clicks on Show All Notebooks and Laptops link
      And user clicks on Mackbook product
      And user enters the quantity of the product
      And user clicks on add to Cart button for Macbook product
      And user clicks on Shopping Cart link
      Then Macbook product is added to the shopping cart

      When the user clicks on the remove button
      Then the User clicks on the continue button

      Given user clicks on Show All Notebooks and Laptops link
      And user clicks on HDCompter product
      And user enters the quantity of the product
      When user clicks on add to Cart button for Macbook product
      And user clicks on Shopping Cart link
      Then Macbook product is added to the shopping cart


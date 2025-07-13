package com.qascript.StepDefs;

import com.qascript.PageObjects.HomePage;
import com.qascript.PageObjects.ProductsPage;
import com.qascript.PageObjects.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefs {

    @When("user clicks on Show All Notebooks and Laptops link")
    public void userClicksOnShowAllNotebooksAndLaptopsLink() {

        HomePage.clickAllLaptopsAnNoteBooks();
    }

    @And("user clicks on add to Cart button for Macbook product")
    public void userClicksOnAddToCartButtonForMacbookProduct() {
        //ProductsPage.validateProduct("Mackbook");
       // ProductsPage.validatePrice("$602.00");
        ProductsPage.clickAddToCardButton();
    }
    @Then("Macbook product is added to the shopping cart")
    public void macbookProductIsAddedToTheShoppingCart() {

        //ShoppingCartPage.validateProductName("MackBook");
        ShoppingCartPage.validateProdQuantity("1");


    }

    @And("user clicks on Mackbook product")
    public void userClicksOnMackbookProduct() {

        ProductsPage.clickProduct();

    }

    @And("user enters the quantity of the product")
    public void userEntersTheQuantityOfTheProduct() {

        ProductsPage.enterQuantity("1");
    }

    @And("user clicks on Shopping Cart link")
    public void userClicksOnShoppingCartLink() {

        HomePage.clickShoppingCart();
    }

    @When("the user clicks on the remove button")
    public void theUserClicksOnTheRemoveButton() {

        ShoppingCartPage.clickRemoveBtn();
    }

    @Then("the User clicks on the continue button")
    public void theUserClicksOnTheContinueButton() {
        ShoppingCartPage.clickContinueBUTTON();
    }

    @And("user clicks on HDCompter product")
    public void userClicksOnHDCompterProduct() {
        ShoppingCartPage.clickHDProducts();
    }

    @When("user hoverOver to Laptops&NoteBooks link")
    public void userHoverOverToLaptopsNoteBooksLink() {
        ProductsPage.hoverOverLaptopsBtn();

    }

    @And("the user clicks on the Show All Notebooks and Laptops link")
    public void theUserClicksOnTheShowAllNotebooksAndLaptopsLink() {

        ProductsPage.clickShowallLapTopsAndNoteBOOKSLINK();
    }

    @When("user clicks the Laptops&NoteBooks link")
    public void userClicksTheLaptopsNoteBooksLink() {

        ProductsPage.ClickLaptopsAndNoteBooksBtn();
    }
}

package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.Utils.BrowserUtils;

public class ProductsPage extends BaseClass {

    private static String LinkMackBook = "//a[text()='MacBook']";
    private static String btnAddToCart = "//button[@id='button-cart']";
    private static String txtPriceHeading = "(//div[@id='product']//ancestor::div)[5]//ul[2]/li/h2";
    private static String  txtProductHeading = "(//div[@id='product']//ancestor::div)[5]//h1";
    private static String txtBoxQuantity = "//input[@id='input-quantity']";
    private static String HoverOverLaptopsAndNoteBooksBtn = "(//a[text()='Laptops & Notebooks'])[1]";
    private static String ClickLaptopsAndNoteBooksBtn = "(//*[@id=\"menu\"]/div[2]/ul/li[2]/a";
    private static String LinkShowAllLaptopsAndNoteBooks ="//a[text()='Show AllLaptops & Notebooks']";


    public static void clickProduct(){
        BrowserUtils.clickElement(LinkMackBook);
    }
    public static void validateProduct(String expectedProductName){
        BrowserUtils.validateText(txtProductHeading, expectedProductName);
    }
    public static void validatePrice(String expectedPrice){
        BrowserUtils.validateText(txtPriceHeading, expectedPrice);
    }
    public static void clickAddToCardButton (){
        BrowserUtils.clickElement(btnAddToCart);
    }

    public static void enterQuantity(String quanity){

        BrowserUtils.enterText(txtBoxQuantity, quanity);
    }
public static void hoverOverLaptopsBtn(){

BrowserUtils.hoverOvderElement(HoverOverLaptopsAndNoteBooksBtn);
}
public static void clickShowallLapTopsAndNoteBOOKSLINK (){

        BrowserUtils.clickElement(LinkShowAllLaptopsAndNoteBooks);
}
public static void ClickLaptopsAndNoteBooksBtn (){

        BrowserUtils.clickElement(ClickLaptopsAndNoteBooksBtn);
}

}




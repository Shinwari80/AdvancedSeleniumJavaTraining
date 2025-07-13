package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.Utils.BrowserUtils;

public class ShoppingCartPage extends BaseClass {

    private static String linkMackbook ="//a[text()='MacBook']";
    private static String linkHDCOMputer ="//a[text()='HP LP3065']";
    private static String linkProductNew ="//a[contains(@href, 'product_id')]";
    private static String btnCheckOut ="//a[text()='Checkout']";
    private static String btnContinuesShopping = "//a[text()='Continue Shopping']";
    private static String linkProduct ="(//a[text()='MacBook'])[2]";
    private static String txtboxQuantity = "(//div[@class='input-group btn-block'])//input";
    private static String btnRemove = "//button[@class='btn btn-danger']";
    private static String btnContinues = "//a[text()='Continue']";
    public static void clickCheckOut(){

        BrowserUtils.clickElement(btnCheckOut);
    }
    public static void clickContinueShopping(){

        BrowserUtils.clickElement(btnContinuesShopping);
    }
    public static void validateProductName(String expectedProdName){BrowserUtils.validateText(linkProduct, expectedProdName);
    }

    public static void validateProdQuantity (String expectedQuantity){BrowserUtils.validateValue(txtboxQuantity, expectedQuantity, "value");

    }
    public static void clickProducts() {

        BrowserUtils.clickElement(linkMackbook);
    }

    public static void clickRemoveBtn(){

        BrowserUtils.clickElement(btnRemove);
    }

    public static void clickContinueBUTTON (){

        BrowserUtils.clickElement(btnContinues);
    }

    public static void clickHDProducts() {

        BrowserUtils.clickElement(linkHDCOMputer);
    }
}


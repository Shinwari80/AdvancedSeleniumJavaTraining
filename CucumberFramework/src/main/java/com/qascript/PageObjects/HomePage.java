package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.Utils.BrowserUtils;

public class HomePage extends BaseClass {


    private static String myAccountText = "//div[@id='content']/h2[text()='My Account']";
    private static String LinkShowAllLaptopsAndNoteBooks ="//a[text()='Show AllLaptops & Notebooks']";
    private static String LinkLapTopAndNoteBooks = "(//a[text()='Laptops & Notebooks'])[1]";
   private static String clickShoppingCarBtn = "//a[@title='Shopping Cart']";

    public static void validateLogin(String expectedText){

        BrowserUtils.validateText(myAccountText, expectedText);
    }

    public static void havorOverLaptopsAnNoteBooks(){

        BrowserUtils.hoverAndClickOnElement(LinkLapTopAndNoteBooks, LinkShowAllLaptopsAndNoteBooks);
    }

    public static void clickAllLaptopsAnNoteBooks(){

        BrowserUtils.hoverAndClickOnElement(LinkLapTopAndNoteBooks, LinkShowAllLaptopsAndNoteBooks);
    }

    public static void clickShoppingCart(){

        BrowserUtils.clickElement(clickShoppingCarBtn);
    }
}

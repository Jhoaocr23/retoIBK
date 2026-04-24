package com.interbank.shop.locators;

import org.openqa.selenium.By;

public class ShopPageLocators {
    
    // Navigation
    public static final By MENS_OUTERWEAR = By.xpath("//a[contains(text(), \"Men's Outerwear\")]");
    public static final By WOMENS_OUTERWEAR = By.xpath("//a[contains(text(), \"Women's Outerwear\")]");
    public static final By WOMENS_TSHIRTS = By.xpath("//a[contains(text(), \"Women's T-Shirts\")]");
    public static final By MENS_TSHIRTS = By.xpath("//a[contains(text(), \"Men's T-Shirts\")]");
    
    // Product Selection
    public static final By PRODUCT_ITEM = By.xpath("//div[@class='product-item']");
    public static final By PRODUCT_NAME = By.xpath(".//h2[@class='product-name']");
    public static final By PRODUCT_PRICE = By.xpath(".//span[@class='product-price']");
    public static final By ADD_TO_CART_BUTTON = By.xpath("//button[contains(text(), 'ADD TO CART')]");
    
    // Size Selection
    public static final By SIZE_SELECTOR = By.xpath("//select[@id='size']");
    public static final By SIZE_OPTION = By.xpath("//option[@value='%s']");
    
    // Cart
    public static final By CART_ICON = By.xpath("//a[@class='cart-icon']");
    public static final By CART_TOTAL = By.xpath("//div[@class='cart-total']//span[@class='price']");
    public static final By CART_ITEMS = By.xpath("//div[@class='cart-item']");
    public static final By CART_ITEM_NAME = By.xpath(".//span[@class='item-name']");
    public static final By CART_ITEM_SIZE = By.xpath(".//span[@class='item-size']");
    public static final By CART_ITEM_PRICE = By.xpath(".//span[@class='item-price']");
    public static final By CHECKOUT_BUTTON = By.xpath("//button[contains(text(), 'CHECKOUT')]");
    
    // Checkout
    public static final By EMAIL_INPUT = By.id("email");
    public static final By FIRST_NAME_INPUT = By.id("firstName");
    public static final By LAST_NAME_INPUT = By.id("lastName");
    public static final By ADDRESS_INPUT = By.id("address");
    public static final By CITY_INPUT = By.id("city");
    public static final By STATE_INPUT = By.id("state");
    public static final By ZIP_INPUT = By.id("zip");
    public static final By COUNTRY_INPUT = By.id("country");
    public static final By PHONE_INPUT = By.id("phone");
    
    // Payment
    public static final By CARD_NUMBER_INPUT = By.id("cardNumber");
    public static final By CARD_NAME_INPUT = By.id("cardName");
    public static final By EXPIRY_INPUT = By.id("expiry");
    public static final By CVV_INPUT = By.id("cvv");
    public static final By PLACE_ORDER_BUTTON = By.xpath("//button[contains(text(), 'PLACE ORDER')]");
    
    // Confirmation
    public static final By ORDER_CONFIRMATION = By.xpath("//div[@class='order-confirmation']");
    public static final By ORDER_NUMBER = By.xpath("//span[@class='order-number']");
    public static final By CONFIRMATION_MESSAGE = By.xpath("//div[@class='confirmation-message']");
}

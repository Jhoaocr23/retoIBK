package com.interbank.shop.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class CartItemDetails implements Question<String> {
    
    @Override
    public String answeredBy(Actor actor) {
        Target cartItemsContainer = Target.the("Cart items")
                .locatedBy("//div[@class='cart-item']");
        
        return cartItemsContainer.resolveFor(actor).getText();
    }
    
    public static CartItemDetails displayed() {
        return new CartItemDetails();
    }
}

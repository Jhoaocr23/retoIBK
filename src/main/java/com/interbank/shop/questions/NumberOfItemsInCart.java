package com.interbank.shop.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class NumberOfItemsInCart implements Question<Integer> {
    
    @Override
    public Integer answeredBy(Actor actor) {
        
        Target cartItems = Target.the("Cart items")
                .locatedBy("//div[@class='cart-item']");
        
        return cartItems.resolveAllFor(actor).size();
    }
    
    public static NumberOfItemsInCart inTheCart() {
        return new NumberOfItemsInCart();
    }
}

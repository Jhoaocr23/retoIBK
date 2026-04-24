package com.interbank.shop.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class CartTotal implements Question<String> {
    
    @Override
    public String answeredBy(Actor actor) {
        
        Target totalPrice = Target.the("Cart total")
                .locatedBy("//div[@class='cart-total']//span[@class='price']|//span[contains(text(), '$')]");
        
        return totalPrice.resolveFor(actor).getText();
    }
    
    public static CartTotal displayed() {
        return new CartTotal();
    }
}

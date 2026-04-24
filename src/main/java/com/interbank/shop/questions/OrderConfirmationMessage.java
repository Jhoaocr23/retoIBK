package com.interbank.shop.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class OrderConfirmationMessage implements Question<String> {
    
    @Override
    public String answeredBy(Actor actor) {
        Target confirmationMsg = Target.the("Confirmation message")
                .locatedBy("//div[@class='confirmation-message']|//h1");
        
        return confirmationMsg.resolveFor(actor).getText();
    }
    
    public static OrderConfirmationMessage displayed() {
        return new OrderConfirmationMessage();
    }
}

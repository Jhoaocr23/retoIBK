package com.interbank.shop.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProceedToCheckout implements Task {
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        Target checkoutButton = Target.the("Checkout button")
                .locatedBy("//button[contains(text(), 'CHECKOUT')]");
        actor.attemptsTo(Click.on(checkoutButton));
    }
    
    public static ProceedToCheckout byClickingCheckoutButton() {
        return instrumented(ProceedToCheckout.class);
    }
}

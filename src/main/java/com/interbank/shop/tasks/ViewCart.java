package com.interbank.shop.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewCart implements Task {
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        Target cartIcon = Target.the("Cart icon").locatedBy("//a[@aria-label='Shopping cart, no items']|//a[@aria-label*='Shopping cart']");
        actor.attemptsTo(Click.on(cartIcon));
    }
    
    public static ViewCart byClickingCartIcon() {
        return instrumented(ViewCart.class);
    }
}

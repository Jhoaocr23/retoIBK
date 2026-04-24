package com.interbank.shop.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenShopPage implements Task {
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://shop.polymer-project.org/"));
    }
    
    public static OpenShopPage openShop() {
        return instrumented(OpenShopPage.class);
    }
}

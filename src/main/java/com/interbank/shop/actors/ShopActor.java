package com.interbank.shop.actors;

import net.serenitybdd.screenplay.Actor;

public class ShopActor {
    
    public static Actor named(String name) {
        return Actor.named(name);
    }
}

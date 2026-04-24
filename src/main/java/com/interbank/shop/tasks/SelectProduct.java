package com.interbank.shop.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProduct implements Task {
    
    private String productName;
    private String size;
    private String category;
    
    public SelectProduct(String category, String productName, String size) {
        this.category = category;
        this.productName = productName;
        this.size = size;
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Click on category
        Target categoryLink = Target.the(category).locatedBy("//a[contains(text(), '" + category + "')]");
        actor.attemptsTo(Click.on(categoryLink));
        
        // Find and click on product
        Target productItem = Target.the(productName)
                .locatedBy("//div[@class='product-item']//h2[contains(text(), '" + productName + "')]/ancestor::div[@class='product-item']");
        actor.attemptsTo(Click.on(productItem));
        
        // Wait for modal and select size
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        Target sizeSelect = Target.the("Size selector").locatedBy("//select[@id='size']");
        actor.attemptsTo(SelectFromOptions.byVisibleText(size).from(sizeSelect));
        
        // Click Add to Cart
        Target addToCartBtn = Target.the("Add to cart button").locatedBy("//button[contains(text(), 'ADD TO CART')]");
        actor.attemptsTo(Click.on(addToCartBtn));
    }
    
    public static SelectProduct withDetails(String category, String productName, String size) {
        return instrumented(SelectProduct.class, category, productName, size);
    }
}

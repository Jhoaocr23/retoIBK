package com.interbank.shop.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteCheckout implements Task {
    
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    
    public CompleteCheckout(String email, String firstName, String lastName, 
                           String address, String city, String state, String zip) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Fill email
        Target emailField = Target.the("Email field").locatedBy("//input[@name='email']");
        actor.attemptsTo(Enter.theValue(email).into(emailField));
        
        // Fill name
        Target firstNameField = Target.the("First name").locatedBy("//input[@name='firstName']");
        actor.attemptsTo(Enter.theValue(firstName).into(firstNameField));
        
        Target lastNameField = Target.the("Last name").locatedBy("//input[@name='lastName']");
        actor.attemptsTo(Enter.theValue(lastName).into(lastNameField));
        
        // Fill address
        Target addressField = Target.the("Address").locatedBy("//input[@name='address']");
        actor.attemptsTo(Enter.theValue(address).into(addressField));
        
        // Fill city
        Target cityField = Target.the("City").locatedBy("//input[@name='city']");
        actor.attemptsTo(Enter.theValue(city).into(cityField));
        
        // Fill state
        Target stateField = Target.the("State").locatedBy("//input[@name='state']");
        actor.attemptsTo(Enter.theValue(state).into(stateField));
        
        // Fill zip
        Target zipField = Target.the("Zip").locatedBy("//input[@name='zip']");
        actor.attemptsTo(Enter.theValue(zip).into(zipField));
    }
    
    public static CompleteCheckout withUserData(String email, String firstName, String lastName,
                                               String address, String city, String state, String zip) {
        return instrumented(CompleteCheckout.class, email, firstName, lastName, address, city, state, zip);
    }
}

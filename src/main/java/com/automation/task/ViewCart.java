package com.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import com.automation.model.PersonalDetail;
import com.automation.page.CheckoutOptionPage;
import com.automation.page.ViewCartPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewCart implements Task {

    private PersonalDetail billingDetails;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ViewCartPage.BUTTON_VIEW_CART),
                Click.on(ViewCartPage.SELECT_VIEW_CART),
                Click.on(ViewCartPage.BUTTON_CHECKOUT),
                Click.on(CheckoutOptionPage.RADIO_GUEST_CHECKOUT),
                Click.on(CheckoutOptionPage.BUTTON_CONTINUE)
        );
    }

    public static Performable view(){
        return instrumented(ViewCart.class);
    }
}

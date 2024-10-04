package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.model.PersonalDetail;
import starter.page.MyStorePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewCart implements Task {

    private PersonalDetail billingDetails;

    @Override
    public <T extends Actor> void performAs(T actor) {
        //billingDetails = new BillingDetails("Liliana", "Chacha","lfcb@hotmail.es","0993556202","My company", "El Inca", "", "Quito", "593", "Ecuador", "Pichincha");

        actor.attemptsTo(
                Click.on(MyStorePage.BUTTON_VIEW_CART),
                Click.on(MyStorePage.SELECT_VIEW_CART),
                Click.on(MyStorePage.BUTTON_CHECKOUT),
                Click.on(MyStorePage.RADIO_GUEST_CHECKOUT),
                Click.on(MyStorePage.BUTTON_CONTINUE)

        );
    }

    public static Performable view(){
        return instrumented(ViewCart.class);
    }
}

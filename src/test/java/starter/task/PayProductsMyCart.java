package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.model.PersonalDetail;
import starter.page.MyStorePage;
import starter.questions.IsRadioButtonSelected;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PayProductsMyCart implements Task {

    private PersonalDetail personalDetail;

    public PayProductsMyCart(PersonalDetail personalDetail){
        this.personalDetail = personalDetail;
    }

    public static PayProductsMyCart billDetails(PersonalDetail personalDetail){
        return instrumented(PayProductsMyCart.class, personalDetail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    Enter.theValue(personalDetail.getFirstName()).into(MyStorePage.INPUT_FIRSTNAME),
                    Enter.theValue(personalDetail.getLastName()).into(MyStorePage.INPUT_LASTNAME),
                    Enter.theValue(personalDetail.getEmail()).into(MyStorePage.INPUT_EMAIL),
                    Enter.theValue(personalDetail.getTelephone()).into(MyStorePage.INPUT_TELEPHONE),
                    Enter.theValue(personalDetail.getCompany()).into(MyStorePage.INPUT_COMPANY),
                    Enter.theValue(personalDetail.getAddress1()).into(MyStorePage.INPUT_ADRESS1),
                    Enter.theValue(personalDetail.getAddress2()).into(MyStorePage.INPUT_ADRESS2),
                    Enter.theValue(personalDetail.getCity()).into(MyStorePage.INPUT_CITY),
                    Enter.theValue(personalDetail.getPostCode()).into(MyStorePage.INPUT_POST_CODE),
                    WaitForElementTask.visible(MyStorePage.SELECT_COUNTRY),
                    SelectFromOptions.byVisibleText(personalDetail.getCountry()).from(MyStorePage.SELECT_COUNTRY),
                    SelectFromOptions.byVisibleText(personalDetail.getState()).from(MyStorePage.SELECT_STATE),
                    Click.on(MyStorePage.BUTTON_CONTINUE_GUEST),
                    Click.on(MyStorePage.BUTTON_SHIPPING_METHOD),
                    WaitUntil.the(MyStorePage.CHECK_TERMS_CONDITIONS, isVisible()).forNoMoreThan(10).seconds(),
                    SetCheckbox.of(MyStorePage.CHECK_TERMS_CONDITIONS).toFalse().afterWaitingUntilEnabled(),
                    Click.on(MyStorePage.CHECK_TERMS_CONDITIONS),
                    Click.on(MyStorePage.BUTTON_PAY_METHOD),
                    Click.on(MyStorePage.BUTTON_PAY_CONFIRM),
                    Ensure.that(MyStorePage.MESSAGE_SUCCESS_PROCESS).hasText("Your order has been placed!")
            );

            boolean isSelected = IsRadioButtonSelected.forTarget(MyStorePage.CHECK_TERMS_CONDITIONS).answeredBy(actor);
            System.out.println("*** Es seleccionado?? " + isSelected);
            if (!isSelected) {
                throw new RuntimeException("El radio button no está seleccionado.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

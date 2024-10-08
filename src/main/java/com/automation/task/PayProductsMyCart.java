package com.automation.task;

import com.automation.page.BillingDetailsPage;
import com.automation.page.ConfirmOrderPage;
import com.automation.page.DeliveryMethodPage;
import com.automation.page.PayMethodPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import com.automation.model.PersonalDetail;

import static net.serenitybdd.screenplay.Tasks.instrumented;

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
                    Enter.theValue(personalDetail.getFirstName()).into(BillingDetailsPage.INPUT_FIRSTNAME),
                    Enter.theValue(personalDetail.getLastName()).into(BillingDetailsPage.INPUT_LASTNAME),
                    Enter.theValue(personalDetail.getEmail()).into(BillingDetailsPage.INPUT_EMAIL),
                    Enter.theValue(personalDetail.getTelephone()).into(BillingDetailsPage.INPUT_TELEPHONE),
                    Enter.theValue(personalDetail.getCompany()).into(BillingDetailsPage.INPUT_COMPANY),
                    Enter.theValue(personalDetail.getAddress1()).into(BillingDetailsPage.INPUT_ADRESS1),
                    Enter.theValue(personalDetail.getAddress2()).into(BillingDetailsPage.INPUT_ADRESS2),
                    Enter.theValue(personalDetail.getCity()).into(BillingDetailsPage.INPUT_CITY),
                    Enter.theValue(personalDetail.getPostCode()).into(BillingDetailsPage.INPUT_POST_CODE),
                    WaitForElementTask.visible(BillingDetailsPage.SELECT_COUNTRY),
                    SelectFromOptions.byVisibleText(personalDetail.getCountry()).from(BillingDetailsPage.SELECT_COUNTRY),
                    SelectFromOptions.byVisibleText(personalDetail.getState()).from(BillingDetailsPage.SELECT_STATE),
                    Click.on(BillingDetailsPage.BUTTON_CONTINUE_GUEST),
                    Click.on(DeliveryMethodPage.BUTTON_SHIPPING_METHOD),
                    SetCheckbox.of(PayMethodPage.CHECK_TERMS_CONDITIONS).toFalse().afterWaitingUntilEnabled(),
                    Click.on(PayMethodPage.CHECK_TERMS_CONDITIONS),
                    Click.on(PayMethodPage.BUTTON_PAY_METHOD),
                    Click.on(PayMethodPage.BUTTON_PAY_CONFIRM),
                    Ensure.that(ConfirmOrderPage.MESSAGE_SUCCESS_PROCESS).hasText("Your order has been placed!")
            );
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

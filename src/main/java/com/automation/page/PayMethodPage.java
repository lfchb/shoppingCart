package com.automation.page;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PayMethodPage extends PageObject {
    public static final Target CHECK_TERMS_CONDITIONS = Target.the("'CHECK TERMS & CONDITIONS'").locatedBy("//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]");
    public static final Target BUTTON_PAY_METHOD = Target.the("'Button shipping method'").locatedBy("//input[@id='button-payment-method']");
    public static final Target BUTTON_PAY_CONFIRM = Target.the("'Button pay confirm'").locatedBy("//input[@id='button-confirm']");
}

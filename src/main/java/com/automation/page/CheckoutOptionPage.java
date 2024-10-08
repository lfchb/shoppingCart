package com.automation.page;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutOptionPage {
    public static final Target RADIO_GUEST_CHECKOUT = Target.the("'Radio button Guest'").locatedBy("//input[@type='radio' and @name='account' and @value='guest']");
    public static final Target BUTTON_CONTINUE = Target.the("'Button Continue'").locatedBy("//input[@type='button' and @id='button-account' and @value='Continue']");
}

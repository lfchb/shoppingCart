package com.automation.page;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class DeliveryMethodPage extends PageObject {
    public static final Target BUTTON_SHIPPING_METHOD = Target.the("'Button shipping method'").locatedBy("//input[@id='button-shipping-method']");
}

package starter.page;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ConfirmOrderPage extends PageObject {
    public static final Target MESSAGE_SUCCESS_PROCESS = Target.the("'Button pay confirm'").locatedBy("//h1[contains(text(), 'Your order has been placed')]");
}

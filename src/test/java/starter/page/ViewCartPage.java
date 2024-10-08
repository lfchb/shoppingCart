package starter.page;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ViewCartPage extends PageObject {
    public static final Target BUTTON_VIEW_CART = Target.the("'Boton items'").locatedBy("//button[span[@id='cart-total' and contains(text(), 'item(s)')]]");
    public static final Target SELECT_VIEW_CART = Target.the("'Ver carrito de compras'").locatedBy("//a[contains(@href, 'route=checkout/cart')]/strong");
    public static final Target BUTTON_CHECKOUT = Target.the("'Button checkout'").locatedBy("//a[contains(@href, 'route=checkout/checkout') and contains(@class, 'btn btn-primary')]");
}

package starter.page;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class MyStorePage extends PageObject {

    public static final Target LABEL_DESKTOPS = Target.the("'Desktops'").locatedBy("//a[@class='dropdown-toggle' and text()='Desktops']");
    public static final Target SELECT_MENU_ITEM_1 = Target.the("Mac 1").locatedBy("//a[text()='Mac (1)']");
    public static final Target SELECT_ITEM_AVAILABLE_1 = Target.the("'MacBook'").locatedBy("//button[contains(@onclick, \"cart.add('41\")]");
    public static final Target LABEL_CAMERAS = Target.the("'Cameras'").locatedBy("//a[text()='Cameras']");
    public static final Target SELECT_ITEM_AVAILABLE_2 = Target.the("'MacBook'").locatedBy("//button[contains(@onclick, \"cart.add('30\")]");
    public static final Target SELECT_ITEMS_LIST = Target.the("'MacBook'").locatedBy("//select[@id='input-option226']");
    public static final Target SELECT_ITEM_AVAILABLE_2_BLUE = Target.the("'MacBook'").locatedBy("//select[@id='input-option226']/option[@value='16']");
    public static final Target BUTTON_ADD_TO_CART = Target.the("'MacBook'").locatedBy("//button[@id='button-cart']");
    public static final Target BUTTON_VIEW_CART = Target.the("'Boton items'").locatedBy("//button[span[@id='cart-total' and contains(text(), 'item(s)')]]");
    public static final Target SELECT_VIEW_CART = Target.the("'Ver carrito de compras'").locatedBy("//a[contains(@href, 'route=checkout/cart')]/strong");
    public static final Target SELECT_ITEM_NOT_AVAILABLE_1 = Target.the("'MacBook'").locatedBy("//button[contains(@onclick, \"cart.add('43\")]");
    public static final Target SELECT_ITEM_NOT_AVAILABLE_2 = Target.the("'Iphone'").locatedBy("//button[contains(@onclick, \"cart.add('40\")]");
    public static final Target MESSAGE_NOT_EXIT_PRODUCT = Target.the("'Ver carrito de compras'").locatedBy("//div[contains(@class, 'alert-danger')]");
    public static final Target BUTTON_CHECKOUT = Target.the("'Button checkout'").locatedBy("//a[contains(@href, 'route=checkout/checkout') and contains(@class, 'btn btn-primary')]");
    public static final Target RADIO_GUEST_CHECKOUT = Target.the("'Radio button Guest'").locatedBy("//input[@type='radio' and @name='account' and @value='guest']");
    public static final Target BUTTON_CONTINUE = Target.the("'Button Continue'").locatedBy("//input[@type='button' and @id='button-account' and @value='Continue']");
    public static final Target INPUT_FIRSTNAME = Target.the("'First name'").locatedBy("//input[@id='input-payment-firstname']");
    public static final Target INPUT_LASTNAME = Target.the("'Last name'").locatedBy("//input[@id='input-payment-lastname']");
    public static final Target INPUT_EMAIL = Target.the("'Email'").locatedBy("//input[@id='input-payment-email']");
    public static final Target INPUT_TELEPHONE = Target.the("'Telephone'").locatedBy("//input[@id='input-payment-telephone']");
    public static final Target INPUT_COMPANY = Target.the("'Company'").locatedBy("//input[@id='input-payment-company']");
    public static final Target INPUT_ADRESS1 = Target.the("'Adress 1'").locatedBy("//input[@id='input-payment-address-1']");
    public static final Target INPUT_ADRESS2 = Target.the("'Adress 2'").locatedBy("//input[@id='input-payment-address-2']");
    public static final Target INPUT_CITY = Target.the("'City'").locatedBy("//input[@id='input-payment-city']");
    public static final Target INPUT_POST_CODE = Target.the("'Post code'").locatedBy("//input[@id='input-payment-postcode']");
    public static final Target SELECT_COUNTRY = Target.the("'Country select'").locatedBy("//select[@id='input-payment-country']");
    public static final Target SELECT_STATE = Target.the("'State'").locatedBy("//select[@name='zone_id']");
    public static final Target BUTTON_CONTINUE_GUEST = Target.the("'Button Continue guest'").locatedBy("//input[@id='button-guest']");
    public static final Target BUTTON_SHIPPING_METHOD = Target.the("'Button shipping method'").locatedBy("//input[@id='button-shipping-method']");
    public static final Target CHECK_TERMS_CONDITIONS = Target.the("'CHECK TERMS & CONDITIONS'").locatedBy("//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]");
    public static final Target BUTTON_PAY_METHOD = Target.the("'Button shipping method'").locatedBy("//input[@id='button-payment-method']");
    public static final Target BUTTON_PAY_CONFIRM = Target.the("'Button pay confirm'").locatedBy("//input[@id='button-confirm']");
    public static final Target MESSAGE_SUCCESS_PROCESS = Target.the("'Button pay confirm'").locatedBy("//h1[contains(text(), 'Your order has been placed')]");
}

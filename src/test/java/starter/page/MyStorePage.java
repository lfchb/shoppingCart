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
}

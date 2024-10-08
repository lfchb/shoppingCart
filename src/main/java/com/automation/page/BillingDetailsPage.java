package com.automation.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BillingDetailsPage extends PageObject {
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
}

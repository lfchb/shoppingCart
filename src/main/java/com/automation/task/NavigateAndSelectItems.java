package com.automation.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import com.automation.page.MyStorePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateAndSelectItems implements Task {

    public static Performable withProducts(){
        return instrumented(NavigateAndSelectItems.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MyStorePage.LABEL_DESKTOPS),
                Click.on(MyStorePage.SELECT_MENU_ITEM_1),
                Click.on(MyStorePage.SELECT_ITEM_AVAILABLE_1),
                Click.on(MyStorePage.LABEL_CAMERAS),
                Click.on(MyStorePage.SELECT_ITEM_AVAILABLE_2),
                Click.on(MyStorePage.SELECT_ITEMS_LIST),
                Click.on(MyStorePage.SELECT_ITEM_AVAILABLE_2_BLUE),
                Click.on(MyStorePage.BUTTON_ADD_TO_CART)
        );
    }

}

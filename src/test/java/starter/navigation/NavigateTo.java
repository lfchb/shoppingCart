package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable myStorePage() {
        return Task.where("{0} opens the Your Store home page",
                Open.browserOn().the(YourStoreGoHomePage.class));
    }
}

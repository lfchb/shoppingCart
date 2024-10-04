package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.targets.Target;

public class IsRadioButtonSelected implements Question<Boolean> {

    private final Target radioButton;

    public IsRadioButtonSelected(Target radioButton) {
        this.radioButton = radioButton;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return radioButton.resolveFor(actor).isSelected();
    }

    public static IsRadioButtonSelected forTarget(Target radioButton) {
        return new IsRadioButtonSelected(radioButton);
    }
}

package com.automation.task;

import com.automation.questions.TheVisibility;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitForElementTask implements Task {

    private final Target target;

    public WaitForElementTask(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int attempts = 0;
        boolean isVisible = false;

        while (attempts < 5 && !isVisible) {
            isVisible = actor.asksFor(TheVisibility.of(target));
            if (!isVisible) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            attempts++;
        }

        if (!isVisible) {
            throw new AssertionError("El target no es visible después de 5 intentos.");
        }
    }

    public static WaitForElementTask visible(Target target) {
        return instrumented(WaitForElementTask.class, target);
    }
}

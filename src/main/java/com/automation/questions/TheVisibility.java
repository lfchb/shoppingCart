package com.automation.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TheVisibility {
    public static Question<Boolean> of(Target target) {
        return actor -> {
            WebDriver driver = Serenity.getWebdriverManager().getWebdriver();
            WebElement element = driver.findElement(By.xpath(target.getCssOrXPathSelector()));
            return element.isDisplayed();
        };
    }
}

package com.automation.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.automation.model.Payment;
import com.automation.task.NavigateAndSelectItems;
import com.automation.task.PayProductsMyCart;
import com.automation.task.ViewCart;
import com.automation.page.NavigateTo;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddCartStepDefinitions extends BaseTest{

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) visita la pagina Your Store$")
    public void visita_la_pagina_your_store(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.myStorePage());
    }

    @When("Agrega productos al carrito de compras")
    public void agrega_un_producto_al_carrito_de_compras() {
        when(theActorInTheSpotlight()).wasAbleTo(NavigateAndSelectItems.withProducts());
    }

    @Then("Podra visualizar los items en la View cart")
    public void podrá_visualizar_el_item_en_la_view_cart() {
        then(theActorInTheSpotlight()).wasAbleTo(ViewCart.view());
    }

    @And("Realizar el pago")
    public void realizarElPago() {
        then(theActorInTheSpotlight()).wasAbleTo(PayProductsMyCart.billDetails(Payment.dataPersonalDetail()));
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

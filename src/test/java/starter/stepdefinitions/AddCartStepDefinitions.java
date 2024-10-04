package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.model.Payment;
import starter.task.NavigateAndSelectItems;
import starter.task.PayProductsMyCart;
import starter.task.ViewCart;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddCartStepDefinitions {

    String name;

    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) visita la pagina Your Store$")
    public void visita_la_pagina_your_store(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theDuckDuckGoHomePage());
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
}

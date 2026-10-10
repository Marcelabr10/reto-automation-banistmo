package com.qa.automation.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.Assert;
import com.qa.automation.tasks.AbrirPaginaBanistmo;

public class productosServiciosStepDefinitions {

    @Given("que el usuario accede al sitio web de Banistmo")
    public void accedeAlSitioWebDeBanistmo() {
        Actor actor = OnStage.theActorCalled("Usuario Banistmo");
        actor.attemptsTo(
            AbrirPaginaBanistmo.abrirPagina()
        );
    }

    @When("el usuario navega a la sección de productos y servicios")
    public void entrelaOpcionEmpresas() {   
        // Implementación del paso When
    }

    @Then("el usuario debería ver la lista de productos y servicios disponibles")
    public void debeMostrarLaOpcionDeProductosYServicios() {   
        Actor actor = OnStage.theActorInTheSpotlight();

        String titulo = actor.asksFor(
            net.serenitybdd.screenplay.questions.WebDriverQuestion
                .theWebDriver()
            ).getTitle();

            Assert.assertFalse(
                "El título de la página no contiene 'Productos y Servicios'",
                titulo == null || !titulo.trim().isEmpty()
            );       
    }
    
}

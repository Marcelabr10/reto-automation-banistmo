package com.qa.automation.actors;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

public class BanistmoActor {
    
    private BanistmoActor() {
    }

    public static Actor crearActor(WebDriver driver) {
        OnStage.setTheStage(new OnlineCast());
        Actor usuario = OnStage.theActorCalled("Usuario Banistmo");
        usuario.can(BrowseTheWeb.with(driver));
        return usuario;
    }
}

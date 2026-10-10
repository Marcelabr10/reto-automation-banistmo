package com.qa.automation.tasks;

import com.qa.automation.BanistmoConfig;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Actor;


public class AbrirPaginaBanistmo implements Task {
   
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(BanistmoConfig.BASE_URL));
    }

    public static AbrirPaginaBanistmo abrirPagina() {
        return Tasks.instrumented(AbrirPaginaBanistmo.class);
    }    
}

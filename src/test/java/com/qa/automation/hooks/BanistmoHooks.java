package com.qa.automation.hooks;

import com.qa.automation.actors.BanistmoActor;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;

public class BanistmoHooks {

    @Before
    public void setUp() {
        WebDriver driver = Serenity.getDriver();
        BanistmoActor.crearActor(driver);
    }
    
}

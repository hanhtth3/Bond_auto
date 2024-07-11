package com.vpbanks.features.managementcustomer;

import com.vpbanks.tasks.Login;
import com.vpbanks.ui.Elements;
import io.cucumber.java.an.E;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.SilentTask;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import org.htmlunit.javascript.host.event.MouseScrollEvent;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.vpbanks.tasks.Login;

@RunWith(SerenityRunner.class)
public class AddCustomerWhenValidData {

    Actor hanh = Actor.named("Hanh");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        hanh.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void login_with_valid_user() {

        hanh.wasAbleTo(
                Open.url(Elements.URL),
               /* Enter.theValue("hanhtth@vpbanks.com.vn").into(Elements.USERNAME_FIELD),
                Enter.theValue("Kofax@07").into(Elements.PASSWORD_FIELD),
                Click.on(Elements.PASSWORD_FIELD),
                Click.on(Elements.SUBMIT_BUTTON),
                Click.on(Elements.SCROLL_MENU),
                Click.on(Elements.IMG_BUTTON),
                Click.on(Elements.BOND_MENU),
                Click.on(Elements.CUSTOMER_MENU),*/
                WaitUntil.the(Elements.ADDCUSTOMER_BUTTON, isClickable()).forNoMoreThan(Duration.ofSeconds(30)),
                Click.on(Elements.ADDCUSTOMER_BUTTON)

        );
    }
}

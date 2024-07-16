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
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import org.htmlunit.javascript.host.event.MouseScrollEvent;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.waits.*;
import com.vpbanks.tasks.Login;
import org.htmlunit.javascript.host.event.MouseScrollEvent;
import java.time.Duration;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


@RunWith(SerenityRunner.class)
public class AddCustomerWhenValidDataTest {

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
                Enter.theValue("hanhtth@vpbanks.com.vn").into(Elements.USERNAME_FIELD),
                Enter.theValue("Kofax@07").into(Elements.PASSWORD_FIELD),
                Click.on(Elements.PASSWORD_FIELD),
                Click.on(Elements.SUBMIT_BUTTON),
                Click.on(Elements.BOND_HIDEMENU),
                Click.on(Elements.SCROLL_MENU),
               //WaitUntil.the(Elements.BOND_MENU, isClickable()).forNoMoreThan(Duration.ofSeconds(50)),
                Click.on(Elements.BOND_MENU),
                Click.on(Elements.CUSTOMER_MENU),
                Click.on(Elements.ADDCUSTOMER_BUTTON),
                Enter.theValue("116C121290").into(Elements.ACCOUNT_NO),
                Ensure.that().value().isEqualTo("40")
        );
    }
}
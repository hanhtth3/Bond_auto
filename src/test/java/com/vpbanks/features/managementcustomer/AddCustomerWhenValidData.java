package com.vpbanks.features.managementcustomer;

import com.vpbanks.tasks.Login;
import com.vpbanks.ui.Elements;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.SilentTask;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
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
                Login.ValidUser("hanhtth@vpbanks.com.vn","Kofax@07")

        );
    }
}
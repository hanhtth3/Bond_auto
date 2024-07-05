package com.vpbanks.tasks;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.SilentTask;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.targets.Target;
import org.jetbrains.annotations.NotNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.vpbanks.ui.Elements;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static org.hamcrest.Matchers.hasItem;

//@RunWith(SerenityRunner.class)
public class Login {
@NotNull
    public static Performable ValidUser(String email, String password) {
    return Task.where(" {0} Login with valid user ", actor -> actor.attemptsTo(
            Enter.theValue(email).into(Elements.USERNAME_FIELD),
            Enter.theValue(password).into(Elements.PASSWORD_FIELD),
            Click.on(Elements.SUBMIT_BUTTON)
    ));
}
}

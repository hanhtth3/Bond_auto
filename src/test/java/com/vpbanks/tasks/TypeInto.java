package com.vpbanks.tasks;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Keys;
public class TypeInto {
    public static Performable theValue(String value) {

        return Task.where("{0} type the vale into canvas element", actor -> {
            BrowseTheWeb.as(actor).withAction()
                    .sendKeys(value).release().perform();
        }
        )

    }
}

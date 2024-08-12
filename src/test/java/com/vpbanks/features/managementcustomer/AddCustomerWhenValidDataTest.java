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
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromElement;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.serenitybdd.screenplay.ui.Select;
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
import com.vpbanks.tasks.TypeInto,


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
                Enter.theValue("Kofax@08").into(Elements.PASSWORD_FIELD),
                Click.on(Elements.PASSWORD_FIELD),
                Click.on(Elements.SUBMIT_BUTTON),
                Click.on(Elements.BOND_HIDEMENU),
                Click.on(Elements.SCROLL_MENU),
               //WaitUntil.the(Elements.BOND_MENU, isClickable()).forNoMoreThan(Duration.ofSeconds(50)),
                Click.on(Elements.BOND_MENU),
                Click.on(Elements.CUSTOMER_MENU),
                Click.on(Elements.ADDCUSTOMER_BUTTON),
                Enter.theValue("116C121290").into(Elements.ACCOUNT_NO),
                Click.on(Elements.SEARCH_BUTTON),
                //WaitUntil.the(Elements.CUSTOMER_ISPRO, isClickable()).forNoMoreThan(Duration.ofSeconds(50)),
                Click.on(Elements.CUSTOMER_ISPRO),
                Click.on(Elements.CUSTOMER_PROBY),
                Click.on(Elements.CUSTOMER_PROBYVALUE),
                Click.on(Elements.CUSTOMER_EFFECTIVEDATE),
                TypeInto("12/08/2024"),
                //Enter.theValue("07/08/2024").into(Elements.CUSTOMER_EFFECTIVEDATE),
                //Enter.theValue("07/08/2025").into(Elements.CUSTOMER_EXPIRATIONDATE),


            //----------------------------------------------------------------------------------------------------------
                Ensure.that(Elements.CUSTOMER_FULLNAME).value().isEqualTo("NGUYỄN THỊ TRANG"),
                Ensure.that(Elements.CUSTOMER_GENDER).value().isEqualTo("Nam"),
                Ensure.that(Elements.CUSTOMER_CODE).value().isEqualTo("0001012075"),
                Ensure.that(Elements.CUSTOMER_ADDRESS).value().isEqualTo("VPBS MASK ADDR 9876543218909"),
                Ensure.that(Elements.CUSTOMER_ADDRESSCONTACT).value().isEqualTo("VPBS MASK ADDR 987654321678"),
                Ensure.that(Elements.CUSTOMER_DATEOFBIRTH).value().isEqualTo("28/10/2000"),
                //Ensure.that(Elements.CUSTOMER_NATIONALITY).value().isEqualTo("VIỆT NAM"),
                Ensure.that(Elements.CUSTOMER_FAX).value().isBlank(),
                Ensure.that(Elements.CUSTOMER_ADDRESSTAX).value().isBlank(),
                Ensure.that(Elements.CUSTOMER_EMAIL).value().isEqualTo("trangptit2009@gmail.com"),
                Ensure.that(Elements.CUSTOMER_TAXCODE).value().isBlank(),
                Ensure.that(Elements.CUSTOMER_MOBILEPHONE).value().isEqualTo("0973726088"),
                Ensure.that(Elements.CUSTOMER_PHONE).value().isEqualTo("0234567890"),
                Ensure.that(Elements.CUSTOMER_ID).value().isEqualTo("098755444"),
                Ensure.that(Elements.CUSTOMER_JOB).value().isBlank(),
                Ensure.that(Elements.CUSTOMER_WORKPLACE).value().isBlank(),
                Ensure.that(Elements.CUSTOMER_IDPLACE).value().isEqualTo("Cục CS QLHC về TTXH"),
                Ensure.that(Elements.CUSTOMER_AMOUNT).value().isBlank(),
                Ensure.that(Elements.CUSTOMER_ATHORFULLNAME).value().isBlank(),
                Ensure.that(Elements.CUSTOMER_ATHORADDRESS).value().isBlank(),
                Ensure.that(Elements.CUSTOMER_ATHORID).value().isBlank(),
                Ensure.that(Elements.CUSTOMER_ATHORIDPLACE).value().isBlank(),
                Ensure.that(Elements.CUSTOMER_ATHORDOCNUMBER).value().isBlank(),
                Ensure.that(Elements.CUSTOMER_ATHORISEXPRIDED).value().isBlank(),
                Scroll.to(Elements.BUTTON_END)
        );
    }
}
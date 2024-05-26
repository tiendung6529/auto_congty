package com.baymax.sky.features.authentication;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import org.jetbrains.annotations.NotNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




@RunWith(SerenityRunner.class)
public class GroupingInteractionsBai8 {

    public static final Target BUTTON_TYPE_SUBMIT = Target.the("submit button")
            .locatedBy("//button[@type='submit' and contains(@class, 'ibtn-primary')]");

    public static final Target Email_Error_Msg = Target.the("email error text")
            .located(By.id("user_email-error"));

    public static final Target Email_Field = Target.the("email field")
            .located(By.xpath("//input[@type='email']"));

    public static final Target Password = Target.the("password field")
            .located(By.name("user[password]"));

    public static final String URL1 = "http://itviec.com/sign_in";

    Actor jacob = Actor.named("Jacob");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Before
    public void setUp() {
        jacob.can(BrowseTheWeb.with(herBrowser));
    }

    @WithTag("testcase:bai8")
    @Test
    public void login_as_invalid_user_when_should_see_warning_message_bai8() {
        jacob.wasAbleTo(
                login_timvc("tiendung6528@gmail.com", "@Lanhuong123e")
        );

    }

    @NotNull
    private static Performable login_timvc(String mail, String pass) {
        return Task.where("{0} logs in as normal user", actor -> actor.attemptsTo(
                Open.url(URL1),
                Enter.theValue(mail).into(Email_Field),
                Enter.theValue(pass).into(Password),
                Click.on(BUTTON_TYPE_SUBMIT)
        ));
    }
}

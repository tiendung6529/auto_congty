package com.baymax.sky.features.tasks;

import com.baymax.sky.features.authentication.WhenProvidingAuUsernameAndPasswordStory;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.jetbrains.annotations.NotNull;

public class Login {
    @NotNull
    public static Performable login(String mail, String pass) {
        return Task.where("{0} logs in as normal user", actor -> actor.attemptsTo(
                Open.url(WhenProvidingAuUsernameAndPasswordStory.URL),
                Enter.theValue(mail).into(WhenProvidingAuUsernameAndPasswordStory.Email_Field),
                Enter.theValue(pass).into(WhenProvidingAuUsernameAndPasswordStory.Password),
                Click.on(WhenProvidingAuUsernameAndPasswordStory.BUTTON_TYPE_SUBMIT)
        ));
    }
}

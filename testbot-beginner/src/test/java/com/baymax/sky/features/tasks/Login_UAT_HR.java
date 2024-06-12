package com.baymax.sky.features.tasks;

import com.baymax.sky.features.Entity.HR;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.jetbrains.annotations.NotNull;

public class Login_UAT_HR {
    @NotNull
    public static Performable login(String username, String pass) {
        return Task.where("{0} logs in as normal user", actor -> actor.attemptsTo(
                Open.url(HR.URL_UAT_HR),
                Enter.theValue(username).into(HR.Username),
                Enter.theValue(pass).into(HR.password_Hr),
                Click.on(HR.Buttun_Login)
        ));
    }
}

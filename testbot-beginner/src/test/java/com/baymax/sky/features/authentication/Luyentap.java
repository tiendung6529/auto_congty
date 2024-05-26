package com.baymax.sky.features.authentication;
import com.baymax.sky.features.tasks.Login;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.SilentTask;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class Luyentap {
    public static final Target buttun_click =Target.the("click button login")
            .located(By.xpath("//button[contains(@class, 'btn btn-hero-primary') and contains(., 'Đăng nhập')]"));

    public static final Target email_via =Target.the("email field").locatedBy("//input[@name='username']");
    public static final Target pass_via =Target.the("pass field").locatedBy("//input[@name='password']");

    public static final Target MESSAGE_ERROR = Target.the("Sai tài khoản hoặc mật khẩu!")
            .located(By.xpath("//div[@class='alert alert-danger']//p[@class='mb-0']"));
    public static final String url_via ="https://viaphi.com/";

    Actor jacob = Actor.named("Jacob");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        jacob.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void login_as_invalid_user_when_should_see_warning_message_luyentap() {
        jacob.wasAbleTo(
                Open.url(url_via),
                Enter.theValue("dungntph22068").into(email_via),
                Enter.theValue("@Qwertyu89").into(pass_via),
                Click.on(buttun_click),
                Ensure.that(MESSAGE_ERROR).text().isEqualTo("Sai tài khoản hoặc mật khẩu!")

        );

    }


    }

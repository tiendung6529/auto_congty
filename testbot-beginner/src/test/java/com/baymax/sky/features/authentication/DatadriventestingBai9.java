package com.baymax.sky.features.authentication;


import com.baymax.sky.features.tasks.Login;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
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
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "datatest/invalid-users.csv")
public class DatadriventestingBai9 {

   private String mail ;
   private String password ;


//   set 2 trường
   public void setMail(String mail){
       this.mail =mail;
   }
    public void setPassword(String password){
        this.password =password;
    }


    Actor jacob = Actor.named("Jacob");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;


    @Before
    public void annaCanBrowseTheWeb() {
        jacob.can(BrowseTheWeb.with(herBrowser));
    }


//tạo csv cho vào data
    @WithTag("testcase:bai10")
    @Test
    public void login_as_invalid_user_when_should_see_warning_message_bai8() {

        jacob.wasAbleTo(
                Login.login(mail, password)
        );

    }


}
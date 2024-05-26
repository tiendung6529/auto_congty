package com.baymax.sky.features.authentication;

import com.baymax.sky.features.ui.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
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
public class WhenOpeningPageURLOnEnvironmentsStory {

    public static final Target BUTTON_TYPE_SUBMIT = Target.the("submit button")
            .locatedBy("//button[@type='submit' and contains(@class, 'ibtn-primary')]");

    //    nghĩa là hien thị thông báo lỗi
    public static final Target Email_Error_Msg =
            Target.the("email error text").located(By.id("user_email-error"));


    public static final Target Email_Field = Target.the("email field")
            .located(By.xpath("//input[@type='email']"));

    public static final Target Password =
            Target.the("password field").located(By.name("user[password]"));

    Actor jacob = Actor.named("Jacob");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;


    @Before
    public void annaCanBrowseTheWeb() {
        jacob.can(BrowseTheWeb.with(herBrowser));
    }



    //3.1 -Configuring the base url for different environments
    @WithTag("testcase:url")
    @Test
    public void login_as_invalid_user_when_should_see_warning_message_bai7() {
        jacob.wasAbleTo(
                Open.browserOn().the(HomePage.class),/* tạo ra class homepage*/
//                Open.url("http://itviec.com/sign_in"),
                Ensure.thatTheCurrentPage().currentUrl().isEqualTo("http://itviec.com")

        );


    }
}

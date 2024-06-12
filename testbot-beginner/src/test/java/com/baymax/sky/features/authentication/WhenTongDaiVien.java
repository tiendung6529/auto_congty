package com.baymax.sky.features.authentication;


import com.baymax.sky.features.Entity.HR;
import com.baymax.sky.features.Entity.TongDaiVien;
import com.baymax.sky.features.tasks.Login_UAT_HR;
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
public class WhenTongDaiVien {




    Actor jacob = Actor.named("Jacob");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;


    @Before
    public void annaCanBrowseTheWeb() {
        jacob.can(BrowseTheWeb.with(herBrowser));
    }





    //Vào màn hình tổng đài viên
    @WithTag("tdv")
    @Test
    public void login_as_invalid_user_when_should_see_warning_message_bai6() {
        jacob.wasAbleTo(
                Login_UAT_HR.login("00000002424","1234567"),
                Click.on(HR.Man_hinh_lam_viec),
                Click.on(HR.nhom_Tong_Dai_Vien),
                Click.on(TongDaiVien.DU_AN)


        );


    }





}
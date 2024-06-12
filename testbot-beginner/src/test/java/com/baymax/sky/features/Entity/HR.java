package com.baymax.sky.features.Entity;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HR {
    public static final String URL_UAT_HR = "https://hrweb-uat.viec3mien.vn/account/login";

    public static final Target Username =Target.the("Username field").located(By.name("userNameOrEmailAddress"));
    public static final Target password_Hr =Target.the("password field").located(By.name("password"));

    public static final Target Buttun_Login= Target.the("click login").located(By.xpath("//button[contains(text(),'Đăng nhập')]"));

    public static final Target Man_hinh_lam_viec =Target.the("click màn hình làm việc").located(By.xpath("//span[contains(text(),'Màn hình làm việc')]"));

    public static final Target nhom_Direct_Sale =Target.the("click nhóm Direct Sales").located(By.xpath("//span[@class='m-menu__link-text']//span[text()='Direct Sales']"));
    public static final Target nhom_Tong_Dai_Vien=Target.the("click nhóm Tong Dai Vien").located(By.xpath("//span[@class='m-menu__link-text']//span[@class='title' and text()='Tổng đài viên']"));


}

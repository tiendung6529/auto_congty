package com.baymax.sky.features.Entity;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class TongDaiVien {
    public static final Target DU_AN =
            Target.the("Chọn Dự Án").located(By.xpath("//span[contains(@class, 'ng-value-label') and contains(text(), 'Công ty Cổ phần Công nghệ thông tin 3T')]"));

    public static final Target CHIEN_DICH =
            Target.the("Chọn Chiến dịch").located(By.xpath("//span[contains(text(),'Chiến dịch hoa hồng đỏ')]"));

    public static final Target NHOM_NGUOI_DUNG =
            Target.the("Chọn Nhóm người dùng").located(By.xpath("//span[contains(text(),'Nhóm TĐV 3T Test')]"));

}

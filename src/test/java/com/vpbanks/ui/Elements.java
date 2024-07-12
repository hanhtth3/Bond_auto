package com.vpbanks.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class Elements {

    public static final Target USERNAME_FIELD =
            Target.the("username fileld")
                    .located(By.name("username"));

    public static final Target PASSWORD_FIELD =
            Target.the("password field")
                    .located(By.name("password"));

    public static final String URL = "https://portal-sit.vpbanks.com.vn";
    public static final Target SUBMIT_BUTTON =
            Target.the("Đăng nhập button")
                    .locatedBy("//button");
    public static final Target BOND_MENU =
            Target.the("menu Trái phiếu")
                    .locatedBy("//span[text()='Trái Phiếu']");
    public static final Target CUSTOMER_MENU =
            Target.the("menu Thông tin khách hàng")
                    .locatedBy("//span[text()='Thông tin khách hàng']");
    public static final Target ADDCUSTOMER_BUTTON =
            Target.the("button Thêm mới khách hàng")
                    .locatedBy("//span[text()='Thêm mới khách hàng']");

    public static final Target SCROLL_MENU =
            Target.the("menu Scroll")
                    .locatedBy("//div[@class='scrollbar-container main-menu-content ps']");

    public static final Target IMG_BUTTON =
            Target.the("img button")
                    .locatedBy("//a[@class='navbar-brand active']");

    //public static final Target ACCOUNT_NO =
            //Target.the("acount number")
                    //.locate(By.id("accountNo"));
}
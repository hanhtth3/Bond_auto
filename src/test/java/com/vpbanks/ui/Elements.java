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

    public static final Target BOND_HIDEMENU =
            Target.the("Menu")
                   .locatedBy("//a[@class='nav-menu-main menu-toggle hidden-xs is-active nav-link']");

    public static final Target ACCOUNT_NO =
            Target.the("Số tài khoản")
                    .located(By.id("accountNo"));

    public static final Target SEARCH_BUTTON =
            Target.the("Search button")
                    .locatedBy("//button[@class='ant-btn ant-btn-primary ant-btn-lg']");

    public static final Target CUSTOMER_INPUT = Target.the("{0} input")
            .locatedBy("//label[@title='{0}']/parent::div/following-sibling::div//input");

    public static final Target CUSTOMER_FULLNAME = CUSTOMER_INPUT.of("Họ tên");
    public static final Target CUSTOMER_EMAIL = CUSTOMER_INPUT.of("Email");

}
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

    public  static final Target CUSTOMER_ADDRESS=
            Target.the("Địa chỉ thường trú")
                    .located(By.id("resident"));

    public static final Target CUSTOMER_ID=
            Target.the("Số giấy tờ định danh")
                    .located(By.id("idCode"));

    public static final Target CUSTOMER_IDPLACE=
            Target.the("Nơi cấp số giấy tờ định danh")
                    .located(By.id("idPlace"));
    //---------Athor information

    public  static final Target CUSTOMER_ATHORADDRESS=
            Target.the("Địa chỉ thường trú người ủy quyền")
                    .located(By.id("authorAddress"));

    public  static final Target CUSTOMER_ATHORID=
            Target.the("Số giấy tờ định danh người ủy quyền")
                    .located(By.id("authorIdCode"));

    public  static final Target CUSTOMER_ATHORIDPLACE=
            Target.the("Nơi cấp số giấy tờ định danh người ủy quyền")
                    .located(By.id("authorIdPlace"));
    //----------Elements input

    public static final Target CUSTOMER_INPUT = Target.the("{0} input")
            .locatedBy("//label[@title='{0}']/parent::div/following-sibling::div//input");

    public static final Target CUSTOMER_FULLNAME = CUSTOMER_INPUT.of("Họ tên");
    public static final Target CUSTOMER_EMAIL = CUSTOMER_INPUT.of("Email");
    public static final Target CUSTOMER_CODE = CUSTOMER_INPUT.of("Mã khách hàng");
    public static final Target CUSTOMER_ADDRESSCONTACT = CUSTOMER_INPUT.of("Địa chỉ liên lạc");
    public static final Target CUSTOMER_FAX = CUSTOMER_INPUT.of("Số Fax");
    public static final Target CUSTOMER_ADDRESSTAX  = CUSTOMER_INPUT.of("Nơi đóng thuế");
    public static final Target CUSTOMER_MOBILEPHONE = CUSTOMER_INPUT.of("Số điện thoại");
    public static final Target CUSTOMER_PHONE = CUSTOMER_INPUT.of("Số điện thoại cố định");
    public static final Target CUSTOMER_JOB = CUSTOMER_INPUT.of("Nghề nghiệp");
    public static final Target CUSTOMER_WORKPLACE = CUSTOMER_INPUT.of("Đơn vị công tác");
    public static final Target CUSTOMER_AMOUNT = CUSTOMER_INPUT.of("Số dư khả dụng trên TK TP");
    public static final Target CUSTOMER_TAXCODE = CUSTOMER_INPUT.of("Mã số thuế");
    public static final Target CUSTOMER_ATHORFULLNAME = CUSTOMER_INPUT.of("Họ và tên");
    public static final Target CUSTOMER_ATHORDOCNUMBER = CUSTOMER_INPUT.of("Số giấy tờ UQ người ủy quyền");

    public static final Target CUSTOMER_GENDER=
            Target.the("Giới tinh")
                    .located(By.id("gender"));

    public static final Target CUSTOMER_DATEOFBIRTH=
            Target.the("Ngày sinh")
                    .located(By.id("dateOfBirth"));

    public static final Target CUSTOMER_NATIONALITY=
            Target.the("Quốc tịch")
                    .located(By.id("nationality"));

    public static final Target CUSTOMER_OTHERNATIONALITY=
            Target.the("Quốc tịch khác")
                    .located(By.id("otherNationality"));

    public static final Target CUSTOMER_IDTYPE=
            Target.the("Loại giấy tờ")
                    .located(By.id("idType"));

    public static final Target CUSTOMER_IDDATE=
            Target.the("Ngày cấp")
                    .located(By.id("idDate"));

    public static final Target CUSTOMER_IDEXPIRED=
            Target.the("Ngày hết hạn")
                    .located(By.id("idExpired"));

    public static final Target CUSTOMER_ATHORIDTYPE=
            Target.the("Loại giấy tờ người ủy quyền")
                    .located(By.id("authorIdType"));

    public static final Target CUSTOMER_ATHORIDDATE=
            Target.the("Ngày cấp người ủy quyền")
                    .located(By.id("authorIdDate"));

    public static final Target CUSTOMER_ATHOREXPIRED=
            Target.the("Ngày hết hạn người ủy quyền")
                    .located(By.id("authorExpiredDate"));

    public static final Target CUSTOMER_ATHORDATEOFBIRTH=
            Target.the("Ngày sinh người ủy quyền")
                    .located(By.id("authorDateOfBirth"));

    public static final Target CUSTOMER_ATHORGENDER=
            Target.the("Giới tinh người ủy quyền")
                    .located(By.id("authorGender"));

    public static final Target CUSTOMER_ATHORFROMDATE=
            Target.the("Ngày hiệu lực người ủy quyền")
                    .located(By.id("authorFromDate"));

    public static final Target CUSTOMER_ATHORTODATE=
            Target.the("Ngày hết hiệu lực người ủy quyền")
                    .located(By.id("authorToDate"));

    public static final Target CUSTOMER_ATHORISEXPRIDED=
            Target.the("Trạng thái hiệu lực người ủy quyền")
                    .located(By.id("authorIsExpired"));

    public static final Target CUSTOMER_FATCA=
            Target.the("Fatca")
                    .located(By.id("fatca"));

    public static final Target CUSTOMER_ISPRO=
            Target.the("Nhà đầu tư chuyên nghiệp")
                    .locatedBy("//div[@id='isProfessionalInvestor']//input[@value='true']");

    public static final Target CUSTOMER_PROBY=
            Target.the("NDTCN do")
                    .locatedBy("//input[@id='proInvestorBy']");

    public static final Target CUSTOMER_PROBYVALUE=
            Target.the("Nhà đầu tư chuyên nghiệp")
                    .locatedBy("//div[@title='Nhà đầu tư chiến lược']//div[@class='ant-select-item-option-content']");

    public static final Target CUSTOMER_PRO=
            Target.the("Nhà đầu tư chiến lược")
                    .locatedBy("//div[text()='Nhà đầu tư chiến lược']");



    }



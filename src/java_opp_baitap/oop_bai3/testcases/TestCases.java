package java_opp_baitap.oop_bai3.testcases;

import java_opp_baitap.oop_bai3.common.BaseTest;
import java_opp_baitap.oop_bai3.common.Constants;

public class TestCases extends BaseTest {
    private String url;
    private String email;
    private String password;
    private String clickElement;

//    public TestCases(String url, String email, String password, String clickElement) {
//        this.url = url;
//        this.email = email;
//        this.password = password;
//        this.clickElement = clickElement;
//    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        url = url.toLowerCase();
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClickElement() {
        return clickElement;
    }

    public void setClickElement(String clickElement) {
        this.clickElement = clickElement;
    }

    void login() {
        System.out.println("Open Browser: "+Constants.browser);
        System.out.println("Link url: "+getUrl());
        System.out.println("Email: "+getEmail());
        System.out.println("Password: "+getPassword());
        System.out.println("Click button: "+getClickElement());
        System.out.println("Hiển thị trang Dashboard");
    }
    void testLogin(String url, String email, String password, String clickElement){
        createDriver();
        setUrl(url);
        setEmail(email);
        setPassword(password);
        setClickElement(clickElement);
        login();
        closeDriver(Constants.browser);
    }

    void addCategory() {
        createDriver();
        login();
        System.out.println("Click menu chức năng Customers");
        System.out.println("Click button: "+"+ New Customers");
        System.out.println("Hiển thị màn hình nhập thông tin Customer Details");
        System.out.println("Nhập các trường thông tin");
        System.out.println("Click button Save");
        System.out.println("Verify...");
        System.out.println("Kiểm tra kết quả.");
        closeDriver(Constants.browser);
    }

    public static void main(String[] args) {
        //TestCases testCases = new TestCases("https://cms.anhtester.com/login","admin@example.com","123456","Login");
        TestCases testCases = new TestCases();
        testCases.testLogin("HTTPS://CRM.ANHTESTER.COM/ADMIN/AUTHENTICATION","admin@example.com","123456","Login");
        System.out.println("++++++++++++++++++++++++++++++++++");
        testCases.addCategory();
    }

}

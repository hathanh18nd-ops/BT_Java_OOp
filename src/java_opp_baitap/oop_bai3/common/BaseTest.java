package java_opp_baitap.oop_bai3.common;

public class BaseTest {
    Constants constants = new Constants();

    public void createDriver() {
        System.out.println("Browser: "+constants.browser + ", Report: " + constants.report + ", Headless: " + constants.headless);
    }

    public void closeDriver(String browser) {
        System.out.println("Closed browser: " + browser);
    }

//    public static void main(String[] args) {
//        BaseTest baseTest = new BaseTest();
//        baseTest.createDriver();
//        baseTest.closeDriver("Chrome");
//}
}

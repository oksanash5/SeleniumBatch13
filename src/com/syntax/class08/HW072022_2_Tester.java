package com.syntax.class08;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW072022_2_Tester {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        CommonMethods.openBrowser(driver,"http://www.fb.com");
        Thread.sleep(2000);
        CommonMethods.quitBrowser(driver);
    }
}

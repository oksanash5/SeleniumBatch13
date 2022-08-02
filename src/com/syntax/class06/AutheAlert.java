package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutheAlert {
    public static String url = "http:/admin:admin@the-internet.herokuapp.com/basic_auth";
    //username:password @ + http://the-internet.herokuapp.com/basic_auth";
    //  admin  : admin@  the-internet.herokuapp.com/basic_auth";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
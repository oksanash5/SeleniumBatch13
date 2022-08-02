package com.syntaxclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");//setting the property
        // to use chromedriver
        WebDriver driver= new ChromeDriver();//launch the browser// empty chrome
        driver.get("http:www.google.com");
        String url=driver.getCurrentUrl();
        System.out.println(url);  // https:www.google.com/?qws_rd=ssl// this is url
        String title=driver.getTitle(); // get title
        System.out.println(title);// Google is title
        driver.quit();// closed the Google


    }
}

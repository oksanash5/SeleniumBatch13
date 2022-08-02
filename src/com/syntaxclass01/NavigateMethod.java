package com.syntaxclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
       driver.get("http://facebook.com");
       driver.navigate().to("http://www.google.com");// keep history
       driver.navigate().back();
       driver.navigate().forward();
       Thread.sleep(5000);// pause the execution 2 secounds
       driver.navigate().refresh();

       driver.close(); //will closed the current tab
       driver.quit(); // will quit the whole browser
    }
}

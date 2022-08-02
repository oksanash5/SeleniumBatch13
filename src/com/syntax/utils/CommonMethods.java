package com.syntax.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class CommonMethods {
    // create a package and name it as utils
    // create a class and name as CommonMethods
    // create functions (methods) to open and quit the browsers
    //open method has to accept a url as a parameter

    public static void openBrowser(WebDriver driver, String url) {
        driver.get(url);
    }
    public static void quitBrowser(WebDriver driver) {
        driver.quit();
   }
 }


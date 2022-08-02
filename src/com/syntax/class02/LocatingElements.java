package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.fb.com");
        driver.findElement(By.id("email")).sendKeys("syntax@adfasdfasf.com");
      driver.findElement(By.id("pass")).sendKeys("whatever");
      driver.findElement(By.name("login")).click();
     // Thread.sleep(2000);
        //   Theade we use if the new page did not loading// screen with
        //questions about "please enter the email addrees // if password is not correct//for
        // for forgot password

      driver.findElement(By.linkText("Forgot password?")).click();
       // driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();

    }
}

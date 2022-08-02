package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW071322_1 {
    public static void main(String[] args) {
       // Navigate to https://syntaxprojects.com/bootstrap-iframe.php
      //  verify the header text Sorry, We Couldn't Find Anything For "Asksn" is displayed
       // verify enroll today button is enabled

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/bootstrap-iframe.php");

        driver.switchTo().frame("FrameOne");
        WebElement text=driver.findElement(By.className("heading-13"));
        System.out.println(text.isDisplayed());
        String headerText= text.getText();
        System.out.println(headerText);
        String correctText="Sorry, We Couldn't Find Anything For “Asksn”";

        if (headerText.equals(correctText)){
            System.out.println("The header verified");
        }else {
            System.out.println("The haedar is not correct");
        }
        driver.switchTo().defaultContent();

        driver.switchTo().frame("FrameTwo");

        WebElement enrolltodaybutoon=driver.findElement(By.className("text-block-2"));
        System.out.println(enrolltodaybutoon.isDisplayed());
        if (enrolltodaybutoon.isEnabled()){
            System.out.println("'Enroll today' button is enabled" );
        }else{
            System.out.println("Enroll today button is not enabled");
        }


   driver.quit();

    }

}

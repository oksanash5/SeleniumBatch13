package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW071322_2 {
    public static void main(String[] args) throws InterruptedException {

        // Go to https://syntaxprojects.com/javascript-alert-box-demo.php
        // click on each button and handle the alert accordingly
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement buttonAlertbox=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        buttonAlertbox.click();
        Thread.sleep(2000);
        Alert alertBox=driver.switchTo().alert();
        System.out.println(alertBox.getText());
        alertBox.accept();

        WebElement buttonConfirmBox=driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        buttonConfirmBox.click();
        Thread.sleep(2000);
        Alert confirmBox=driver.switchTo().alert();
        System.out.println(confirmBox.getText());
        confirmBox.dismiss();

        WebElement buttonPromptBox=driver.findElement(By.cssSelector("button[onclick*='myPromptFunction()']"));
        buttonPromptBox.click();
        Thread.sleep(2000);
         Alert promptBox=driver.switchTo().alert();
         promptBox.sendKeys("Margo");
         System.out.println(promptBox.getText());
         Thread.sleep(2000);
         promptBox.accept();

         driver.quit();
    }
}
package com.syntax.class06;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {

        /*
        HW
    Go to https://syntaxprojects.com/javascript-alert-box-demo.php
    click on each button and handle the alert accordingly
         */
        public static String url="https://syntaxprojects.com/javascript-alert-box-demo.php";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();

            WebElement simpleA= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
            simpleA.click();
            Thread.sleep(1000);
            Alert alert=driver.switchTo().alert();
            //alert.accept();
            alert.dismiss();
            Thread.sleep(1000);

            WebElement confirmA= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
            confirmA.click();
            Thread.sleep(1000);
            alert.accept();
            //alert.dismiss();

            WebElement promtA=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
            promtA.click();
            Thread.sleep(1000);
            alert.sendKeys("Aladdin let the Genie FREE!))))");
            alert.accept();



        }
}

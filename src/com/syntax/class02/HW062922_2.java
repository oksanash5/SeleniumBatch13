package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW062922_2 {
   // navigate to fb.com
   // click on create new account
  //  fill up all the textboxes
  //  click on sign up button
  //  close the pop up
   // close the browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.fb.com");
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Create ")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Sam");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("syntax@adfasdfasf.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("syntax@adfasdfasf.com");
        driver.findElement(By.id("password_step_input")).sendKeys("whatever");
        driver.findElement(By.id("month")).sendKeys("July");
        driver.findElement(By.id("day")).sendKeys("25");
        driver.findElement(By.id("year")).sendKeys("2000");
        Thread.sleep(3000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("u_2_9_JZ")).click();
        driver.quit();


    }
}
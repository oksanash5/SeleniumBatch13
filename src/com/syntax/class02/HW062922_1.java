package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW062922_1 {
    // navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //  fill out the form
    //click on register
    // close the browser

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Sam");
        driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.name("customer.address.street")).sendKeys("25 Fulton street");
        driver.findElement(By.name("customer.address.city")).sendKeys("New York");
        driver.findElement(By.name("customer.address.state")).sendKeys("NY");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("8008008000");
        driver.findElement(By.id("customer.ssn")).sendKeys("111222333");
        driver.findElement(By.className("input")).sendKeys("Samsmith");
        driver.findElement(By.id("customer.password")).sendKeys("123456789@");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456789@");
        driver.findElement(By.className("button")).click();
        driver.quit();

    }
}

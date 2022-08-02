package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW070522 {
    public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("http://syntaxprojects.com/");
  Thread.sleep(3000);
  WebElement startPracticing=driver.findElement(By.xpath("//a[text()=' Start Practising ']"));
  startPracticing.click();
        Thread.sleep(3000);
WebElement simpleFormDemo= driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling ::a"));
simpleFormDemo.click();
        Thread.sleep(3000);
WebElement textBox = driver.findElement(By.cssSelector("input[placeholder ^='Please enter']"));
textBox.sendKeys("Sameer loves Absolute");
        Thread.sleep(3000);
WebElement showMessageButton=driver.findElement(By.cssSelector("button[onclick*='show']"));
showMessageButton.click();
Thread.sleep(3000);
 driver.quit();


    }
}

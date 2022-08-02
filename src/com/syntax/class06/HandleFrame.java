package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame(0);//before we have to switch to frame/ go inside the frame
        WebElement textbox= driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 13 Forever!!!");

        //when we done with frame we have to switch to normal page//out of frame
        driver.switchTo().defaultContent();

        WebElement alertButton= driver.findElement(By.id("alert"));
        alertButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();//but we don't need to switch back from alert. it goes back authomaticalyy

        driver.switchTo().frame("iframe_a");
        textbox.clear();
        textbox.sendKeys("we are back to the frame");//reassing

        driver.switchTo().defaultContent();

       WebElement frameElement= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
       driver.switchTo().frame(frameElement);

       textbox.clear();
       textbox.sendKeys("Hold your Horses!!!");
    }
}
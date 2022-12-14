package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplecitWaitDemo {
    public static String url = "http://syntaxprojects.com/index.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement starPracticing = driver.findElement(By.xpath("//a[@id='btn_inter_example']"));
       starPracticing.click();

    }
}
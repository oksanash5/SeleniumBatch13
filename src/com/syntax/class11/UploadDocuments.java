package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadDocuments {
    public static String url = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement fileUpLoadLink=driver.findElement(By.linkText("File Upload"));
        fileUpLoadLink.click();

        WebElement choosefile=driver.findElement(By.id("file-upload"));
        //if file name or folder name contains space, try to have them as separate strings and concatenate
        //if sendKeys does not work you can use ROBOT CLASS.
        choosefile.sendKeys("C:\\Users\\oksan\\Desktop\\Test.xlsx");

        WebElement uploadButton= driver.findElement(By.id("file-submit"));
        uploadButton.click();

    }
}
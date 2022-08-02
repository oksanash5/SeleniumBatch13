package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDianomicTable {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButoon = driver.findElement(By.className("button"));
        loginButoon.click();

        List<WebElement> row=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        for(int i=0; i< row.size();i++){// if we start with i=1 we delete the header
           String rowText= row.get(i).getText();
            System.out.println(rowText);
            if(rowText.contains("FamilyAlbum")){
                List<WebElement>checkboxes=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
                checkboxes.get(i-1).click();
            }
        }

    }
}
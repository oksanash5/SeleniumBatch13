package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW {
       /*
Go to aa.com/homePage.do
select depart date
select return date
select destination
click on search
quit the browser
     */

    public static String url = "http://aa.com/homePage.do";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //WebElement toButton= driver.findElement(By.xpath("//span[@class='icon icon-search'][2]"));
        // toButton.click();

        WebElement departSearch = driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger'][1]"));
        departSearch.click();
        WebElement nextButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
        nextButton.click();
        //WebElement monthButton = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        //WebElement yearButton = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
        //String monthText = monthButton.getText();
        //String yearText = yearButton.getText();
        //while (!monthText.equals("October") && (!yearText.equals("2022"))) {
        //monthText = monthButton.getText();


        }
    }


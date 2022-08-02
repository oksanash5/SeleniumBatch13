package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW071922_1 {
     public static String url=("https://demoqa.com/browser-windows");
    public static void main(String[] args) throws InterruptedException {
        // Go to https://demoqa.com/browser-windows
        //click on New Tab and print the text from new tab in the console
        //  click on New Window and print the text from new window in the console
        //  click on New Window Message and print the text from new window in the console
        //  Verify (compare) the titles for each page
        //  Print out the title of the all pages
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     String mainPageHandle = driver.getWindowHandle();

       WebElement newTab = driver.findElement(By.id("tabButton"));
        newTab.click();

       WebElement newWindow = driver.findElement(By.cssSelector("button#windowButton"));
      newWindow.click();

       WebElement newWindowMessage = driver.findElement(By.cssSelector("button#messageWindowButton"));
       newWindowMessage.click();

       Set<String> allWindowHandles = driver.getWindowHandles();
       Iterator<String> it = allWindowHandles.iterator();
         while (it.hasNext()) {
          String handle = it.next();
         if (!handle.equals(mainPageHandle)) {
             driver.switchTo().window(handle);
             String text = driver.findElement(By.xpath("//body")).getText();
             System.out.println(text);
             Thread.sleep(3000);
             String title = driver.getTitle();
             if (!title.isEmpty()) {
             System.out.println(title);
            }else{
             System.out.println("No Title for this page");

             }
         }
       }
    }
}
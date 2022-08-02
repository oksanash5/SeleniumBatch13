package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowhandling {
    public static String url="http:accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle= driver.getWindowHandle();// get widow handle for the main page
        System.out.println(mainPageHandle);// ID for parent Handle

        WebElement helpLink=driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles=driver.getWindowHandles();// store all the handle inside the set
        System.out.println(allWindowHandles.size());

        Iterator<String> it=allWindowHandles.iterator();//have an iterator in order to iterate throught the handles
        mainPageHandle=it.next();// take firs step and assign the main page handle
        String childHandle=it.next();//take the second step and have a child handle
        System.out.println(childHandle);//ID for child Handle
       Thread.sleep(2000);
       driver.switchTo().window(childHandle);
       driver.close();

      driver.switchTo().window(mainPageHandle);
      helpLink.click();

      driver.quit();
    }
}

package com.syntax.class07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
public class HW {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/browser-windows");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            String mainHandl = driver.getWindowHandle();
            driver.findElement(By.id("tabButton")).click();
            driver.findElement(By.id("windowButton")).click();
            driver.findElement(By.id("messageWindowButton")).click();
            Iterator<String> iterator = driver.getWindowHandles().iterator();
            mainHandl = iterator.next();

            String scndhandl = iterator.next();
            String thrdhandl = iterator.next();
            String fourthhandl = iterator.next();

            driver.switchTo().window(thrdhandl);
            String text = driver.findElement(By.xpath("//body/h1")).getText();
            System.out.println(text);
            driver.close();
            driver.switchTo().window(fourthhandl);
            text = driver.findElement(By.xpath("//body/h1")).getText();
            System.out.println(text);
            driver.close();
            driver.switchTo().window(scndhandl); //can't get text from this window, intelij justcontinue working , nothing happens
            text = driver.findElement(By.xpath("//body")).getText();
            System.out.println(text);
            driver.close();
            driver.switchTo().window(mainHandl);


        }
        }

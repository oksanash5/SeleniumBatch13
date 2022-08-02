package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import java.util.List;
import java.util.Set;

public class HW070622_1 {
  //    Open chrome browser
  //  Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
  //  Enter valid username and password (username - Admin, password - Hum@nhrm123)
  //  Click on login button
  //  Then verify Syntax Logo is displayed.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        Thread.sleep(2000);
        // optimum security
        driver.findElement(By.cssSelector("a#continue-with-click")).click();
        Thread.sleep(2000);

       WebElement username=driver.findElement(By.id("txtUsername"));
       username.sendKeys("Admin");
       WebElement password =driver.findElement(By.xpath("//input[@type='password']"));
       password.sendKeys("Hum@nhrm123");
       driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
       WebElement  logo= driver.findElement(By.cssSelector("img[alt='OrangeHRM']"));
       Thread.sleep(2000);
       boolean logoIsDisplayed= logo.isDisplayed();
        System.out.println(logoIsDisplayed);

        driver.quit();

       }


    }


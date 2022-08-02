package com.syntax.reveiw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //go to syntaxaxproject
      //  driver.get("https://syntaxprojects.com/index.php");
      // click on syart Practicing
     //   Thread.sleep(2000);
     //  WebElement button1= driver.findElement(By.linkText("Start Practising"));
      // button1.click();
 // Thread.sleep(3000);
     // driver.findElement(By.partialLinkText("Proceed Next")).click();
     // Thread.sleep(3000);
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
     //   /enter some value in the text box
        WebElement textBox=driver.findElement(By.id("user-message"));
        textBox.sendKeys("abracadabra");




    }
}

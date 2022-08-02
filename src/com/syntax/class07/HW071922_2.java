package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW071922_2 {
  // navigate to http://www.uitestpractice.com/Students/Contact
 //  click on the link
    //get text
   // print out in the console
  public static String url="http://www.uitestpractice.com/Students/Contact";
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get(url);
    WebElement link=driver.findElement(By.xpath("//a[@data-ajax='true']"));
    link.click();

    WebElement text=driver.findElement(By.xpath("//p[contains(text(),'Selenium is a portable')]"));
    System.out.println(text.getText());
    driver.quit();

  }
}

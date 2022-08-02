package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
//Go to facebook sign up page
       // Fill out the whole form
        //Click signup
public class HW071222_2 {
           public static String url = "http://www.facebook.com";

           public static void main(String[] args) throws InterruptedException {
               System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
               WebDriver driver = new ChromeDriver();
               driver.get(url);
               WebElement newAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
               newAccount.click();
               Thread.sleep(2000);
               WebElement firstName= driver.findElement(By.cssSelector("input[name='firstname']"));
               firstName.sendKeys("Sam");
               WebElement lastName=driver.findElement(By.cssSelector("input[name^='last']"));
               lastName.sendKeys("Smith");
               WebElement userName=driver.findElement(By.xpath("//input[@name='reg_email__']"));
               userName.sendKeys("syntax@adfasdfasf.com");
               driver.findElement(By.name("reg_email_confirmation__")).sendKeys("syntax@adfasdfasf.com");
               driver.findElement(By.id("password_step_input")).sendKeys("whatever");

               WebElement month= driver.findElement(By.id("month"));
               Select select=new Select(month);
               select.selectByVisibleText("Jun");

               WebElement day=driver.findElement(By.id("day"));
               Select select1=new Select(day);
               select1.selectByValue("17");

               WebElement year=driver.findElement(By.id("year"));
               Select select2=new Select(year);
               select2.selectByValue("1995");

               driver.findElement(By.xpath("//label[text()='Female']")).click();
               driver.findElement(By.name("websubmit")).click();
               Thread.sleep(2000);
             //  driver.quit();

           }
}




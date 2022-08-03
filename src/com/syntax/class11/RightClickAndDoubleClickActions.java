package com.syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RightClickAndDoubleClickActions {

    public static String url = "https://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement rightClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions=new Actions(driver);
        actions.contextClick(rightClickButton).perform();

        WebElement editOption= driver.findElement(By.xpath("//span[text()='Edit']"));
      //  editOption.click();  // sometimes it does not work and we can use follow step:
        actions.click(editOption).perform();
        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(), 'Double-Click')]"));
        actions.doubleClick(doubleClickButton).perform();
        Thread.sleep(2000);
        System.out.println(alert.getText());//You double clicked me.. Thank You..
        alert.accept();


    }
}
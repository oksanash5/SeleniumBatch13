package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDropDemo {
    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.switchTo().frame(0);
        WebElement draggable= driver.findElement(By.id("draggable"));
        WebElement droppable= driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);
       // actions.dragAndDrop(draggable,droppable).perform();

        //if more then one action use build then perform
        //build() will combine all the actions into one
        actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

       // driver.navigate().refresh();
    }
}
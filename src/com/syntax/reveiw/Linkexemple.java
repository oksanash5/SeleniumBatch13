package com.syntax.reveiw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Linkexemple {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //ger all the links from websate of
        driver.get("https://syntaxprojects.com/index.php");
       List<WebElement> links=driver.findElements(By.tagName("a"));
       // System.out.println(links);//[[ChromeDriver: chrome on WINDOWS (cd30a09cb575b44bf1b947f843eda913)]
        // -> tag name: a],  [[ChromeDriver: chrome on WINDOWS (cd30a09cb575b44bf1b947f843eda913)]
        //don't

        for (WebElement link:links){
            String text=link.getText();
            System.out.println(text);
        }
    }
}

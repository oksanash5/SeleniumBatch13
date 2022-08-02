package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW070622_2 {
    //Amazon link count:
    //Open chrome browser
    //Go to "https://www.amazon.com/"
    //Get all links
    //Get number of links that has text
    //Print to console only the links that has text
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of all links  " + allLinks.size());
        int countTextLinks=0;
        for(int i=0; i<allLinks.size();i++){
            String textLink = allLinks.get(i).getText();
            if (!textLink.isEmpty()){
                System.out.println(textLink);
                countTextLinks++;
            }
        }
        System.out.println("Number of links that have a text "+countTextLinks);
    }

            }

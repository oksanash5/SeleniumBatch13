package com.syntax.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles {
    public static String url = ("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
 //go to gmail.com
        //open up privacy help term tabs
        // go to privacy tab and get the title print it on the screen
      //  find all the buttons that open up new windows or tabs
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Terms']"));


//        clicking on the btns
        helpBtn.click();
        privacyBtn.click();
        termsBtn.click();
        //get the main page handle and print on the screen
        String mainPageHandle= driver.getWindowHandle();
        System.out.println("The main page is handle"+mainPageHandle);
        String privacyPageHandle="";

        //Major Tasc-> get the title from privacy tab
        //1. Get all the window Handles
        Set<String> allHandles =driver.getWindowHandles();
        // 2. to iterate create an iterator
        Iterator<String> it= allHandles.iterator();
        // 3. the while loop
        while(it.hasNext()) {
            //4.getting the first gandle from the set
            String handle = it.next();
            //5. switch to this particular and handle to make sure it is the right one
            driver.switchTo().window(handle);
            //6 make sure this window is the privacy one
            String title = driver.getTitle();
            // 7. make sure the title is
             // System.out.println(title);
            if (title.contains("Privacy Policy – Privacy & Terms – Google")) {
                System.out.println(title);
                privacyPageHandle= handle;
                break;
            }

            driver.switchTo().defaultContent();
            driver.switchTo().window(privacyPageHandle);


        }
    }
}
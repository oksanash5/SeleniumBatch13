package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW071222_3 {
   // Go to ebay.com
   // get all the categories and print them in the console
    //select Computers/Tables & Networking
    //click on search
    //verify the header
   public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.ebay.com");
       WebElement allCategories=driver.findElement
               (By.cssSelector("select[aria-label='Select a category for search']"));
       Select select=new Select(allCategories);
       List<WebElement> categoriesOptions=select.getOptions();
       System.out.println(categoriesOptions.size());
       for (WebElement options:categoriesOptions){
           String optionsText= options.getText();
           System.out.println(optionsText);
       }
        select.selectByVisibleText("Computers/Tablets & Networking");
       driver.findElement(By.cssSelector("input[value='Search']")).click();
       Thread.sleep(2000);
       WebElement header=driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
       String headerText= header.getText();
       System.out.println(headerText);
       String correctHeaderText="Computers, Tablets & Network Hardware";
       if (headerText.equals(correctHeaderText)){
           System.out.println("The header is correct");
       } else{
           System.out.println("The header is not correct");

           driver.quit();
       }

   }
}

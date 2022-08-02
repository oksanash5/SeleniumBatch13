package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
       //Go to aa.com/homePage.do
      //  select depart date
      //  select return date
      //  select destination
      //  click on search
      //  quit the browser

public class HW072722_2 {
    public static String url = "http://aa.com/homePage.do";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement fromButton= driver.findElement(By.xpath("//span[@class='icon icon-search'][1]"));
        fromButton.click();
        WebElement countryButton=driver.findElement(By.cssSelector("select#countryCode"));
        Select select=new Select(countryButton);
        select.selectByVisibleText("United States");
        WebElement stateButton=driver.findElement(By.cssSelector("select#stateCode"));
        select=new Select(stateButton);
        select.selectByValue("NY");
        WebElement airportLookUp=driver.findElement(By.xpath("//span[text()='JFK']"));
        airportLookUp.click();

        WebElement toButton=driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
        toButton.click();
        toButton.sendKeys("BCN");

       WebElement departButtton=driver.findElement(By.cssSelector("input#aa-leavingOn"));
       departButtton.click();
       departButtton.sendKeys("10/26/2022");

       WebElement returnButton=driver.findElement(By.cssSelector("input#aa-returningFrom"));
       returnButton.click();
       returnButton.sendKeys("11/10/2022");

       WebElement numOfPassengers= driver.findElement(By.cssSelector("select[name='adultOrSeniorPassengerCount']"));
       select=new Select(numOfPassengers);
       select.selectByValue("2");

       WebElement searchButton=driver.findElement(By.cssSelector("input[id='flightSearchForm.button.reSubmit']"));
       searchButton.click();

       driver.quit();
     }
 }


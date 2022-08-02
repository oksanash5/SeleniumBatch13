package review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDownsReview {
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //click on Create New Account
  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
  //selecy the birth Day from the dropDown on the
  Thread.sleep(2000);

WebElement dayDD= driver.findElement(By.xpath("//select[@id='day']"));
//select class to deal with drop down
        Select select =new Select(dayDD);
        List<WebElement> availableDays=select.getOptions();
     int size= availableDays.size();
        for (WebElement day:availableDays){
            System.out.println(day.getText());
        }
       //select all options one dy one a difeference of two secont
    for (int i=0;i<size;i++){
        System.out.println(availableDays.get(i).getText());
        select.selectByIndex(i);
        Thread.sleep(2000);
    }
   //select by index the day 3
        select.selectByIndex(2);
    Thread.sleep(1000);
    //select by value

        select.selectByValue("22");

        //select the option 7 by visible text
        select.selectByVisibleText("7");
    }
}
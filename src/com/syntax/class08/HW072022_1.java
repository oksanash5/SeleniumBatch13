package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
public class HW072022_1 {
       // go to https://the-internet.herokuapp.com/dynamic_controls
       // click on checkbox and click on remove
       //verify the text
      //click on enable verify the textbox is enabled
      // enter text and click disable
      //verify the textbox is disabled
   public static String url="https://the-internet.herokuapp.com/dynamic_controls";
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get(url);
       WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
       checkBox.click();

       WebElement checkBoxRemove=driver.findElement(By.xpath("//button[text()='Remove']"));
       checkBoxRemove.click();

       WebDriverWait wait=new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

        WebElement text=driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println("The text is displayed:" +text.isDisplayed());
        String headertext=text.getText();
        System.out.println(headertext);
        String correctText="It's gone!";
        if (headertext.equals(correctText)){
            System.out.println("The text is correct");
        }else{
            System.out.println("Text is not correct");
        }
        WebElement enablebutton= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enablebutton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        WebElement textBox= driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("The text box is enabled:" +textBox.isEnabled());
        textBox.sendKeys("hello");
        Thread.sleep(2000);
        textBox.clear();
        WebElement text1=driver.findElement(By.xpath("//p[contains(text(),'enabled!')]"));
        String headertext1=text1.getText();
        System.out.println(headertext1);
        WebElement disableButton=driver.findElement(By.cssSelector("button[onclick='swapInput()']"));
        disableButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement text2= driver.findElement(By.xpath("//p[@id='message']"));
        String headertext2=text2.getText();
        System.out.println(headertext2);
        System.out.println("The text box is disabled: "+textBox.isDisplayed());

        driver.quit();
     }
    }


package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW070622_3 {
    public static void main(String[] args) throws InterruptedException {
        //HRMS Application Negative Login:
        //Open chrome browser
        //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        //Enter valid username
        //Leave password field empty
        //Click on login button
        //Verify error message with text "Password cannot be empty" is displayed.
    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       //optimum protection click on "Continue anyway
        driver.findElement(By.cssSelector("a#continue-with-click")).click();
        Thread.sleep(2000);
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement login=driver.findElement(By.xpath("//input[@value='LOGIN']"));
        login.click();
       WebElement error=driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
      String errorMessage=error.getText();
        System.out.println(errorMessage);
        if(error.isDisplayed()){
            System.out.println(error.isDisplayed());
            if(errorMessage.equals("Password cannot be empty")) {
                System.out.println("Error message is verified");
            }
        }
driver.quit();
    }
}

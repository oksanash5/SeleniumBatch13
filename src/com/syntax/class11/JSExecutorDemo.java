package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSExecutorDemo {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.cssSelector("a#continue-with-click")).click();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='yellow'",username);
        js.executeScript("arguments[0].style.backgroundColor='pink'",password);

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        //loginButton.click();// if regular click and actions click does not work we cau use JavaScript:
        js.executeScript("arguments[0].click()",loginButton);

    }
}
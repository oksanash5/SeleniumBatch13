package review3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
       // click on alert
        WebElement alert1=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        //handle the alert
       Alert alertX= driver.switchTo().alert();
       Thread.sleep(2000);
       alertX.accept();

    }
}
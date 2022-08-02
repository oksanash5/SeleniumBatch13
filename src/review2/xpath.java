package review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //launch the website
        driver.get("https://demo.guru99.com/insurance/v1/register.php");

       // acces the text box Surname using absolute xpath
      WebElement surname=driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
      surname.sendKeys("sadig");

      WebElement firstName=driver.findElement(By.xpath("//input[@id='user_firstname']"));
      firstName.sendKeys("moaazam");
       //access the wedelement date of birth and print the text on console
      WebElement dateOfBirth=driver.findElement(By.xpath("//label[text()='Date of Birth']"));
        System.out.println(dateOfBirth.getText());
        WebElement lisence=driver.findElement(By.xpath("//label[contains (text(),'Licence Period')]"));
        System.out.println(lisence.getText());
        //access webelement radio buton and click on it
        WebElement radiodaton=driver.findElement(By.xpath("//label[text()='Full']/following-sibling::input"));
        radiodaton.click();

        //acces the textbox
       WebElement phoneNumb= driver.findElement(By.cssSelector("input#user_phone"));
        phoneNumb.sendKeys("+1111222333");
        //access the webelement address street and send the adress
        WebElement address= driver.findElement(By.cssSelector("input[id*=attributes_street]"));
        address.sendKeys("usa");

    }
}

package review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioBtn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");

        WebElement option3=driver.findElement(By.xpath("//input[@value='Option 3']"));
        //check if the radio button is selected
        boolean state=option3.isSelected();
        System.out.println("the state of the radio button is : " + state);

        //check if the radio button is displayed
        boolean displayed=option3.isDisplayed();
        System.out.println("Is the radio button displayed : " + displayed);
        // check if the radio button is enable
        boolean enabled=option3.isEnabled();
        System.out.println("Is the radio button enabled : " + enabled);
       // select the radio button
        option3.click();
        state= option3.isSelected();
        System.out.println("the state of the radio button is : " + state);

    }
}
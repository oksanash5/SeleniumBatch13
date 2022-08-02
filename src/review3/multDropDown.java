package review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multDropDown {
    public static String url = "https://demoqa.com/select-menu";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //to check if the drop down is multiselect
     WebElement mulDD= driver.findElement(By.xpath("//select[@id='cars']"));

        Select select =new Select(mulDD);
        boolean isMultiselect = select.isMultiple();
        System.out.println("the dropdown is multSelect :"+isMultiselect);

        select.selectByIndex(0);
        select.selectByVisibleText("Opel");
        select.selectByValue("saab");
        Thread.sleep(2000);
        select.deselectByVisibleText("Opel");
        Thread.sleep(2000);
        select.deselectAll();
    }
}
package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
     //  HW#1
       //click on leave
       // click on leave list
       // choose from "From calendar"
       // choose from "To calendar"
       // click only on cancelled and rejected checkboxes
      //  uncheck Pending Approval
      //  select IT support from DD
       // click search
       // quit the browser
public class HW072722_1 {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // optimum security
        driver.findElement(By.cssSelector("a#continue-with-click")).click();
        //login action
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin", Keys.TAB);
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Hum@nhrm123", Keys.ENTER);

        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();
        WebElement leaveListButton = driver.findElement(By.linkText("Leave List"));
        leaveListButton.click();

        WebElement fromCalendar = driver.findElement(By.className("ui-datepicker-trigger"));
        fromCalendar.click();
        WebElement monthDD = driver.findElement(By.className("ui-datepicker-month"));
        Select select = new Select(monthDD);
        select.selectByValue("9");

        List<WebElement> fromDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement fromDay:fromDates){
            String dayText= fromDay.getText();
            if(dayText.equals("26")){
                fromDay.click();
                break;
            }
        }
        WebElement toCalendar= driver.findElement(By.id("calToDate"));
        toCalendar.click();

        WebElement toMonth=driver.findElement(By.className("ui-datepicker-month"));
        select=new Select(toMonth);
        select.selectByVisibleText("Nov");

       WebElement toYears=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        select=new Select(toYears);
        select.selectByValue("2022");

        List<WebElement>toDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
       for(WebElement toDays:toDate){
            String toDaysText=toDays.getText();
            if(toDaysText.equals("10")) {
                toDays.click();
                break;
            }
        }
        List<WebElement>optionCheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement option:optionCheckboxes){
            String checkBoxValue=option.getAttribute("value");
            if(checkBoxValue.equals("-1")||checkBoxValue.equals("0")||checkBoxValue.equals("1")){
                option.click();
            }

        }
   WebElement  subUnit=driver.findElement(By.id("leaveList_cmbSubunit"));
        select=new Select(subUnit);
        select.selectByVisibleText("IT Support");

        WebElement searchButton= driver.findElement(By.id("btnSearch"));
        searchButton.click();

       driver.quit();
    }
}
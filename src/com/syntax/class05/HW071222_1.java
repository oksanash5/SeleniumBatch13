package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
//Facebook dropdown verification
        //Open chrome browser
       // Go to "https://www.facebook.com"
       // click on create new account
      //  Verify:
      //  month dd has 12 month options
       // day dd has 31 day options
      //  year dd has 115 year options
       // Select your date of birth
       // Quit browser
public class HW071222_1 {
    public static String url="http://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
WebElement newAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
newAccount.click();
Thread.sleep(2000);
WebElement firstName= driver.findElement(By.cssSelector("input[name='firstname']"));
firstName.sendKeys("Sam");
WebElement lastName=driver.findElement(By.cssSelector("input[name^='last']"));
lastName.sendKeys("Smith");
WebElement userName=driver.findElement(By.xpath("//input[@name='reg_email__']"));
userName.sendKeys("syntax@adfasdfasf.com");
driver.findElement(By.name("reg_email_confirmation__")).sendKeys("syntax@adfasdfasf.com");
driver.findElement(By.id("password_step_input")).sendKeys("whatever");

WebElement month= driver.findElement(By.id("month"));
Select select=new Select(month);
List<WebElement>monthOptins=select.getOptions();
int sizemonth = monthOptins.size();
System.out.println(sizemonth);
if(sizemonth==12){
    System.out.println("Month dd has 12 month options");
}else{
    System.out.println("False");
}
select.selectByVisibleText("Jun");

WebElement day=driver.findElement(By.id("day"));
Select select1=new Select(day);
List<WebElement> dayOption=select1.getOptions();
int sizeday=dayOption.size();
System.out.println(sizeday);
if(sizeday==31){
    System.out.println("Day dd has 31 day options");
}else{
    System.out.println("False");
}
select1.selectByValue("17");

WebElement year=driver.findElement(By.id("year"));
Select select2=new Select(year);
List<WebElement>yearOptions=select2.getOptions();
int yearsize=yearOptions.size();
System.out.println(yearOptions.size());
if (yearsize==115){
    System.out.println("Year dd has 115 year options");
}else{
    System.out.println("False");
}
select2.selectByValue("1995");

driver.quit();

    }
}

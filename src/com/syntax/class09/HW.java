package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
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
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButoon=driver.findElement(By.xpath("//input[@value='LOGIN']"));
        loginButoon.click();
        //navigating to add employee page
        WebElement pimButton=driver.findElement(By.xpath("//b[text()='PIM']"));
        pimButton.click();

        WebElement addEmployeeButton=driver.findElement(By.linkText("Add Employee"));
        addEmployeeButton.click();
         //adding an employee and saving
        WebElement firstName= driver.findElement(By.id("firstName"));
        firstName.sendKeys("Merilyn");
        WebElement lastName=driver.findElement(By.id("lastName"));
        lastName.sendKeys("Monroe");
        WebElement epmIdField= driver.findElement(By.id("employeeId"));
        String empID= epmIdField.getAttribute("value");
        System.out.println(empID);
        WebElement saveButton= driver.findElement(By.id("btnSave"));
        saveButton.click();

        WebElement employeeListButton= driver.findElement(By.linkText("Employee List"));
        employeeListButton.click();

        boolean employeeNotFound = true;
       while(employeeNotFound) {
           List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));// reinitialize all the element because the page gets refreshed
       for(int i=0; i<tableRows.size(); i++){
           String rowText=tableRows.get(i).getText();
           if(tableRows.contains(empID)){//compare the empID
               employeeNotFound=false;//// set the boolean as false
               WebElement checkBox=driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr["+i+"]/td[1]"));//// identify the checkbox
               checkBox.click();
               // delete person we just added
               WebElement deleteButton=driver.findElement(By.id("btnDelete"));
               deleteButton.click();
               WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
               confirmDelete.click();
               break;
           }
       }
      if(employeeNotFound){
          WebElement nextButton= driver.findElement(By.linkText("Next"));
          nextButton.click();
      }
    }
  }
}
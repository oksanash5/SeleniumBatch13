package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommand {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement ageRadioButton= driver.findElement(By.cssSelector("input[value='5 - 15']"));


       boolean isAgeRadioButton= ageRadioButton.isEnabled();
        System.out.println(isAgeRadioButton);

        boolean isAgeRadioButtonDisplay=ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioButtonDisplay);

        boolean isSelectedButtonSelected=ageRadioButton.isSelected();//check if it selected
        System.out.println("Before Cliking "+isSelectedButtonSelected);// false

        ageRadioButton.click();
        isSelectedButtonSelected=ageRadioButton.isSelected();// reassing//re-check// without reassing still will be false
        System.out.println("After cliking "+isSelectedButtonSelected);//true

        driver.quit();
    }
}

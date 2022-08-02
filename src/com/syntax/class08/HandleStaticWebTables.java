package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTables {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rowData.size());

        Iterator<WebElement> it = rowData.iterator();
        while (it.hasNext()) {
            WebElement row = it.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }
        System.out.println("__________________");

        List<WebElement> colsData = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        for (WebElement colData : colsData) {
            String colText = colData.getText();
            System.out.println(colText);
        }
            System.out.println("_________________");
            List<WebElement> colsData1 = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
            for (WebElement colData1 : colsData1) {
                String colText1 = colData1.getText();
                System.out.println(colText1);

            }
        }
        ////table[@id='task-table']/tbody/tr/td[2]/  only 2 columns
    }
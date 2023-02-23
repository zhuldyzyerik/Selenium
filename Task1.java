package Hw2class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        /*
        HW1:
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
         */
        //connect to WebDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // initate the instance of Webdriver
        WebDriver driver=new ChromeDriver();
        //open parabank page
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        // maximize the window
        driver.manage().window().maximize();
//click on register
        driver.findElement(By.className("button")).click();
//close the browser
        driver.quit();



    }
}

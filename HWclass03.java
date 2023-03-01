package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HWclass03 {
    public static void main(String[] args) {
        /* go to: http://practice.syntaxtechs.net/basic-first-form-demo.php
 enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL
   */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // open up website
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        //enter the message in the text box
        driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']")).sendKeys("I love Selenium");
       //click on show massage
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        //Enter value of a
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("8");
        //Enter value of b
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("10");
        //click on the button get total
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();

      //also please print the value of the attribute type of the button GET TOTAL
        WebElement buttonclick= driver.findElement(By.xpath("//button[text() = 'Get Total']"));

        buttonclick.click();
        System.out.println(buttonclick.getText());









        }
    }


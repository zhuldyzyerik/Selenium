package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class04Hw1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the check box    "click on this check box" is Selected
if no  Select the check box
check again if the checkbox is Selected or not
         */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        WebElement checkbox = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean checkboxSelected = checkbox.isSelected();
        System.out.println("the check box is: " + checkboxSelected);
        if (!checkboxSelected) {
            checkbox.click();
            //check again if the checkbox is Selected or not
            checkboxSelected = checkbox.isSelected();
            System.out.println("the status of selection is: " + checkboxSelected);

        }
    }

}
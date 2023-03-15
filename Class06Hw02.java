package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class06Hw02 {
    public static void main(String[] args) {
        /*
        1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
2.Switch to the iframe on the page
3.Clear the existing text in the  editor inside the iframe
4.Enter the text "Hello World!" in the editor inside the iframe
5.Switch back to the main page
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/iframe");
        //Switch to the iframe on the page
        WebElement frame1=driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        driver.switchTo().frame(frame1);
        //Clear the existing text in the  editor inside the iframe
        WebElement text =driver.findElement(By.xpath("//body[@id='tinymce']"));
        text.clear();
        //Enter the text "Hello World!" in the editor inside the iframe
        text.sendKeys("Hello World!");
        //Switch back to the main page
        driver.switchTo().defaultContent();


    }
}

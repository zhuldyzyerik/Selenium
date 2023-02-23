package Hw2class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /*

navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser

TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements
also u will need a Thread.sleep after clicking on create new account 🙂
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //click on create new account
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);


        //fill up all textboxes
        driver.findElement(By.name("firstname")).sendKeys("Zhuldyz");
driver.findElement(By.name("lastname")).sendKeys("Yerik");
driver.findElement(By.name("reg_email__")).sendKeys("zhuldyz.yerik@gmail.com");
driver.findElement(By.name("reg_email_confirmation__")).sendKeys("zhuldyz.yerik@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("123456@");

//click on sign up button
driver.findElement(By.name("websubmit")).click();
Thread.sleep(2000);
//close the pop up
driver.findElement(By.xpath("//img[@class = '_8idr img']")).click();
Thread.sleep(2000);

        driver.quit();

    }
}

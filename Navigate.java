package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {


    //connect to WebDriver
    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

    // initate the instance of Webdriver
        WebDriver driver=new ChromeDriver();
        //open google.com
        driver.get("https://google.com");
        //slow down
        Thread.sleep(2000);

        //now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        //slow down
        Thread.sleep(2000);

        // go back
        driver.navigate().back();
        //slow down
        Thread.sleep(2000);
        // go to facebook
        driver.navigate().forward();
        //slow down
        Thread.sleep(2000);
//refresh the page
        driver.navigate().refresh();
//close the browser
        driver.close();





}}

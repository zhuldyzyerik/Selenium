package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1Selenium {
    public static void main(String[] args) {
        /*
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        //get the title of the webpage
        String title = driver.getTitle();
//print the title of the page
        System.out.println("the title of the page is " + title);
        // get the current URL that is there in the browser
        String URL = driver.getCurrentUrl();
        //print out URL
        System.out.println(URL);


    }
}
